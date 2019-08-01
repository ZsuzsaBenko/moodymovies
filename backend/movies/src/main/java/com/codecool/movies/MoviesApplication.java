package com.codecool.movies;

import com.codecool.movies.model.Genre;
import com.codecool.movies.model.ScreenFun;
import com.codecool.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class MoviesApplication {

    @Autowired
    private MovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/movies/**"))
                .build();
    }

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {

            ScreenFun avatar = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.SCI_FI)
                    .year(2009)
                    .rating(7.8)
                    .runtime(162)
                    .title("Avatar")
                    .actors(Arrays.asList("Sam Worthington", "Zoe Saldan", "Sigourney Weaver"))
                    .director("James Cameron")
                    .producer("James Cameron")
                    .plot("A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.")
                    .poster("avatar.jpg")
                    .trailer("https://www.youtube.com/embed/6ziBFh3V1aM")
                    .build();

            ScreenFun sleepyHollow = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.HORROR)
                    .year(1999)
                    .rating(7.4)
                    .runtime(105)
                    .title("Sleepy Hollow")
                    .actors(Arrays.asList("Johnny Depp", "Christina Ricci"))
                    .director("Tim Burton")
                    .producer("Francis Ford Coppola")
                    .plot("New York detective Ichabod Crane is sent to Sleepy Hollow to investigate a series of mysterious deaths in which the victims are found beheaded. But the locals believe the culprit to be none other than the ghost of the legendary Headless Horseman.")
                    .poster("sleepy-hollow.jpg")
                    .trailer("https://www.youtube.com/embed/504uo6f3xEc")
                    .build();

            ScreenFun fiftyFirstDates = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ROMANCE)
                    .year(2004)
                    .rating(6.8)
                    .runtime(99)
                    .title("50 First Dates")
                    .actors(Arrays.asList("Adam Sandler", "Drew Barrymore", "Rob Schneider"))
                    .director("Peter Segal")
                    .producer("Michael Ewing")
                    .plot("Henry Roth is a man afraid of commitment up until he meets the beautiful Lucy. They hit it off and Henry think he's finally found the girl of his dreams, until he discovers she has short-term memory loss and forgets him the next day.")
                    .poster("fifty-first-dates.jpg")
                    .trailer("https://www.youtube.com/embed/Y-9wSAd0dMM")
                    .build();

            ScreenFun lotr = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.FANTASY)
                    .year(2001)
                    .rating(8.8)
                    .runtime(178)
                    .title("The Lord of the Rings - The Fellowship of the Ring")
                    .actors(Arrays.asList("Elijah Wood", "Viggo Mortensen", "Liv Tyler", "Ian McKellen"))
                    .director("Peter Jackson")
                    .producer("Peter Jackson")
                    .plot("A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.")
                    .poster("fellowship-of-the-ring.jpg")
                    .trailer("https://www.youtube.com/embed/aStYWD25fAQ")
                    .build();

            movieRepository.saveAll(Arrays.asList(avatar, sleepyHollow, fiftyFirstDates, lotr));
        };
    }
}
