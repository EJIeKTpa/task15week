package ru.kk.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController {
    @GetMapping("/translate-day") //http://localhost:8080/translate-day?englishDay=TUESDAY
    public String translateDay(@RequestParam(defaultValue = "MONDAY") String englishDay) {
        String russianDay = DayOfWeek.translateToRussian(englishDay);
        return String.format("Сегодня: %s!", russianDay);
    }
}
