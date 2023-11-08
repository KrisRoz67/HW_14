package org.myexample;

import java.util.*;

public class KittenStatisticsFunctional {

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
     * Используйте Stream
     * @return Средний возраст котят в виде double.
     */
    public double findKittensAverageAge() {
       return kittens.stream().mapToDouble(Kitten::getAge).average().getAsDouble();
    }


    /**
     * Находит самого старшего котенка в списке.
     * Используйте Stream
     * @return Самый старший котенок в виде Optional.
     */
    public Optional<Kitten> findOldestKitten() {
      //  int maxAge = kittens.stream().mapToInt(Kitten::getAge).max().getAsInt();
        return kittens.stream().max(Comparator.comparing(Kitten::getAge));
    }

    /**
     * Находит самых младших котят в списке.
     * Используйте Stream
     * @return Список самых младших котят.
     */
    public List<Kitten> findYoungestKittens() {
        return kittens.stream().min(Comparator.comparing(Kitten::getAge)).stream().toList();
    }


    /**
     * Находит котят по заданному полу.
     * Используйте Stream
     * @param gender Пол котят (Kitten.Gender).
     * @return Список котят, соответствующих заданному полу.
     */
    public List<Kitten> findKittensAccordingToGender(Kitten.Gender gender) {
            return kittens.stream().filter(kitten -> kitten.getGender()==gender).toList();
    }

    /**
     * Находит котят в заданном диапазоне возрастов.
     * Используйте Stream
     * @param minAge Минимальный возраст.
     * @param maxAge Максимальный возраст.
     * @return Список котят в указанном диапазоне возрастов.
     */
    public List<Kitten> findKittensBetweenAges(int minAge, int maxAge) {
        return kittens.stream().filter(kitten -> kitten.getAge()>=minAge && kitten.getAge()<=maxAge).toList();
    }

    /**
     * Находит первого котенка с заданным именем (регистронезависимо).
     * Используйте Stream
     * @param givenName Заданное имя котенка.
     * @return Первый котенок с указанным именем в виде Optional.
     */
    public Optional<Kitten> findFirstKittenWithGivenName(String givenName) {
        return  kittens.stream().filter(kitten -> kitten.getName().equals(givenName)).findFirst();
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (младшие впереди).
     * Используйте Stream
     * @return Список котят, отсортированный по возрасту (младшие впереди).
     */
    public List<Kitten> kittensSortedByAgeYoungerFirst() {

        return kittens.stream().sorted((kitten1,kitten2)-> Integer.compare(kitten1.getAge(), kitten2.getAge())).toList();
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (старшие впереди).
     * Используйте Stream
     * @return Список котят, отсортированный по возрасту (старшие впереди).
     */
    public List<Kitten> kittensSortedByAgeOlderFirst() {
        return kittens.stream().sorted((kitten1,kitten2)-> Integer.compare(kitten2.getAge(), kitten1.getAge())).toList();

    }

}
