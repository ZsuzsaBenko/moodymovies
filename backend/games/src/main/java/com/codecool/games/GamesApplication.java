package com.codecool.games;

import com.codecool.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Random;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class GamesApplication {

    @Autowired
    private GameRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(GamesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Random random() {
        return new Random();
    }

//    @Bean
//    @Profile("production")
//    public CommandLineRunner init() {
//        return args -> {
//
//            ScreenFun action1 = ScreenFun.builder()
//                    .funType("game")
//                    .genre(Genre.ACTION)
//                    .title("")
//                    .year()
//                    .director()
//                    .producer()
//                    .actors(Arrays.asList())
//                    .runtime()
//                    .rating()
//                    .plot()
//                    .trailer()
//                    .poster()
//                    .build();
//
//            ScreenFun action2 = ScreenFun.builder()
//                    .funType("game")
//                    .genre(Genre.ACTION)
//                    .title("")
//                    .year()
//                    .director()
//                    .producer()
//                    .actors(Arrays.asList())
//                    .runtime()
//                    .rating()
//                    .plot()
//                    .trailer()
//                    .poster()
//                    .build();
//
//            ScreenFun action3 = ScreenFun.builder()
//                    .funType("game")
//                    .genre(Genre.ACTION)
//                    .title("")
//                    .year()
//                    .director()
//                    .producer()
//                    .actors(Arrays.asList())
//                    .runtime()
//                    .rating()
//                    .plot()
//                    .trailer()
//                    .poster()
//                    .build();
//
//            repository.saveAll(Arrays.asList(action1, action2, action3))
//        };
//    }
}
