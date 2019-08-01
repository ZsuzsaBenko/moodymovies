package com.codecool.games;

import com.codecool.games.model.Genre;
import com.codecool.games.model.ScreenFun;
import com.codecool.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;
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

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {

            ScreenFun action1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ACTION)
                    .title("GTA V")
                    .year(2013)
                    .director("Leslie Benzies")
                    .producer("Imran Sarwar")
                    .actors(Arrays.asList("Dan Houser", "Rupert Humphries", "Michael Unsworth"))
                    .runtime(100)
                    .rating(95)
                    .plot("An action-adventure video game developed by Rockstar North and published by Rockstar Games.")
                    .trailer("https://www.youtube.com/embed/hvoD7ehZPcM")
                    .poster("gtav.png")
                    .build();

            ScreenFun action2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ACTION)
                    .title("PlayerUnknown's Battlegrounds")
                    .year(2017)
                    .director("Brendan Greene")
                    .producer("Chang-han Kim")
                    .actors(Arrays.asList("Tae-seok Jang", "Brendan Greene", "Tom Salta"))
                    .runtime(0)
                    .rating(80)
                    .plot("An online multiplayer battle royale game developed and published by PUBG Corporation, a subsidiary of South Korean video game company Bluehole.")
                    .trailer("https://www.youtube.com/embed/ODWCbu_cuqk")
                    .poster("pubg.jpg")
                    .build();

            ScreenFun action3 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ACTION)
                    .title("Custer's Revenge")
                    .year(1982)
                    .director("Mystique")
                    .producer("Mystique")
                    .actors(Arrays.asList("George Armstrong Custer", "Matt Ingoglia", "Arthur Pyott"))
                    .runtime(20)
                    .rating(32)
                    .plot("Atari 2600 game made by Mystique in 1982 that is widely considered offensive due to its plot involving the apparent rape of a Native American woman.")
                    .trailer("https://www.youtube.com/embed/qY2AqKCpGkk")
                    .poster("custersrevenge.jpg")
                    .build();

            ScreenFun comedy1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.COMEDY)
                    .title("The Jackbox Party Pack 5")
                    .year(2018)
                    .director("Jackbox Games")
                    .producer("Jackbox Games")
                    .actors(Arrays.asList("Matulef Jeffrey", "Alice O'Conner"))
                    .runtime(1200)
                    .rating(92)
                    .plot("The Jackbox Party Pack 4, Drawful 2, and Quiplash are our top selection to play today.")
                    .trailer("https://www.youtube.com/embed/uuPY0_8CO6o")
                    .poster("partypack.jpeg")
                    .build();

            ScreenFun comedy2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.COMEDY)
                    .title("Deponia")
                    .year(2012)
                    .director("Daedalic Entertainment")
                    .producer("WW: Lace International")
                    .actors(Arrays.asList("Edna Harvey", "Emily Morganti"))
                    .runtime(1200)
                    .rating(6.27)
                    .plot("A point-and-click adventure, developed and published by Daedalic Entertainment.")
                    .trailer("https://www.youtube.com/embed/KRQhKw-YCWs")
                    .poster("deponia.jpg")
                    .build();

            ScreenFun horror1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.HORROR)
                    .title("Until Dawn")
                    .year(2012)
                    .director("Will Byles")
                    .producer("Pete Samuels")
                    .actors(Arrays.asList("Brandon Kosinski", "Rami Malek"))
                    .runtime(200)
                    .rating(97)
                    .plot("Interactive drama and survival horror video game. Players assume control of eight young adults who have to survive on Blackwood Mountain when their lives are threatened.")
                    .trailer("https://www.youtube.com/embed/4bgIZONHPXA")
                    .poster("untildawn.jpg")
                    .build();

            ScreenFun horror2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.HORROR)
                    .title("Silent Hill 2")
                    .year(2001)
                    .director("Masashi Tsuboyama")
                    .producer("Akihiro Imamura")
                    .actors(Arrays.asList("Akira Yamaoka", "Imamura Akihiro", "Ito Maszahiro"))
                    .runtime(80)
                    .rating(30)
                    .plot("TPS survival horror video game")
                    .trailer("https://www.youtube.com/embed/3wBHSSOkCGQ")
                    .poster("silenthill.jpg")
                    .build();

            ScreenFun documentary1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.DOCUMENTARY)
                    .director("Stainless Steel Studios")
                    .plot("A real-time strategy video game. The game requires players to collect resources to construct buildings, produce citizens, and conquer opposing civilizations. Empire Earth spans 500,000 years of world history, and ending with the nano age.")
                    .poster("empire.jpg")
                    .producer("Sierra On-Line")
                    .rating(72)
                    .runtime(120)
                    .title("Empire Earth")
                    .trailer("https://www.youtube.com/embed/rP4wCFe1_Lo")
                    .year(2001)
                    .actors(Arrays.asList("Ed Lima", "Steve Maitland"))
                    .build();

            ScreenFun documentary2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.DOCUMENTARY)
                    .director("JumpStart")
                    .plot("Online learning game set in a big open world is a cut above.")
                    .poster("jumpstart.jpg")
                    .producer("JumpStart")
                    .rating(20)
                    .runtime(20)
                    .title("JumpStart 3D Virtual World")
                    .trailer("https://www.youtube.com/embed/2h9YntthI5U")
                    .year(2009)
                    .actors(Arrays.asList("Steve Manctuary", "Eleanor McGuffin"))
                    .build();

            ScreenFun drama1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.DRAMA)
                    .director("Karl Morton")
                    .plot("2D artillery turn-based tactics video game. The player controls a team of up to eight worms in combat against opposing teams.")
                    .poster("worms.jpg")
                    .producer("Martyn Brown")
                    .rating(96)
                    .runtime(60)
                    .title("Worms Armageddon")
                    .trailer("https://www.youtube.com/embed/Xl2Oox2a58k")
                    .year(1999)
                    .actors(Arrays.asList("Dan Cartwright", "Bjørn Lynne"))
                    .build();

            ScreenFun drama2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.DRAMA)
                    .director("IO Interactive")
                    .plot("The first installment in the Hitman series revolves around a test subject known as 47 escaping the asylum where he had been experimented on all his life and being employed by the Agency.")
                    .poster("hitman.jpg")
                    .producer("Eidos Interactive")
                    .rating(20)
                    .runtime(20)
                    .title("Hitman: Codename 47")
                    .trailer("https://www.youtube.com/embed/Y7tkK9TRhDY")
                    .year(2000)
                    .actors(Arrays.asList("Peter Gjellerup Koch", "Morten Iversen", "Jesper Kyd"))
                    .build();

            ScreenFun animated1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ANIMATED)
                    .director("Kano/Apps")
                    .plot("Riding a bicycle with a stick figure through a track.")
                    .poster("canvasrider.png")
                    .producer("One More Level")
                    .rating(15)
                    .runtime(5)
                    .title("Canvas Rider")
                    .trailer("https://www.youtube.com/embed/Q91yUSWyeZ0")
                    .year(2013)
                    .actors(Arrays.asList())
                    .build();

            ScreenFun animated2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ANIMATED)
                    .director("Gremlin")
                    .plot("Player maneuvers a line which grows in length, with the line itself being a primary obstacle.")
                    .poster("snake.jpg")
                    .producer("N/A")
                    .rating(98)
                    .runtime(5)
                    .title("SNAKE")
                    .trailer("https://www.youtube.com/embed/-Dk4FtER2ic")
                    .year(1976)
                    .actors(Arrays.asList())
                    .build();

            ScreenFun scifi1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.SCI_FI)
                    .director("William Westwater")
                    .plot("A science fiction first-person shooter video game takes place in the year 2231.")
                    .poster("alien.jpg")
                    .producer("David Stalker")
                    .rating(98)
                    .runtime(50)
                    .title("Aliens versus Predator 2")
                    .trailer("https://www.youtube.com/embed/MVYveod5WXE")
                    .year(2001)
                    .actors(Arrays.asList("Kevin Kilstrom"))
                    .build();

            ScreenFun scifi2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.SCI_FI)
                    .director("Steve Raffel")
                    .plot("First- and third-person shooter sci-fi video game set in the Star Wars universe.")
                    .poster("starwars.jpg")
                    .producer("Jon Zuk")
                    .rating(18)
                    .runtime(500)
                    .title("Star Wars Jedi Knight: Jedi Academy")
                    .trailer("https://www.youtube.com/embed/CjINupZXJXc")
                    .year(2003)
                    .actors(Arrays.asList("Mike Morasky"))
                    .build();

            ScreenFun romance1 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ROMANCE)
                    .director("Hidden Path Entertainment")
                    .plot("The game pits two teams against each other: the Terrorists and the Counter-Terrorists. Both sides are tasked with eliminating the other while also completing separate objectives.")
                    .poster("csgo.jpeg")
                    .producer("Valve Corporation")
                    .rating(94)
                    .runtime(500000)
                    .title("Counter-Strike: Global Offensive")
                    .trailer("https://www.youtube.com/embed/edYCtaNueQY")
                    .year(2012)
                    .actors(Arrays.asList("Adrian Carmack", "Kevin Cloud"))
                    .build();

            ScreenFun romance2 = ScreenFun.builder()
                    .funType("game")
                    .genre(Genre.ROMANCE)
                    .director("Tom Hall")
                    .plot("Players assume the role of a space marine, popularly known as \"Doomguy\", fighting his way through hordes of invading demons from Hell.")
                    .poster("doom.jpg")
                    .producer("id Software")
                    .rating(16)
                    .runtime(500)
                    .title("DOOM")
                    .trailer("https://www.youtube.com/embed/BkaC1-QoraY")
                    .year(1993)
                    .actors(Arrays.asList())
                    .build();

            repository.saveAll(Arrays.asList(action1, action2, action3, comedy1, comedy2, drama1, drama2, animated1,
                    animated2, documentary1, documentary2, horror1, horror2, romance1, romance2, scifi1, scifi2));
        };
    }
}
