package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static com.tsystems.autotestuni.basic.CollectionsBasic.continents;
import static com.tsystems.autotestuni.basic.CollectionsBasic.createListOfPower2;
import static com.tsystems.autotestuni.basic.CollectionsBasic.uniqueWords;
import static org.junit.jupiter.api.Assertions.*;

class CollectionsBasicTest {

    @Test
    void createListOfPower2Test() {
        List<Integer> expected = List.of();
        assertEquals(expected, createListOfPower2(-3));
        assertEquals(expected, createListOfPower2(0));

        expected = List.of(1, 2, 4, 8, 16);
        assertEquals(expected, createListOfPower2(5));

        expected = List.of(1, 2, 4, 8, 16, 32, 64, 128, 256, 512);
        assertEquals(expected, createListOfPower2(10));

        expected = List.of(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1_024,
                2_048, 4_096, 8_192, 16_384, 32_768, 65_536);
        assertEquals(expected, createListOfPower2(17));
    }

    @Test
    void uniqueWordsTest() {
        Set<String> expected = new TreeSet<>(Set.of("OH", "YES"));
        assertEquals(expected, uniqueWords("Oh, yes, yes, yes!"));

        expected = new TreeSet<>(Set.of("A", "ALL", "IN", "LIVE", "SUBMARINE", "WE", "YELLOW"));
        assertEquals(expected,
                uniqueWords("We all live in a yellow submarine, yellow submarine, yellow submarine"));

        expected = new TreeSet<>(Set.of("A", "AFTER", "AWAY", "CHASE", "GIMME", "HELP", "MAN", "ME",
                "MIDNIGHT", "SHADOWS", "SOMEBODY", "THE", "WON'T"));
        assertEquals(expected,
                uniqueWords("Gimme, gimme, gimme a man after midnight " +
                        "Won't somebody help me chase the shadows away"));
    }

    @Test
    void continentsTest() {
        Map<String, Double> expected = Map.of(
                "Europe", 1.018E8,
                "North America", 2.449E8,
                "Africa", 3.037E8,
                "Asia", 4.382E8,
                "Australia", 9.0085E7,
                "South America", 1.7840E8,
                "Antarctica", 1.372E8);
        assertEquals(expected, continents());
    }
}