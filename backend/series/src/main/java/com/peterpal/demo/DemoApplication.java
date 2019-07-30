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

            seriesRepository.save(ScreenFun.builder().title("Game of Thrones").rating(9.5).genre(Genre.FANTASY)
                    .year(2011).plot("Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.").runtime(57).poster("https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_SX300.jpg")
                    .staff(Arrays.asList("David Benioff", "D.B. Weiss")).actors(Arrays.asList("Peter Dinklage", "Lena Headey", "Emilia Clarke", "Kit Harington"))
                    .link("").build());

            seriesRepository.save(ScreenFun.builder().title("Airwolf").rating(6.8).genre(Genre.ADVENTURE)
                    .year(1984).plot("As part of a deal with an intelligence agency to look for his missing brother, a renegade pilot goes on missions with an advanced battle helicopter.").runtime(60).poster("https://m.media-amazon.com/images/M/MV5BODYyY2EwNTYtMmY3Mi00MWRkLWJlYjEtNmJhMmIzNDU0ZGE4XkEyXkFqcGdeQXVyNjExODE1MDc@._V1_SX300.jpg")
                    .staff(Arrays.asList("Donald P. Bellisario")).actors(Arrays.asList("Jan-Michael Vincent", "Alex Cord", "Ernest Borgnine", "Jean Bruce Scott"))
                    .link("").build());

            seriesRepository.save(ScreenFun.builder().title("Homeland").rating(8.3).genre(Genre.CRIME)
                    .year(2011).plot("A bipolar CIA operative becomes convinced a prisoner of war has been turned by al-Qaeda and is planning to carry out a terrorist attack on American soil.").runtime(55).poster("https://m.media-amazon.com/images/M/MV5BZjNiOTA4YTEtYmE0Ni00Mzg4LTg1OTgtNTE0YWE3YTc0MDVhXkEyXkFqcGdeQXVyNjc3OTUzNzM@._V1_SX300.jpg")
                    .staff(Arrays.asList("Alex Gansa", "Howard Gordon")).actors(Arrays.asList("Claire Danes", "Mandy Patinkin", "Rupert Friend", "Maury Sterling"))
                    .link("").build());

//            seriesRepository.save(ScreenFun.builder().title("").rating().genre()
//                    .year().plot("").runtime().poster("")
//                    .staff(Arrays.asList("")).actors(Arrays.asList(""))
//                    .link("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").rating().genre()
//                    .year().plot("").runtime().poster("")
//                    .staff(Arrays.asList("")).actors(Arrays.asList(""))
//                    .link("").build());

//            seriesRepository.save(ScreenFun.builder().title("").rating().genre()
//                    .year().plot("").runtime().poster("")
//                    .staff(Arrays.asList("")).actors(Arrays.asList(""))
//                    .link("").build());



        };
    }


}
