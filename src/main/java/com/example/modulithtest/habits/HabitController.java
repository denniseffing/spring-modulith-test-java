package com.example.modulithtest.habits;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
public class HabitController {

    @GetMapping("/habits")
    Flux<Habit> getHabits() {
        var schedule = Schedule.builder()
                               .frequency(Schedule.Frequency.WEEKLY)
                               .repetitions(5)
                               .build();

        return Flux.just(
                Habit.builder()
                     .id(UUID.randomUUID())
                     .name("Jogging")
                     .schedule(schedule)
                     .build()
        );
    }
}
