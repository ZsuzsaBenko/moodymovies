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
                    .trailer("https://www.youtube.com/embed/HDWylEQSwFo")
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

            ScreenFun matrix = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.SCI_FI)
                    .year(1999)
                    .rating(8.7)
                    .runtime(136)
                    .title("The Matrix")
                    .actors(Arrays.asList("Keanu Reeves", "Laurence Fishburn", "Carrie-Anne Moss"))
                    .director("The Wachowski Brothers")
                    .producer("Joel Silver")
                    .plot("A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.")
                    .poster("matrix.jpg")
                    .trailer("https://www.youtube.com/embed/m8e-FF8MsqU")
                    .build();

            ScreenFun blackSwan = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.DRAMA)
                    .year(2010)
                    .rating(8.00)
                    .runtime(108)
                    .title("Black Swan")
                    .actors(Arrays.asList("Natalie Portman", "Mila Kunis", "Winona Ryder"))
                    .director("Darren Aronofsky") .producer("Mike Medavoy")
                    .plot("A committed dancer struggles to maintain her sanity after winning the lead role in a production of Tchaikovsky's Swan Lake.")
                    .poster("blackswan.jpg")
                    .trailer("https://www.youtube.com/embed/5jaI1XOB-bs")
                    .build();

            ScreenFun twilight = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ROMANCE)
                    .year(2008)
                    .rating(5.2)
                    .runtime(122)
                    .title("Twilight")
                    .actors(Arrays.asList("Robert Pattison", "Kristen Stewart", "Taylor Lautner"))
                    .director("Catherine Hardwicke") .producer("Greg Mooradian")
                    .plot("Bella Swan moves to Forks and encounters Edward Cullen, a gorgeous boy with a secret.")
                    .poster("twilight.jpg")
                    .trailer("https://www.youtube.com/embed/QDRLSqm_WVg")
                    .build();

            ScreenFun hangover = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.COMEDY)
                    .year(2009)
                    .rating(7.7)
                    .runtime(100)
                    .title("The Hangover")
                    .actors(Arrays.asList("Bradley Cooper", "Zach Galifianakis", "Ed Helms"))
                    .director("Todd Philips") .producer("Todd Philips")
                    .plot("Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing. They make their way around the city in order to find their friend before his wedding.")
                    .poster("hangover.jpg")
                    .trailer("https://www.youtube.com/embed/tcdUhdOlz9M")
                    .build();

            ScreenFun gladiator = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ADVENTURE)
                    .year(2000)
                    .rating(8.5)
                    .runtime(155)
                    .title("The Gladiator")
                    .actors(Arrays.asList("Russel Crowe", "Joaquin Phoenix", "Connie Nielsen"))
                    .director("Ridley Scott")
                    .producer("David Franzoni")
                    .plot("A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.")
                    .poster("gladiator.jpg")
                    .trailer("https://www.youtube.com/embed/uvbavW31adA")
                    .build();

            ScreenFun sherlock = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.CRIME)
                    .year(2009)
                    .rating(7.6)
                    .runtime(128)
                    .title("Sherlock Holmes")
                    .actors(Arrays.asList("Robert Downey Jr.", "Jude Law", "Rachel McAdams"))
                    .director("Guy Ritchie") .producer("Susan Downey")
                    .plot("Detective Sherlock Holmes and his stalwart partner Watson engage in a battle of wits and brawn with a nemesis whose plot is a threat to all of England.")
                    .poster("sherlockholmes.jpg")
                    .trailer("https://www.youtube.com/embed/J7nJksXDBWc")
                    .build();

            ScreenFun inception = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.SCI_FI)
                    .year(2010)
                    .rating(8.8)
                    .runtime(148)
                    .title("Inception")
                    .actors(Arrays.asList("Leonardo Dicaprio", "Joseph Gordon-Levitt", "Ellen Page"))
                    .director("Christopher Nolan")
                    .producer("Christopher Nolan")
                    .plot("A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.")
                    .poster("inception.jpg")
                    .trailer("https://www.youtube.com/embed/YoHD9XEInc0")
                    .build();

            ScreenFun taken = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.THRILLER)
                    .year(2008)
                    .rating(7.8)
                    .runtime(94)
                    .title("Taken")
                    .actors(Arrays.asList("Liam Neeson", "Maggie Grace", "Famke Janssen"))
                    .director("Pierre Morel")
                    .producer("Luc Besson")
                    .plot("A retired CIA agent travels across Europe and relies on his old skills to save his estranged daughter, who has been kidnapped while on a trip to Paris.")
                    .poster("taken.jpg")
                    .trailer("https://www.youtube.com/embed/uPJVJBm9TPA")
                    .build();

            ScreenFun zootopia = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ANIMATED)
                    .year(2016)
                    .rating(8.0)
                    .runtime(108)
                    .title("Zootopia")
                    .actors(Arrays.asList("Ginnifer Goodwin", "Jason Bateman", "Idris Elba"))
                    .director(" Byron Howard")
                    .producer("Clark Spencer")
                    .plot("In a city of anthropomorphic animals, a rookie bunny cop and a cynical con artist fox must work together to uncover a conspiracy.")
                    .poster("zootopia.jpg")
                    .trailer("https://www.youtube.com/embed/jWM0ct-OLsM")
                    .build();

            ScreenFun ptcCBP = ScreenFun.builder()
                    .funType("movie")
                    .genre(Genre.ADVENTURE)
                    .year(2003)
                    .rating(8.0)
                    .runtime(144)
                    .title("Pirates of the Caribbean - The Curse of the Black Pearl")
                    .actors(Arrays.asList("Johnny Depp", "Orlando Bloom", "Keira Knightley"))
                    .director("Gore Verbinski")
                    .producer("Jerry Bruckheimer")
                    .plot("Blacksmith Will Turner teams up with eccentric pirate Captain Jack Sparrow to save his love, the governor's daughter, from Jack's former pirate allies, who are now undead.")
                    .poster("poccbp.jpg")
                    .trailer("https://www.youtube.com/embed/naQr0uTrH_s")
                    .build();

            this.movieRepository.saveAll(
                    Arrays.asList(
                            avatar, sleepyHollow, fiftyFirstDates, lotr, theRing, superSizeMe,
                            fahrenheit, aKnightsTale, americanPie, bridgetJones, oceansEleven,
                            girlWithDragonTattoo, memento, theButterflyEffect));

            movieRepository.saveAll(Arrays.asList(vanHelsing, angelsDemons, gravity, kingsSpeech, mrMrsSmith, shrek, iceAge, starWarsPhantomMenace, loveActually, penguins, hpSorcerersStone));

            movieRepository.saveAll(Arrays.asList(matrix, blackSwan, twilight, hangover, gladiator, sherlock, inception, taken, zootopia, ptcCBP));

        };
    }
}
