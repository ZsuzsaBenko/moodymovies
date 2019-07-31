package com.peterpal.series.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SeriesService {


    Random random = new Random();

    public int randomPicker(int size) {

        return random.nextInt(size);
    }

}
