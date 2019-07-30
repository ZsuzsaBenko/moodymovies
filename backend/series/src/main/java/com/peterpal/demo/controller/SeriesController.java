package com.peterpal.demo.controller;

import com.peterpal.demo.model.ScreenFun;
import com.peterpal.demo.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesRepository seriesRepository;


    @GetMapping("/all")
    public List<ScreenFun> getAllScreenFun() {
        return seriesRepository.findAll();
    }
}
