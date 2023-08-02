package com.example.modulithtest.habits;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Habit {
    private UUID id;
    private String name;
    private Schedule schedule;
}
