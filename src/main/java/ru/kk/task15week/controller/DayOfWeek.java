package ru.kk.task15week.controller;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private final String russianName;


    DayOfWeek(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
    public static String translateToRussian(String englishDay) {
        try {
            return DayOfWeek.valueOf(englishDay.toUpperCase()).getRussianName();
        } catch (IllegalArgumentException e) {
            return "Day not found";
        }
    }
}
