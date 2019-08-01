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

            ScreenFun hpSorcerersStone = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.FANTASY)
                    .year(2001)
                    .rating(7.6)
                    .runtime(152)
                    .title("Harry Potter and the Sorcerer's Stone")
                    .actors(Arrays.asList("Daniel Radcliffe", "Rupert Grint", "Richard Harris"))
                    .director("Chris Columbus")
                    .producer("Todd Arnow")
                    .plot("An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.")
                    .poster("harry_potter_st.jpg")
                    .trailer("https://www.youtube.com/embed/VyHV0BRtdxo")
                    .build();

            ScreenFun penguins = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DOCUMENTARY)
                    .year(2005)
                    .rating(7.6)
                    .runtime(80)
                    .title("March of the Penguins")
                    .actors(Arrays.asList("Morgan Freeman", "Charles Berling", "Romane Bohringer"))
                    .director("Luc Jacquet")
                    .producer("Jean-Christophe Barret")
                    .plot("In the Antarctic, every March since the beginning of time, the quest begins to find the perfect mate and start a family.")
                    .poster("march_of_the_penguins.jpg")
                    .trailer("https://www.youtube.com/embed/L7tWNwhSocE")
                    .build();

            ScreenFun loveActually = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ROMANCE)
                    .year(2003)
                    .rating(7.6)
                    .runtime(135)
                    .title("Love Actually")
                    .actors(Arrays.asList("Colin Firth", "Martin Freeman", "Keira Knightley"))
                    .director("Richard Curtis")
                    .producer("Tim Bevan")
                    .plot("Follows the lives of eight very different couples in dealing with their love lives in various loosely interrelated tales all set during a frantic month before Christmas in London, England.")
                    .poster("love_actually.jpg")
                    .trailer("https://www.youtube.com/embed/H9Z3_ifFheQ")
                    .build();

            ScreenFun starWarsPhantomMenace = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.FANTASY)
                    .year(1999)
                    .rating(6.5)
                    .runtime(135)
                    .title("Star Wars: Episode I - The Phantom Menace")
                    .actors(Arrays.asList("Liam Neeson", "Ewan McGregor", "Natalie Portman"))
                    .director("George Lucas")
                    .producer("Rick McCallum")
                    .plot("Two Jedi escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to claim their old glory.")
                    .poster("sw_phantom_menace.jpg")
                    .trailer("https://www.youtube.com/embed/bD7bpG-zDJQ")
                    .build();

            ScreenFun iceAge = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ANIMATED)
                    .year(2002)
                    .rating(7.5)
                    .runtime(81)
                    .title("Ice Age")
                    .actors(Arrays.asList("Denis Leary", "John Leguizamo", "Ray Romano"))
                    .director("Chris Wedge")
                    .producer("John C. Donkin")
                    .plot("Set during the Ice Age, a sabertooth tiger, a sloth, and a wooly mammoth find a lost human infant, and they try to return him to his tribe.")
                    .poster("ice_age.jpg")
                    .trailer("https://www.youtube.com/embed/cMfeWyVBidk")
                    .build();

            ScreenFun shrek = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ANIMATED)
                    .year(2004)
                    .rating(7.9)
                    .runtime(90)
                    .title("Shrek")
                    .actors(Arrays.asList("Mike Myers", "Eddie Murphy", "Cameron Diaz"))
                    .director("Andrew Adamson")
                    .producer("Penney Finkelman Cox")
                    .plot("A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.")
                    .poster("shrek.jpg")
                    .trailer("https://www.youtube.com/embed/W37DlG1i61s")
                    .build();

            ScreenFun mrMrsSmith = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ACTION)
                    .year(2005)
                    .rating(6.5)
                    .runtime(120)
                    .title("Mr. and Mrs. Smith")
                    .actors(Arrays.asList("Brad Pitt", "Angelina Jolie", "Adam Brody"))
                    .director("Doug Liman")
                    .producer("Lucas Foster")
                    .plot("A bored married couple is surprised to learn that they are both assassins hired by competing agencies to kill each other.")
                    .poster("mr_mrs_smith.jpg")
                    .trailer("https://www.youtube.com/embed/CZ0B22z22pI")
                    .build();

            ScreenFun kingsSpeech = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DRAMA)
                    .year(2010)
                    .rating(8.0)
                    .runtime(118)
                    .title("The King's Speech")
                    .actors(Arrays.asList("Colin Firth", "Geoffrey Rush", "Helena Bonham Carter"))
                    .director("Tom Hooper")
                    .producer("Paul Brett")
                    .plot("The story of King George VI, his impromptu ascension to the throne of the British Empire in 1936, and the speech therapist who helped the unsure monarch overcome his stammer.")
                    .poster("kings_speech.jpg")
                    .trailer("https://www.youtube.com/embed/EcxBrTvLbBM")
                    .build();

            ScreenFun gravity = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DRAMA)
                    .year(2013)
                    .rating(7.7)
                    .runtime(91)
                    .title("Gravity")
                    .actors(Arrays.asList("Sandra Bullock", "George Clooney", "Ed Harris"))
                    .director("Alfonso Cuarón")
                    .producer("Alfonso Cuarón")
                    .plot("Two astronauts work together to survive after an accident leaves them stranded in space.")
                    .poster("gravity.jpg")
                    .trailer("https://www.youtube.com/embed/OiTiKOy59o4")
                    .build();

            ScreenFun angelsDemons = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ACTION)
                    .year(2009)
                    .rating(6.7)
                    .runtime(138)
                    .title("Angels & Demons")
                    .actors(Arrays.asList("Tom Hanks", "Ewan McGregor", "Ayelet Zurer"))
                    .director("Ron Howard")
                    .producer("Dan Brown")
                    .plot("Harvard symbologist Robert Langdon works with a nuclear physicist to solve a murder and prevent a terrorist act against the Vatican during one of the significant events within the church.")
                    .poster("angels_demons.jpg")
                    .trailer("https://www.youtube.com/embed/zzjv-GUEDfg")
                    .build();

            ScreenFun vanHelsing = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.HORROR)
                    .year(2004)
                    .rating(6.1)
                    .runtime(131)
                    .title("Van Helsing")
                    .actors(Arrays.asList("Hugh Jackman", "Kate Beckinsale", "Richard Roxburgh"))
                    .director("Stephen Sommers")
                    .producer("Bob Ducsay")
                    .plot("The notorious monster hunter is sent to Transylvania to stop Count Dracula who is using Dr. Frankenstein's research and a werewolf for some sinister purpose.")
                    .poster("van_helsing.jpg")
                    .trailer("https://www.youtube.com/embed/3fdRKme00uI")
                    .build();

            movieRepository.saveAll(Arrays.asList(vanHelsing, angelsDemons, gravity, kingsSpeech, mrMrsSmith, shrek, iceAge, starWarsPhantomMenace, loveActually, penguins, hpSorcerersStone));
        };
    }
}
