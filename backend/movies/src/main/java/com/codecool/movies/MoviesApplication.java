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

            ScreenFun sample = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ACTION)
                    .year(2004)
                    .rating(7.88)
                    .runtime(24)
                    .title("sample")
                    .actors(Arrays.asList("sample", "sample", "sample"))
                    .director("sample")
                    .producer("sample")
                    .plot("sample")
                    .poster("sample.jpg")
                    .trailer("https://www.youtube.com/embed/dg5-XXa0RyE")
                    .build();

            movieRepository.saveAll(Arrays.asList());
        };
    }
}
