package com.home.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

// example junit5 + params
public class WordCounterTestJunit5 {

    @ParameterizedTest(name = "Run {index}: sentence={0}, expectedWordsCount={1}")
    @MethodSource("testData")
    public void testRequestLoan(String sentence, int expectedWords) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.readWords(sentence);
        assertEquals(expectedWords, words.size());
    }

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("qwe", 1),
                Arguments.of("qwe asd", 2),
                Arguments.of("-http://ec2-52-27-141-35.us-west-2.compute.amazonaws.com/problem/55e0503da8c477f14bf7043d", 14)
        );
    }
}