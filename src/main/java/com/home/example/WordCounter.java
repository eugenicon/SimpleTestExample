package com.home.example;

import java.util.ArrayList;
import java.util.List;

public class WordCounter {
    public List<String> readWords(String sentence) {
        List<String> words = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                words.add(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
        }
        return words;
    }
}
