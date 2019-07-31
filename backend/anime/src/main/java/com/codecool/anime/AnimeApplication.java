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

            ScreenFun bleach = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ACTION)
                    .year(2004)
                    .rating(7.88)
                    .runtime(24)
                    .title("Bleach")
                    .actors(Arrays.asList("Matsuoka Yuki", "Orikasa Fumiko", "Tachiki Fumihiko"))
                    .director("Abe Noriyuki")
                    .producer("Ishihama Masashi")
                    .plot("Ichigo Kurosaki is an ordinary high schooler - until his family is attacked by a Hollow.")
                    .poster("bleach.jpg")
                    .trailer("https://www.youtube.com/embed/dg5-XXa0RyE")
                    .build();

            ScreenFun fireForce = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ACTION)
                    .year(2019)
                    .rating(7.99)
                    .runtime(23)
                    .title("Fire Force")
                    .actors(Arrays.asList("Kajiwara Gakuto", "Ichimichi Mao", "Nakai Kazuya"))
                    .director("Yase Yuki")
                    .producer("Yokoyama Akitoshi")
                    .plot("Year 198 of the Solar Era in Tokyo, special fire brigades are fighting against a phenomenon called spontaneous human combustion where humans beings are turned into living infernos called \"Infernals.\" While the Infernals are first generation cases of spontaneous human combustion, later generations possess the ability to manipulate flames while retaining human form.")
                    .poster("fire_force.jpg")
                    .trailer("https://www.youtube.com/embed/Ijt145xD1TY")
                    .build();

            ScreenFun yugiohVrains = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ACTION)
                    .year(2017)
                    .rating(6.63)
                    .runtime(24)
                    .title("Yu☆Gi☆Oh! VRAINS")
                    .actors(Arrays.asList("Ishige Shouya", "Takeuchi Shunsuke", "Nakashima Yuki"))
                    .director("Hosoda Masahiro")
                    .producer("Takahashi Kazuki")
                    .plot("In the city of Den City, thousands of duelists take part in a virtual reality space known as Link Vrains, where users can create unique avatars and participate in games of Duel Monsters with each other. As a mysterious hacker organisation known as the Knights of Hanoi threaten this world, a high-school student named Yusaku Fujiki battles against them under the guise of Playmaker.")
                    .poster("yu_gi_oh_vrains.png")
                    .trailer("https://www.youtube.com/embed/T3Xw8q7oIA4")
                    .build();

            ScreenFun yourLie = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DRAMA)
                    .year(2014)
                    .rating(8.85)
                    .runtime(22)
                    .title("Your Lie in April")
                    .actors(Arrays.asList("Taneda Risa", "Hanae Natsuki", "Sakura Ayane"))
                    .director("Ishiguro Kyohei")
                    .producer("Fukushima Yuuichi")
                    .plot("Music accompanies the path of the human metronome, the prodigious pianist Kousei Arima. But after the passing of his mother, Saki Arima, Kousei falls into a downward spiral, rendering him unable to hear the sound of his own piano.\n" +
                            "Two years later, Kousei still avoids the piano, leaving behind his admirers and rivals, and lives a colorless life alongside his friends Tsubaki Sawabe and Ryouta Watari. However, everything changes when he meets a beautiful violinist, Kaori Miyazono, who stirs up his world and sets him on a journey to face music again.")
                    .poster("your_lie_in_april.jpg")
                    .trailer("https://www.youtube.com/embed/3aL0gDZtFbE")
                    .build();

            ScreenFun spiritedAway = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DRAMA)
                    .year(2001)
                    .rating(8.91)
                    .runtime(125)
                    .title("Spirited Away")
                    .actors(Arrays.asList("Irino Miyu", "Hiiragi Rumi", "Gashuin Tatsuya"))
                    .director("Miyazaki Hayao")
                    .producer("Suzuki Toshio")
                    .plot("Stubborn, spoiled, and naïve, 10-year-old Chihiro Ogino is less than pleased when she and her parents discover an abandoned amusement park on the way to their new house. Cautiously venturing inside, she realizes that there is more to this place than meets the eye, as strange things begin to happen once dusk falls. Ghostly apparitions and food that turns her parents into pigs are just the start—Chihiro has unwittingly crossed over into the spirit world. Now trapped, she must summon the courage to live and work amongst spirits, with the help of the enigmatic Haku and the cast of unique characters she meets along the way.")
                    .poster("spirited_away.jpg")
                    .trailer("https://www.youtube.com/embed/RbumLpvTC84")
                    .build();

            ScreenFun onALustful = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DRAMA)
                    .year(2017)
                    .rating(4.64)
                    .runtime(3)
                    .title("On a Lustful Night Mingling with a Priest")
                    .actors(Arrays.asList("Hara Maika", "Suzuki You", "Kojita Renya"))
                    .director("Araki Hideki")
                    .producer("Maomi Leon")
                    .plot("At a high school reunion, Mio Fukatani reunites with a classmate she has not seen in years—Takahide Kujou. She had always wanted to know more about the kind-hearted boy in high school, but once she realizes that Kujou has become a monk, she believes that any chance of getting to know him romantically is slim. Deciding to drink away her sorrows, she ends up walking home drunk, and surprisingly, running into Kujou who helps her get home.\n" +
                            "However, once inside, Kujou's lust for Mio becomes apparent and the two share an erotic night of passion. As this steamy romance blossoms between these two unlikely lovers, Mio and Kujou will undoubtedly spend many nights together in utter ecstasy.")
                    .poster("on_a_lustful.jpg")
                    .trailer("")
                    .build();

            ScreenFun bokuNoPiko = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DRAMA)
                    .year(2006)
                    .rating(2.8)
                    .runtime(34)
                    .title("Boku no Piko")
                    .actors(Arrays.asList("Sakou Mariko"))
                    .director("Yatabe Katsuyoshi")
                    .producer("Takayama Katsuhiko")
                    .plot("Upbeat and effeminate Pico is working at his grandfather's coffee shop, Café Bebe, for the summer. Tamotsu is a white-collar worker looking for an escape from the mundanity of his everyday life. When they meet at the café, sparks of love and lust quickly draw the two together. Conventional notions of age, gender, and sexuality are broken down as the pair seeks carnal gratification in one another's company. But do the pleasures of flesh equate to a connection between hearts?")
                    .poster("boku_no_piko.jpg")
                    .trailer("https://www.youtube.com/embed/Tr5RKUJX8U0")
                    .build();

            ScreenFun fumoffu = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.COMEDY)
                    .title("Full Metal Panic? Fumoffu")
                    .actors(Arrays.asList("Seki Tomokazu", "Yukino Satsuki", "Yukana"))
                    .runtime(24)
                    .rating(8.13)
                    .plot("It's back-to-school mayhem with Kaname Chidori and her war-freak classmate Sousuke Sagara.")
                    .director("Takemoto Yasuhiro")
                    .producer("Hatta Youko")
                    .poster("FMP_fumoffu.jpg")
                    .trailer("https://www.youtube.com/embed/rYHyGKZdw2o")
                    .year(2003)
                    .build();

            ScreenFun gintama = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.COMEDY)
                    .year(2006)
                    .rating(8.99)
                    .runtime(24)
                    .title("Gintama")
                    .actors(Arrays.asList("Sugita Tomokazu", "Kugimiya Rie", "Sakaguchi Daisuke"))
                    .director("Takamatsu Shinji")
                    .producer("Kobayashi Noriko")
                    .plot("The Amanto, aliens from outer space, have invaded Earth and taken over feudal Japan. As a result, a prohibition on swords has been established, and the samurai of Japan are treated with disregard as a consequence.\n" +
                            "\n" +
                            "However one man, Gintoki Sakata, still possesses the heart of the samurai, although from his love of sweets and work as a yorozuya, one might not expect it. Accompanying him in his jack-of-all-trades line of work are Shinpachi Shimura, a boy with glasses and a strong heart, Kagura with her umbrella and seemingly bottomless stomach, as well as Sadaharu, their oversized pet dog. Of course, these odd jobs are not always simple, as they frequently have run-ins with the police, ragtag rebels, and assassins, oftentimes leading to humorous but unfortunate consequences.\n" +
                            "\n" +
                            "Who said life as an errand boy was easy?")
                    .poster("gintama.jpg")
                    .trailer("https://www.youtube.com/embed/YQC3ot0IjiA")
                    .build();

            ScreenFun firstLoveMonster = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.COMEDY)
                    .year(2016)
                    .rating(5.84)
                    .runtime(24)
                    .title("First Love Monster")
                    .actors(Arrays.asList("Sakurai Takahiro", "Horie Yui", "Okamoto Nobuhiko"))
                    .director("Inagaki Takayuki")
                    .producer("Marchi Jamie")
                    .plot("Freshman Kaho Nikaidou is from an influential family, and as such, no one has ever said anything even remotely mean to her, for fear of incurring her household's wrath. Wishing to be around people who will not treat her as special because of her background, she leaves home to live at a dormitory for her new school year. Shortly after arriving, Kaho accidentally wanders into traffic and is saved by a tall, handsome stranger. When she asks for his name, he tells her she is weird and walks away. Having finally met the only person to ever say an unkind word to her, Kaho falls head over heels for her savior.\n" +
                            "\n" +
                            "After meeting her rescuer yet again and discovering that his name is Kanade Takahashi, she confesses her love to him. Kanade says he would like for them to be a couple, but that Kaho may not want to date him after she finds out his secret. To her shock, Kaho discovers the startling truth: Kanade is a fifth grader!\n")
                    .poster("first_love_monster.jpg")
                    .trailer("https://www.youtube.com/embed/P9hZpnvLvYU")
                    .build();

            ScreenFun tokyoGhoul = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.HORROR)
                    .year(2014)
                    .rating(7.96)
                    .runtime(24)
                    .title("Tokyo Ghoul")
                    .actors(Arrays.asList("Kobori Yurie", "Amamiya Sora", "Kugimiya Rie"))
                    .director("Morita Shuuhei")
                    .producer("Matsubayashi Tadahito")
                    .plot("Tokyo has become a cruel and merciless city—a place where vicious creatures called “ghouls” exist alongside humans. The citizens of this once great metropolis live in constant fear of these bloodthirsty savages and their thirst for human flesh. However, the greatest threat these ghouls pose is their dangerous ability to masquerade as humans and blend in with society.")
                    .poster("tokyo_ghoul.png")
                    .trailer("https://www.youtube.com/embed/whsQGujTLq0")
                    .build();

            ScreenFun hellsingUltimate = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.HORROR)
                    .year(2006)
                    .rating(8.49)
                    .runtime(50)
                    .title("Hellsing Ultimate")
                    .actors(Arrays.asList("Nakata Jouji", "Orikasa Fumiko", "Mizuhashi Kaori"))
                    .director("Tokoro Tomokazu")
                    .producer("Ueda Yasuyuki")
                    .plot("There exist creatures of darkness and evil that plague the night, devouring any human unfortunate enough to be caught in their grasp. On the other side is Hellsing, an organization dedicated to destroying these supernatural forces that threaten the very existence of humanity. At its head is Integra Fairbrook Wingates Hellsing, who commands a powerful military and spends her life fighting the undead.")
                    .poster("hellsing_ultimate.jpg")
                    .trailer("https://www.youtube.com/embed/KPDdligusRU")
                    .build();

            ScreenFun calamityZombie = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.HORROR)
                    .year(2018)
                    .rating(5.44)
                    .runtime(79)
                    .title("Calamity of the Zombie Girl")
                    .actors(Arrays.asList("Hayami Saori", "Ogura Yui", "Kubo Yurika"))
                    .director("Iwami Hideaki")
                    .producer("Kanemaki Kenichi")
                    .plot("On a hot summer day, five university students sneak into the library storage to look for some treasure. They find two sets of female antique mummies from Italy around the age of 14–20 years old.\n" +
                            "\n" +
                            "One of the students, Sayaka, rips open the mummy and takes out a stone called \"stone of life,\" which gave the mummies super strength and eternal life. Having stolen their \"stone of life,\" the two mummy girls wake up and become zombies after 100 years in order to get it back in a bloody gruesome way, smashing their heads and eating their flesh for power.")
                    .poster("calamity_of_the_zombie_girl.jpg")
                    .trailer("https://www.youtube.com/embed/LdawrdI3NFA")
                    .build();

            /*
            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ROMANCE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ROMANCE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ROMANCE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.CRIME)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.CRIME)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.CRIME)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.THRILLER)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.THRILLER)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.THRILLER)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DOCUMENTARY)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DOCUMENTARY)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.FANTASY)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.FANTASY)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.FANTASY)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.SCI_FI)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.SCI_FI)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.SCI_FI)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ADVENTURE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ADVENTURE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();

            ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ADVENTURE)
                    .year()
                    .rating()
                    .runtime()
                    .title("")
                    .actors(Arrays.asList("", "", ""))
                    .director("")
                    .producer("")
                    .plot("")
                    .poster("")
                    .trailer("")
                    .build();


             */
            repository.saveAll(Arrays.asList(bleach, fireForce, firstLoveMonster, fumoffu, hellsingUltimate, tokyoGhoul, gintama, onALustful, yugiohVrains, yourLie, spiritedAway, calamityZombie, bokuNoPiko));
        };
    }

}
