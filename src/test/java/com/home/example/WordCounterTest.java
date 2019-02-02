package com.home.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

// example junit4 + pl.pragmatistsJUnitParams
@RunWith(JUnitParamsRunner.class)
public class WordCounterTest {
    @Test
    @Parameters(method = "countWordsData")
    public void testCountWords(String sentence, int expectedWords) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.readWords(sentence);
        assertEquals(expectedWords, words.size());
    }

    @SuppressWarnings("unused")
    private static Object[][] countWordsData() {
        return new Object[][] {
                { "qwe", 1 },
                { "qwe asd", 2},
                { "-http://ec2-52-27-141-35.us-west-2.compute.amazonaws.com/problem/55e0503da8c477f14bf7043d", 14 }
        };
    }
}
