package org.myexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class KittenStatisticsFunctionalTest {

    KittenStatisticsFunctional functional = new KittenStatisticsFunctional();
    List<Kitten> kittens = new ArrayList<>(List.of(
            new Kitten("Bob", Kitten.Gender.MALE, 8),
            new Kitten("Alice", Kitten.Gender.FEMALE, 3),
            new Kitten("Coconut", Kitten.Gender.MALE, 7)));

    @BeforeEach
    void setTheList() {
        functional.setKittens(kittens);
    }

    @Test
    void findKittensAverageAge() {
        assertEquals(6, functional.findKittensAverageAge());

    }

    @Test
    void findOldestKitten() {
        assertEquals("Bob", functional.findOldestKitten().get().getName());
    }

    @Test
    void findYoungestKittens() {
        List<Kitten> youngestKitten = new ArrayList<>(List.of(new Kitten("Alice", Kitten.Gender.FEMALE, 3)));
        assertEquals(youngestKitten, functional.findYoungestKittens());
    }

    @Test
    void findKittensAccordingToGender() {
        List<Kitten> kittenAccordingToGender = new ArrayList<>(List.of(new Kitten("Alice", Kitten.Gender.FEMALE, 3)));
        assertEquals(kittenAccordingToGender, functional.findKittensAccordingToGender(Kitten.Gender.FEMALE));
    }

    @Test
    void findKittensBetweenAges() {
        List<Kitten> kittensBetweenAges = new ArrayList<>(List.of(new Kitten("Alice", Kitten.Gender.FEMALE, 3),
                new Kitten("Coconut", Kitten.Gender.MALE, 7)));
        assertEquals(kittensBetweenAges, functional.findKittensBetweenAges(2, 7));
    }

    @Test
    void findFirstKittenWithGivenName() {
        Optional<Kitten> kittenWithGivenName = Optional.of(new Kitten("Coconut", Kitten.Gender.MALE, 7));
        assertEquals(kittenWithGivenName, functional.findFirstKittenWithGivenName("Coconut"));

    }

    @Test
    void kittensSortedByAgeYoungerFirst() {
        List<Kitten> kittenssorted = new ArrayList<>(List.of(
                new Kitten("Alice", Kitten.Gender.FEMALE, 3),
                new Kitten("Coconut", Kitten.Gender.MALE, 7),
                new Kitten("Bob", Kitten.Gender.MALE, 8)));
        assertEquals(kittenssorted, functional.kittensSortedByAgeYoungerFirst());
    }

    @Test
    void kittensSortedByAgeOlderFirst() {
        List<Kitten> kittenssorted = new ArrayList<>(List.of(
                new Kitten("Bob", Kitten.Gender.MALE, 8),
                new Kitten("Coconut", Kitten.Gender.MALE, 7),
                new Kitten("Alice", Kitten.Gender.FEMALE, 3)));
        assertEquals(kittenssorted, functional.kittensSortedByAgeOlderFirst());
    }
}