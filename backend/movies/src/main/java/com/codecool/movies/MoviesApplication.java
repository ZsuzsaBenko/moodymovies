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

            ScreenFun theRing = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.HORROR)
                    .year(2002)
                    .rating(7.1)
                    .runtime(115)
                    .title("The Ring")
                    .actors(Arrays.asList("Naomi Watts", "Martin Henderson", "David Dorfman"))
                    .director("Gore Verbinski")
                    .producer("Benita Allen")
                    .plot("A journalist must investigate a mysterious videotape which seems to cause the death of anyone one week to the day after they view it.")
                    .poster("ring.jpg")
                    .trailer("https://www.youtube.com/embed/yzR2GY-ew8I")
                    .build();

            ScreenFun superSizeMe = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DOCUMENTARY)
                    .year(2004)
                    .rating(7.2)
                    .runtime(100)
                    .title("Super Size Me")
                    .actors(Arrays.asList("Chemeeka Walker", "Dania Abu-Rmaileh", "Amanda Kearsan"))
                    .director("Morgan Spurlock")
                    .producer("Joe Morley")
                    .plot("While examining the influence of the fast food industry, Morgan Spurlock personally explores the consequences on his health of a diet of solely McDonald's food for one month.")
                    .poster("ssme.jpg")
                    .trailer("https://www.youtube.com/embed/GRPSeVyrd68")
                    .build();

            ScreenFun fahrenheit = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DOCUMENTARY)
                    .year(2004)
                    .rating(7.5)
                    .runtime(122)
                    .title("Fahrenheit 9/11")
                    .actors(Arrays.asList("Ben Affleck", "Stevie Wonder", "George W. Bush"))
                    .director("PeMichael Moore")
                    .producer("Jim Czarnecki")
                    .plot("Michael Moore's view on what happened to the United States after September 11; and how the Bush Administration allegedly used the tragic event to push forward its agenda for unjust wars in Afghanistan and Iraq.")
                    .poster("fahrenheit.jpg")
                    .trailer("https://www.youtube.com/embed/yg-be2r7ouc")
                    .build();

            ScreenFun aKnightsTale = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ADVENTURE)
                    .year(2001)
                    .rating(6.9)
                    .runtime(132)
                    .title("A Knight's Tale")
                    .actors(Arrays.asList("Heath Ledger", "Rufus Sewell", "Shannyn Sossamon"))
                    .director("Brian Helgeland")
                    .producer("Todd Black")
                    .plot("After his master dies, a peasant squire, fueled by his desire for food and glory, creates a new identity for himself as a knight.")
                    .poster("knights-tale.jpg")
                    .trailer("https://www.youtube.com/embed/_KzsTKqTq1M")
                    .build();

            ScreenFun americanPie = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.COMEDY)
                    .year(1999)
                    .rating(7.5)
                    .runtime(95)
                    .title("American Pie")
                    .actors(Arrays.asList("Jason Biggs", "Jennifer Coolidge", "Shannon Elizabeth"))
                    .director("Paul Weitz")
                    .producer("Chris Bender")
                    .plot("Four teenage boys enter a pact to lose their virginity by prom night.")
                    .poster("american-pie.jpg")
                    .trailer("https://www.youtube.com/embed/iUZ3Yxok6N8")
                    .build();

            ScreenFun bridgetJones = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.COMEDY)
                    .year(2001)
                    .rating(6.7)
                    .runtime(97)
                    .title("Bridget Jones's Diary")
                    .actors(Arrays.asList("Renée Zellweger", "Gemma Jones", "Liv Tyler", "Celia Imrie"))
                    .director("Sharon Maguire")
                    .producer("Tim Bevan")
                    .plot("A British woman is determined to improve herself while she looks for love in a year in which she keeps a personal diary.")
                    .poster("bridget-jones.jpg")
                    .trailer("https://www.youtube.com/embed/PYPK3jPZkYI")
                    .build();

            ScreenFun oceansEleven = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.CRIME)
                    .year(2001)
                    .rating(7.8)
                    .runtime(116)
                    .title("Ocean's Eleven")
                    .actors(Arrays.asList("George Clooney", "Brad Pitt", "Julia Roberts"))
                    .director("Steven Soderbergh")
                    .producer("Jerry Weintraub")
                    .plot("Danny Ocean and his eleven accomplices plan to rob three Las Vegas casinos simultaneously.")
                    .poster("oceans-eleven.jpg")
                    .trailer("https://www.youtube.com/embed/imm6OR605UI")
                    .build();

            ScreenFun girlWithDragonTattoo = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.CRIME)
                    .year(2011)
                    .rating(7.8)
                    .runtime(158)
                    .title("The Girl with the Dragon Tattoo")
                    .actors(Arrays.asList("Daniel Craig", "Rooney Mara", "Christopher Plumme"))
                    .director("David Fincher")
                    .producer("Scott Rudin")
                    .plot("Journalist Mikael Blomkvist is aided in his search for a woman who has been missing for forty years by Lisbeth Salander, a young computer hacker.")
                    .poster("girl-with-dragon-tattoo.jpg")
                    .trailer("https://www.youtube.com/embed/DqQe3OrsMKI")
                    .build();

            ScreenFun memento = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.THRILLER)
                    .year(2000)
                    .rating(7.8)
                    .runtime(153)
                    .title("Memento")
                    .actors(Arrays.asList("Guy Pearce", "Carrie-Anne Moss", "Joe Pantoliano"))
                    .director("Christopher Nolan")
                    .producer("Christopher Ball")
                    .plot("A man with short-term memory loss attempts to track down his wife's murderer.")
                    .poster("memento.jpg")
                    .trailer("https://www.youtube.com/embed/0vS0E9bBSL0")
                    .build();

            ScreenFun theButterflyEffect = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.THRILLER)
                    .year(2004)
                    .rating(7.7)
                    .runtime(113)
                    .title("The Butterfly Effect")
                    .actors(Arrays.asList("Ashton Kutcher", "Amy Smart", "Melora Walters"))
                    .director(" Eric Bress")
                    .producer("Anthony Rhulen")
                    .plot("A man with short-term memory loss attempts to track down his wife's murderer.")
                    .poster("butterfly-effect.jpg")
                    .trailer("https://www.youtube.com/embed/B8_dgqfPXFg")
                    .build();

            this.movieRepository.saveAll(
                    Arrays.asList(
                            avatar, sleepyHollow, fiftyFirstDates, lotr, theRing, superSizeMe,
                            fahrenheit, aKnightsTale, americanPie, bridgetJones, oceansEleven,
                            girlWithDragonTattoo, memento, theButterflyEffect));
        };
    }
}
