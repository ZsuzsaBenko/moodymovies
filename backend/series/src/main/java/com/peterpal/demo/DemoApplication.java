package com.peterpal.demo;

import com.peterpal.demo.model.Genre;
import com.peterpal.demo.model.ScreenFun;
import com.peterpal.demo.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class DemoApplication {

    @Autowired
    SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner init() {
        return args -> {
            seriesRepository.deleteAll();
            seriesRepository.save(ScreenFun.builder().title("valami").rating(5).genre(Genre.DRAMA)
                    .year(1995).plot("plot").runtime(55).poster("poster")
                    .staff(Arrays.asList("s1", "s2")).actors(Arrays.asList("a1", "a2"))
                    .link("link").build());

        };
    }


}
