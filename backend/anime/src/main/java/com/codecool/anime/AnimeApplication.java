package com.codecool.anime;

import com.codecool.anime.model.Genre;
import com.codecool.anime.model.ScreenFun;
import com.codecool.anime.repository.AnimeRepository;
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

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class AnimeApplication {

    @Autowired
    private AnimeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AnimeApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/anime/**"))
                .build();
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {

            ScreenFun fumoffu = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.COMEDY)
                    .title("Full Metal Panic? Fumoffu")
                    .actors(Arrays.asList("Seki Tomokazu", "Yukino Satsuki", "Yukana"))
                    .runtime(24)
                    .rating(8.2)
                    .plot("It's back-to-school mayhem with Kaname Chidori and her war-freak classmate Sousuke Sagara.")
                    .director("Takemoto Yasuhiro")
                    .producer("Hatta Youko")
                    .poster("fumoffu.jpg")
                    .trailer("https://www.youtube.com/embed/rYHyGKZdw2o")
                    .year(2003)
                    .build();

            ScreenFun bleach = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ACTION)
                    .year(2004)
                    .rating(7.8)
                    .runtime(24)
                    .title("Bleach")
                    .actors(Arrays.asList("Matsuoka Yuki", "Orikasa Fumiko", "Tachiki Fumihiko"))
                    .director("Abe Noriyuki")
                    .producer("Ishihama Masashi")
                    .plot("Ichigo Kurosaki is an ordinary high schooler - until his family is attacked by a Hollow.")
                    .poster("bleach.jpg")
                    .trailer("https://www.youtube.com/embed/dg5-XXa0RyE")
                    .build();

            repository.save(bleach);
            repository.save(fumoffu);
        };
    }

}
