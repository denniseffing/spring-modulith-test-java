package com.example.modulithtest.habits;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Schedule {
    private Frequency frequency;
    private int repetitions;

    public enum Frequency {
        DAILY, WEEKLY, MONTHLY, YEARLY;
    }
}
