package com.peterpal.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Questionnaire {
    private int masochist;
    private int partOfDay;
    private int gender;
    private int watchingAlone;
    private int age;
    private Mood mood;
    private Horoscope horoscope;
}
