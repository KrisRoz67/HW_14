package org.myexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KittenStatistics {

    private List<Kitten> kittens;

    /**
     * Устанавливает список котят для анализа.
     *
     * @param kittens Список котят.
     */
    public void setKittens(List<Kitten> kittens) {
        this.kittens = kittens;
    }

    /**
     * Находит средний возраст котят в списке.
     * Используйте обычные циклы итд
     *
     * @return Средний возраст котят в виде double.
     */
    public double findKittensAverageAge() {
        int qty = kittens.size();
        int sumOfages = 0;
        for (Kitten kitten : kittens) {
            sumOfages = sumOfages + kitten.getAge();
        }
        return (double) sumOfages / qty;
    }

    /**
     * Находит самого старшего котенка в списке.
     * Используйте обычные циклы итд
     *
     * @return Самый старший котенок в виде Optional.
     */
    public Optional<Kitten> findOldestKitten() {
        int max = 0;
        Optional<Kitten> oldestKitten = Optional.empty();
        for (Kitten value : kittens) {
            int age = value.getAge();
            if (age > max) {
                max = age;
            }
        }
        for (Kitten kitten : kittens) {
            if (kitten.getAge() == max) {
                oldestKitten = Optional.of(kitten);
            }
        }

        return oldestKitten;
    }

    /**
     * Находит самых младших котят в списке.
     * Используйте обычные циклы итд
     *
     * @return Список самых младших котят.
     */
    public List<Kitten> findYoungestKittens() {
        int min = kittens.get(0).getAge();
        List<Kitten> youngestKittens = new ArrayList<>();
        for (Kitten value : kittens) {
            int age = value.getAge();
            if (age < min) {
                min = age;
            }
        }
        for (Kitten kitten : kittens) {
            if (kitten.getAge() == min) {
                youngestKittens.add(kitten);
            }
        }

        return youngestKittens;
    }

    /**
     * Находит котят по заданному полу.
     * Используйте обычные циклы итд
     *
     * @param gender Пол котят (Kitten.Gender).
     * @return Список котят, соответствующих заданному полу.
     */
    public List<Kitten> findKittensAccordingToGender(Kitten.Gender gender) {
        List<Kitten> listOfKittensWithGivenGender = new ArrayList<>();
        for (Kitten kitten : kittens) {
            if (kitten.getGender() == gender) {
                listOfKittensWithGivenGender.add(kitten);
            }
        }
        return listOfKittensWithGivenGender;
    }

    /**
     * Находит котят в заданном диапазоне возрастов.
     * Используйте обычные циклы итд
     *
     * @param minAge Минимальный возраст.
     * @param maxAge Максимальный возраст.
     * @return Список котят в указанном диапазоне возрастов.
     */
    public List<Kitten> findKittensBetweenAges(int minAge, int maxAge) {
        List<Kitten> listOfKittensBetweenAges = new ArrayList<>();
        for (Kitten kitten : kittens) {
            if (kitten.getAge() >= minAge && kitten.getAge() <= maxAge) {
                listOfKittensBetweenAges.add(kitten);
            }
        }
        return listOfKittensBetweenAges;

    }

    /**
     * Находит первого котенка с заданным именем (регистронезависимо).
     * Используйте обычные циклы итд
     *
     * @param givenName Заданное имя котенка.
     * @return Первый котенок с указанным именем в виде Optional.
     */
    public Optional<Kitten> findFirstKittenWithGivenName(String givenName) {
        Optional<Kitten> kittenWthGivenName = Optional.empty();
        for (Kitten kitten : kittens) {
            if (kitten.getName().equals(givenName)) {
                kittenWthGivenName = Optional.of(kitten);
                break;
            }
        }
        return kittenWthGivenName;
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (младшие впереди).
     * Используйте обычные циклы итд
     *
     * @return Список котят, отсортированный по возрасту (младшие впереди).
     */
    public List<Kitten> kittensSortedByAgeYoungerFirst() {
        List<Kitten> kittens1 = new ArrayList<>(kittens);
        for (int i = 0; i < kittens1.size(); i++) {
            for (int j = 1; j < kittens1.size() - i; j++) {
                Kitten kitten1 = kittens1.get(j - 1);
                Kitten kitten2 = kittens1.get(j);
                if (kitten1.getAge() > kitten2.getAge()) {
                    kittens1.set(j - 1, kitten2);
                    kittens1.set(j, kitten1);
                }
            }
        }
        return kittens1;
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (старшие впереди).
     * Используйте обычные циклы итд
     *
     * @return Список котят, отсортированный по возрасту (старшие впереди).
     */
    public List<Kitten> kittensSortedByAgeOlderFirst() {
        List<Kitten> kittens1 = new ArrayList<>(kittens);
        for (int i = 0; i < kittens1.size(); i++) {
            for (int j = 1; j < kittens1.size() - i; j++) {
                Kitten kitten1 = kittens1.get(j - 1);
                Kitten kitten2 = kittens1.get(j);
                if (kitten1.getAge() < kitten2.getAge()) {
                    kittens1.set(j - 1, kitten2);
                    kittens1.set(j, kitten1);
                }
            }
        }
        return kittens1;

    }
}
