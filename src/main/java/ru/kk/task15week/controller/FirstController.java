package ru.kk.task15week.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/translate-day")
    public String translateDay(@RequestParam(value = "day", defaultValue = "MONDAY") String day) {
        String russianDay = DayOfWeek.translateToRussian(day);
        return String.format("Сегодня: %s!", russianDay);
    }
}
