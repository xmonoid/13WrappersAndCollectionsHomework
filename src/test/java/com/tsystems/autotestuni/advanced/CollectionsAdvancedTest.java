package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static com.tsystems.autotestuni.advanced.CollectionsAdvanced.enqueueEmployees;
import static com.tsystems.autotestuni.advanced.CollectionsAdvanced.howManyWordsInText;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsAdvancedTest {

    @Test
    void howManyWordsInTextTest() {
        String text = "We will we will rock you! We will we will rock you!";
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("WE", 4);
        expected.put("WILL", 4);
        expected.put("ROCK", 2);
        expected.put("YOU", 2);
        assertEquals(expected, howManyWordsInText(text));

        text = "I've paid my dues\n" +
                "Time after time.\n" +
                "I've done my sentence\n" +
                "But committed no crime.\n" +
                "\n" +
                "And bad mistakes\n" +
                "I've made a few.\n" +
                "I've had my share of sand kicked in my face\n" +
                "But I've come through.\n" +
                "\n" +
                "And I need to go on and on, and on, and on.\n" +
                "\n" +
                "We are the champions, my friends.\n" +
                "And we'll keep on fighting 'til the end.\n" +
                "We are the champions.\n" +
                "We are the champions.\n" +
                "No time for losers\n" +
                "'Cause we are the champions of the world.\n" +
                "\n" +
                "I've taken my bows,\n" +
                "And my curtain calls.\n" +
                "You brought me fame and fortune, and everything that goes with it.\n" +
                "I thank you all.\n" +
                "\n" +
                "But it's been no bed of roses,\n" +
                "No pleasure cruise.\n" +
                "I consider it a challenge before the whole human race,\n" +
                "And I ain't gonna lose.\n" +
                "\n" +
                "And I need just go on and on, and on, and on.\n" +
                "\n" +
                "We are the champions, my friends.\n" +
                "And we'll keep on fighting 'til the end.\n" +
                "We are the champions.\n" +
                "We are the champions.\n" +
                "No time for losers\n" +
                "'Cause we are the champions of the world.\n" +
                "\n" +
                "We are the champions, my friends,\n" +
                "And we'll keep on fighting 'til the end.\n" +
                "We are the champions.\n" +
                "We are the champions.\n" +
                "No time for losers\n" +
                "'Cause we are the champions.";

        expected = new LinkedHashMap<>();
        expected.put("I'VE", 6);
        expected.put("PAID", 1);
        expected.put("MY", 9);
        expected.put("DUES", 1);
        expected.put("TIME", 5);
        expected.put("AFTER", 1);
        expected.put("DONE", 1);
        expected.put("SENTENCE", 1);
        expected.put("BUT", 3);
        expected.put("COMMITTED", 1);
        expected.put("NO", 6);
        expected.put("CRIME", 1);
        expected.put("AND", 16);
        expected.put("BAD", 1);
        expected.put("MISTAKES", 1);
        expected.put("MADE", 1);
        expected.put("A", 2);
        expected.put("FEW", 1);
        expected.put("HAD", 1);
        expected.put("SHARE", 1);
        expected.put("OF", 4);
        expected.put("SAND", 1);
        expected.put("KICKED", 1);
        expected.put("IN", 1);
        expected.put("FACE", 1);
        expected.put("COME", 1);
        expected.put("THROUGH", 1);
        expected.put("I", 5);
        expected.put("NEED", 2);
        expected.put("TO", 1);
        expected.put("GO", 2);
        expected.put("ON", 11);
        expected.put("WE", 12);
        expected.put("ARE", 12);
        expected.put("THE", 18);
        expected.put("CHAMPIONS", 12);
        expected.put("FRIENDS", 3);
        expected.put("WE'LL", 3);
        expected.put("KEEP", 3);
        expected.put("FIGHTING", 3);
        expected.put("'TIL", 3);
        expected.put("END", 3);
        expected.put("FOR", 3);
        expected.put("LOSERS", 3);
        expected.put("'CAUSE", 3);
        expected.put("WORLD", 2);
        expected.put("TAKEN", 1);
        expected.put("BOWS", 1);
        expected.put("CURTAIN", 1);
        expected.put("CALLS", 1);
        expected.put("YOU", 2);
        expected.put("BROUGHT", 1);
        expected.put("ME", 1);
        expected.put("FAME", 1);
        expected.put("FORTUNE", 1);
        expected.put("EVERYTHING", 1);
        expected.put("THAT", 1);
        expected.put("GOES", 1);
        expected.put("WITH", 1);
        expected.put("IT", 2);
        expected.put("THANK", 1);
        expected.put("ALL", 1);
        expected.put("IT'S", 1);
        expected.put("BEEN", 1);
        expected.put("BED", 1);
        expected.put("ROSES", 1);
        expected.put("PLEASURE", 1);
        expected.put("CRUISE", 1);
        expected.put("CONSIDER", 1);
        expected.put("CHALLENGE", 1);
        expected.put("BEFORE", 1);
        expected.put("WHOLE", 1);
        expected.put("HUMAN", 1);
        expected.put("RACE", 1);
        expected.put("AIN'T", 1);
        expected.put("GONNA", 1);
        expected.put("LOSE", 1);
        expected.put("JUST", 1);
        assertEquals(expected, howManyWordsInText(text));
    }

    @Test
    void enqueueEmployeesTest() {
        var johnSmith = new CollectionsAdvanced.Employee(
                LocalDate.of(1970, Month.AUGUST, 12),
                LocalDate.of(2020, Month.JUNE, 6),
                "John Smith");
        var elizabethSchwarz = new CollectionsAdvanced.Employee(
                LocalDate.of(1991, Month.SEPTEMBER, 3),
                LocalDate.of(2019, Month.JANUARY, 10),
                "Elizabeth Schwarz");
        var joanWalker = new CollectionsAdvanced.Employee(
                LocalDate.of(1986, Month.NOVEMBER, 29),
                LocalDate.of(2015, Month.MAY, 5),
                "Joan Walker");
        var rupertJohnson = new CollectionsAdvanced.Employee(
                LocalDate.of(1977, Month.MARCH, 17),
                LocalDate.of(2010, Month.FEBRUARY, 28),
                "Rupert Johnson");

        Set<CollectionsAdvanced.Employee> employees = Set.of(johnSmith, joanWalker, elizabethSchwarz, rupertJohnson);

        Queue<CollectionsAdvanced.Employee> expected = new LinkedList<>();
        expected.add(johnSmith);
        expected.add(rupertJohnson);
        expected.add(joanWalker);
        expected.add(elizabethSchwarz);

        Queue<CollectionsAdvanced.Employee> enqueueEmployees = enqueueEmployees(employees, false);
        Queue<CollectionsAdvanced.Employee> actual = new LinkedList<>();
        while (!enqueueEmployees.isEmpty()) {
            actual.add( enqueueEmployees.poll() );
        }
        actual.forEach(System.out::println);
        assertEquals(expected, actual);

        expected = new LinkedList<>();
        expected.add(rupertJohnson);
        expected.add(joanWalker);
        expected.add(elizabethSchwarz);
        expected.add(johnSmith);

        enqueueEmployees = enqueueEmployees(employees, true);
        actual = new LinkedList<>();
        while (!enqueueEmployees.isEmpty()) {
            actual.add( enqueueEmployees.poll() );
        }
        actual.forEach(System.out::println);
        assertEquals(expected, actual);
    }
}