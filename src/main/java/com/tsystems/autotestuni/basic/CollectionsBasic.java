package com.tsystems.autotestuni.basic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class CollectionsBasic {

    /**
     * Write a method to instantiate an object of type {@link List} and fill it with
     * the first n-th powers of two (2^n).
     * If n is negative or zero, return an empty list.
     *
     * (-3) -> []
     * (0)  -> []
     * (5)  -> [1, 2, 4, 8, 16]
     * (10) -> [1, 2, 4, 8, 16, 32, 64, 128, 256, 512]
     *
     * @param n length of the list
     * @return the list of powers of two
     */
    public static List<Integer> createListOfPower2(int n) {
        List<Integer> result = new LinkedList<>();

        int powersOfTwo = 1;
        for (int i = 0; i < n; i++) {
            result.add(powersOfTwo);
            powersOfTwo *= 2;
        }

        return result;
    }

    /**
     * Write a method which returns a set of unique words in a text passed as a parameter.
     * The set should contain words in upper case only. The words should be in alphabetical order.
     *
     * "Oh, yes, yes, yes!" -> ["OH", "YES"]
     * "We all live in a yellow submarine, yellow submarine, yellow submarine" ->
     *     ["A", "ALL", "IN", "LIVE", "SUBMARINE", "WE", "YELLOW"]
     *
     * Hint: split the String into tokens first, perhaps using {@link java.util.StringTokenizer}.
     *
     * @param text a random text
     * @return a set of unique words in the text
     */
    public static Set<String> uniqueWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.!?\n");
        Set<String> result = new TreeSet<>();

        while (tokenizer.hasMoreTokens()) {
            result.add(tokenizer.nextToken().toUpperCase());
        }

        return result;
    }

    /**
     * The list of continents, along with their sizes (in square kilometres) is as follows:
     *  (Europe, 1.018 x10^8), (North America, 2.449 x10^8), (Africa, 3.037 x10^8), (Asia, 4.382 x10^8),
     *  (Australia, 9.0085 x10^7), (South America, 1.7840 x10^8), and (Antarctica, 1.372 x10^8).
     *
     * Write a method which creates a map of these pairs of data, with the continent name as the key
     * and the size as a value.
     *
     * @return map of pairs ["continent name" : "size"]
     */
    public static Map<String, Double> continents() {
        Map<String, Double> result = new HashMap<>();

        result.put("Europe", 1.018E8);
        result.put("North America", 2.449E8);
        result.put("Africa", 3.037E8);
        result.put("Asia", 4.382E8);
        result.put("Australia", 9.0085E7);
        result.put("South America", 1.7840E8);
        result.put("Antarctica", 1.372E8);

        return result;
    }
}
