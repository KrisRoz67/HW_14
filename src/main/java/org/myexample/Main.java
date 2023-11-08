package org.myexample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        KittenStatisticsFunctional func = new KittenStatisticsFunctional();
        KittenStatistics stat = new KittenStatistics();
        List<Kitten> kittens = List.of(new Kitten("Murzik", Kitten.Gender.MALE, 16),
                new Kitten("Mia", Kitten.Gender.FEMALE, 13),
                new Kitten("Ryzhik", Kitten.Gender.FEMALE, 11));
        func.setKittens(kittens);
        stat.setKittens(kittens);
        System.out.println("------------With streams----------");
        System.out.println("-------Kittens average age -------------");
        System.out.println(func.findKittensAverageAge());
        System.out.println("-------Sorted by age (younger first ) -------------");
        System.out.println(func.kittensSortedByAgeYoungerFirst());
        System.out.println("-------Sorted by age (older first ) -------------");
        System.out.println(func.kittensSortedByAgeOlderFirst());
        System.out.println("-------First kitten with given name -------------");
        System.out.println(func.findFirstKittenWithGivenName("Mia"));
        System.out.println("-------Kittens between ages -------------");
        System.out.println(func.findKittensBetweenAges(10, 12));
        System.out.println("------ Kittens with given gender -------------");
        System.out.println(func.findKittensAccordingToGender(Kitten.Gender.FEMALE));
        System.out.println("------ The oldest kitten -------------");
        System.out.println(func.findOldestKitten());
        System.out.println("------ The youngest kitten -------------");
        System.out.println(func.findYoungestKittens());
        System.out.println("-----------------");
        System.out.println("-----Without streams-------------");
        System.out.println("-------Kittens average age -------------");
//        System.out.println(stat.findKittensAverageAge());
        System.out.println("-------Sorted by age (younger first ) -------------");
        System.out.println(stat.kittensSortedByAgeYoungerFirst());
        System.out.println("-------Sorted by age (older first ) -------------");
        System.out.println(stat.kittensSortedByAgeOlderFirst());
        System.out.println("-------First kitten with given name -------------");
        System.out.println(stat.findFirstKittenWithGivenName("Mia"));
        System.out.println("-------Kittens between ages -------------");
        System.out.println(stat.findKittensBetweenAges(10, 12));
        System.out.println("------ Kittens with given gender -------------");
        System.out.println(stat.findKittensAccordingToGender(Kitten.Gender.FEMALE));
        System.out.println("------ The oldest kitten -------------");
        System.out.println(stat.findOldestKitten());
        System.out.println("------ The youngest kitten -------------");
        System.out.println(stat.findYoungestKittens());

    }
}
