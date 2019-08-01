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
                    .trailer("https://www.youtube.com/embed/pASzNTXAu7k")
                    .build();

            ScreenFun bokuNoPiko = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DRAMA)
                    .year(2006)
                    .rating(2.8)
                    .runtime(34)
                    .title("Boku no Piko")
                    .actors(Arrays.asList("Sakou Mariko", "Aiko Okubo"))
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

            ScreenFun yourName = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ROMANCE)
                    .year(2016)
                    .rating(9.12)
                    .runtime(106)
                    .title("Your Name.")
                    .actors(Arrays.asList("Kamishiraishi Mone", "Kamiki Ryunosuke", "Hanazawa Kana"))
                    .director("Shinkai Makoto")
                    .producer("Kawamura Genki")
                    .plot("Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.\n" +
                            "\n" +
                            "One day, Mitsuha awakens in a room that is not her own and suddenly finds herself living the dream life in Tokyo—but in Taki's body! Elsewhere, Taki finds himself living Mitsuha's life in the humble countryside. In pursuit of an answer to this strange phenomenon, they begin to search for one another.")
                    .poster("your_name.jpg")
                    .trailer("https://www.youtube.com/embed/xU47nhruN-Q")
                    .build();

            ScreenFun nobunagasBride = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ROMANCE)
                    .year(2019)
                    .rating(5.45)
                    .runtime(7)
                    .title("Mr. Nobunaga's Young Bride")
                    .actors(Arrays.asList("Uehara Akari", "Sakai Koudai", "Ozawa, Ari"))
                    .director("Sasaki Tokihiro")
                    .producer("Nishikawa Takashi")
                    .plot("\"One day, a girl who loves me will suddenly appear before me\"—Middle school teacher Nobunaga has always been dreaming of such a gal game-like situation. However, the one who appeared before him was Kichou, a 14-year-old girl who proclaims herself as his wife. Appears to have arrived from the Sengoku era, she mistakes Nobunaga as Nobunaga Oda and urges him to conceive a child with her. Thus begins the age-difference love comedy between a gal game-loving teacher and a Sengoku era expert princess.")
                    .poster("nobunaga_sensei_no_osanazuma.jpg")
                    .trailer("https://www.youtube.com/embed/hC8RDxCHR9M")
                    .build();

            ScreenFun deathNote = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.CRIME)
                    .year(2006)
                    .rating(8.66)
                    .runtime(23)
                    .title("Death Note")
                    .actors(Arrays.asList("Yamaguchi Kappei", "Miyano Mamoru", "Nakamura Shidou"))
                    .director("Araki Tetsurou")
                    .producer("Maruyama Masao")
                    .plot("A shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm.\n" +
                            "\n" +
                            "High school student and prodigy Light Yagami stumbles upon the Death Note and—since he deplores the state of the world—tests the deadly notebook by writing a criminal's name in it. When the criminal dies immediately following his experiment with the Death Note, Light is greatly surprised and quickly recognizes how devastating the power that has fallen into his hands could be. ")
                    .poster("death_note.jpg")
                    .trailer("https://www.youtube.com/embed/HmaGck__gp0")
                    .build();

            ScreenFun sushiPolice = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.CRIME)
                    .year(2016)
                    .rating(4.69)
                    .runtime(3)
                    .title("SUSHI POLICE")
                    .actors(Arrays.asList("Yamashita Akira", "Okamoto Hiromitsu", "Kikuchi Yumi"))
                    .director("Momen Tatsushi")
                    .producer("Okamoto Sae")
                    .plot("Honda, Kawasaki, and Suzuki all comprise the elite ninth unit of the Sushi Police—a task force with the sole objective of sniffing out restaurants serving illicit or non-traditional sushi and eradicating them, no matter how insignificant their offense may be. The Sushi Police travel freely around the world in pursuit of these vile criminals day or night, with their strong sense of justice and the World Food-Culture Conservation Organization backing them. No offenders of Japan's traditional cuisine can escape their wrath!\n" +
                            "\n" +
                            "During one of their purification missions, the Sushi Police encounter Sara—a hot, young, television reporter out to expose them and the World Food-Culture Conservation Organization for corruption. They interrogate her, but her wiles, skills, and charms allow her to easily escape from their grasp, setting off a chain of events that will lead to the true purpose of the Sushi Police being revealed.")
                    .poster("sushi_police.jpg")
                    .trailer("https://www.youtube.com/embed/Vg4SPxyme5g")
                    .build();

            ScreenFun steinsGate = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.THRILLER)
                    .year(2011)
                    .rating(9.13)
                    .runtime(24)
                    .title("Steins;Gate")
                    .actors(Arrays.asList("Miyano Mamoru", "Imai Asami", "Hanazawa Kana"))
                    .director("Hamasaki Hiroshi")
                    .producer("Iwasa Gaku")
                    .plot("The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara, where he indulges himself in his hobby of inventing prospective \"future gadgets\" with fellow lab members: Mayuri Shiina, his air-headed childhood friend, and Hashida Itaru, a perverted hacker nicknamed \"Daru.\" The three pass the time by tinkering with their most promising contraption yet, a machine dubbed the \"Phone Microwave,\" which performs the strange function of morphing bananas into piles of green gel.\n" +
                            "\n" +
                            "Though miraculous in itself, the phenomenon doesn't provide anything concrete in Okabe's search for a scientific breakthrough; that is, until the lab members are spurred into action by a string of mysterious happenings before stumbling upon an unexpected success—the Phone Microwave can send emails to the past, altering the flow of history.")
                    .poster("steins_gate.jpg")
                    .trailer("https://www.youtube.com/embed/27OZc-ku6is")
                    .build();

            ScreenFun hiredGun = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.THRILLER)
                    .year(2013)
                    .rating(5.60)
                    .runtime(3)
                    .title("Koroshiya-san: The Hired Gun")
                    .actors(Arrays.asList("Sakurai Takahiro", "Fujiwara Keiji", "Kanada Aki"))
                    .director("Watanabe Jun")
                    .producer("Ichijo Masahide")
                    .plot("The comedy story follows the title character, who is regarded by himself and others as the best hit man in Japan. He goes by the motto, \"If I have an assignment, I will kill anything.\" However, his \"killing\" assignments have expanded to include everything from summer vacation homework to housekeeping. \"The hit man never fails to kill the target. Though he does not aim to, he also never misses the laughter.\"\n")
                    .poster("koroshiya.jpg")
                    .trailer("https://www.youtube.com/embed/xRg3WuCqXOk")
                    .build();

            ScreenFun cellsAtWork = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DOCUMENTARY)
                    .year(2018)
                    .rating(7.81)
                    .runtime(23)
                    .title("Cells at Work!")
                    .actors(Arrays.asList("Maeno Tomoaki", "Hanazawa Kana", "Naganawa Maria"))
                    .director("Suzuki, Kenichi")
                    .producer("Takahashi Yuuma")
                    .plot("Inside the human body, roughly 37.2 trillion cells work energetically 24 hours a day and 365 days a year. Fresh out of training, the cheerful and somewhat airheaded Red Blood Cell AE3803 is ready to take on the ever-so-important task of transporting oxygen. As usual, White Blood Cell U-1146 is hard at work patrolling and eliminating foreign bacteria seeking to make the body their new lair. Elsewhere, little platelets are lining up for a new construction project. \n" +
                            "\n" +
                            "Dealing with wounds and allergies, getting lost on the way to the lungs, and bickering with similar cell types, the daily lives of cells are always hectic as they work together to keep the body healthy!")
                    .poster("cells_at_work.jpg")
                    .trailer("https://www.youtube.com/embed/HMXWvvjAJek")
                    .build();

            ScreenFun olympusGuardian = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.DOCUMENTARY)
                    .year(2005)
                    .rating(5.99)
                    .runtime(87)
                    .title("Greek & Roman Mythology: Olympus Guardian")
                    .actors(Arrays.asList("Oh Seung‑yoon", "Jang Gwang", "Jeong Mi‑sook"))
                    .director("Kim Joon")
                    .producer("Jun Hye-Young")
                    .plot("A Korean animated full-feature film about the gods in ancient Greece. It was created to teach young people about ancient Greece and its myths.")
                    .poster("olympus_guardian.jpg")
                    .trailer("https://www.youtube.com/embed/-Ul_abNILyA")
                    .build();

            ScreenFun fmaBrotherhood = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.FANTASY)
                    .year(2009)
                    .rating(9.24)
                    .runtime(24)
                    .title("Fullmetal Alchemist: Brotherhood")
                    .actors(Arrays.asList("Park Romi", "Kugimiya Rie", "Takamoto Megumi"))
                    .director("Irie Yasuhiro")
                    .producer("Cook Justin")
                    .plot("\"In order for something to be obtained, something of equal value must be lost.\"\n" +
                            "\n" +
                            "Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist.\n" +
                            "\n" +
                            "Three years of searching later, the brothers seek the Philosopher's Stone, a mythical relic that allows an alchemist to overcome the Law of Equivalent Exchange. Even with military allies Colonel Roy Mustang, Lieutenant Riza Hawkeye, and Lieutenant Colonel Maes Hughes on their side, the brothers find themselves caught up in a nationwide conspiracy that leads them not only to the true nature of the elusive Philosopher's Stone, but their country's murky history as well. In between finding a serial killer and racing against time, Edward and Alphonse must ask themselves if what they are doing will make them human again... or take away their humanity.\n")
                    .poster("fullmetal_alchemist_brotherhood.jpg")
                    .trailer("https://www.youtube.com/embed/--IcmZkvL0Q")
                    .build();

            ScreenFun masterOfRagnarok = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.FANTASY)
                    .year(2018)
                    .rating(6.07)
                    .runtime(23)
                    .title("The Master of Ragnarok & Blesser of Einherjar")
                    .actors(Arrays.asList("Sakai Koudai", "Date Arisa", "Suegara Rie"))
                    .director("Kobayashi Kousuke")
                    .producer("Morishita Hiroto")
                    .plot("Some urban legends are best left untested! Yuuto Suou gets more than he bargained for when he joins his childhood friend Mitsuki Shimoya in testing out an urban legend. When he uses his phone to take a picture of himself with the local shrine's divine mirror, he is whisked off into another world—one heavily steeped in the lore of the old Norse myths.\n" +
                            "\n" +
                            "Using his knowledge gained from school and from his solar-powered smartphone, he has the chance to bring the Wolf Clan, the same people who cared for him, to prominence, all while earning the adoration of a group of magic-wielding warrior maidens known as the Einherjar.")
                    .poster("master_of_ragnarok.jpg")
                    .trailer("https://www.youtube.com/embed/Ol0Z3J2cx2Y")
                    .build();

            ScreenFun cowboyBebop = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.SCI_FI)
                    .year(1998)
                    .rating(8.82)
                    .runtime(24)
                    .title("Cowboy Bebop")
                    .actors(Arrays.asList("Yamadera Kouichi", "Tada Aoi", "Hayashibara Megumi"))
                    .director("Watanabe Shinichiro")
                    .producer("Maseba Yutaka")
                    .plot("In the year 2071, humanity has colonized several of the planets and moons of the solar system leaving the now uninhabitable surface of planet Earth behind. The Inter Solar System Police attempts to keep peace in the galaxy, aided in part by outlaw bounty hunters, referred to as \"Cowboys.\" The ragtag team aboard the spaceship Bebop are two such individuals.\n" +
                            "\n" +
                            "Mellow and carefree Spike Spiegel is balanced by his boisterous, pragmatic partner Jet Black as the pair makes a living chasing bounties and collecting rewards. Thrown off course by the addition of new members that they meet in their travels—Ein, a genetically engineered, highly intelligent Welsh Corgi; femme fatale Faye Valentine, an enigmatic trickster with memory loss; and the strange computer whiz kid Edward Wong—the crew embarks on thrilling adventures that unravel each member's dark and mysterious past little by little.")
                    .poster("cowboy_bebop.jpg")
                    .trailer("https://www.youtube.com/embed/qig4KOK2R2g")
                    .build();

            ScreenFun devander = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.SCI_FI)
                    .year(2012)
                    .rating(5.61)
                    .runtime(27)
                    .title("Ippatsu Hicchuu!! Devander")
                    .actors(Arrays.asList("Kaji Yuki", "Morikawa Toshiyuki", "Oohira Tooru"))
                    .director("Sasagawa Hiroshi")
                    .producer("Oobari Masami")
                    .plot("This story revolves around a spirited, carefree boy named Kazuma Harukaze, who lives with his little sister Sakura and his horse Lovely on a farm within sight of Mt. Fuji. One day, a \"meteor\" lands nearby, and it turns out to be Hinkeeru—a messenger from Muzanda who has come to warn Earth of a grave danger—and a robot horse named Robony.")
                    .poster("ippatsu_hicchuu_devander.jpg")
                    .trailer("https://www.youtube.com/embed/oYlp6wcAhSA")
                    .build();

            ScreenFun movingCastle = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ADVENTURE)
                    .year(2004)
                    .rating(8.72)
                    .runtime(119)
                    .title("Howl's Moving Castle")
                    .actors(Arrays.asList("Kimura Takuya", "Baisho, Chieko", "Gashuin Tatsuya"))
                    .director("Miyazaki Hayao")
                    .producer("Suzuki Toshio")
                    .plot("That jumbled piece of architecture, that cacophony of hissing steam and creaking joints, with smoke billowing from it as it moves on its own... That castle is home to the magnificent wizard Howl, infamous for both his magical prowess and for being a womanizer—or so the rumor goes in Sophie Hatter's small town. Sophie, as the plain daughter of a hatmaker, does not expect much from her future and is content with working hard in the shop. \n" +
                            "\n" +
                            "However, Sophie's simple life takes a turn for the exciting when she is ensnared in a disturbing situation, and the mysterious wizard appears to rescue her. Unfortunately, this encounter, brief as it may be, spurs the vain and vengeful Witch of the Waste—in a fit of jealousy caused by a past discord with Howl—to put a curse on the maiden, turning her into an old woman.\n")
                    .poster("howls_moving_castle.jpg")
                    .trailer("https://www.youtube.com/embed/iwROgK94zcM")
                    .build();

            ScreenFun avenger = ScreenFun.builder()
                    .funType("anime")
                    .genre(Genre.ADVENTURE)
                    .year(2003)
                    .rating(5.96)
                    .runtime(24)
                    .title("Avenger")
                    .actors(Arrays.asList("Toyoguchi Megumi", "Kanai Mika", "Oota Shinichirou"))
                    .director("Morioka Hiroshi")
                    .producer("Morimoto Kouji")
                    .plot("Mars has been colonized and is a world where children have been replaced by robot servants known as \"dolls.\" Layla is a skilled fighter with a tragic past who travels about the world. Her companions are Nei, a strange and unique doll with some unknown ties to Layla, and Speedy, who is a doll breeder. The founders of Mars see the trio as a threat to their world, and each time they attack Layla and Nei a bit more of their mysterious past and future is revealed.")
                    .poster("avenger.jpg")
                    .trailer("https://www.youtube.com/embed/sy4gkY2KBik")
                    .build();

            repository.saveAll(Arrays.asList(bleach, fireForce, firstLoveMonster, fumoffu, hellsingUltimate, tokyoGhoul, gintama, onALustful, yugiohVrains, yourLie, spiritedAway, calamityZombie, bokuNoPiko));
            repository.saveAll(Arrays.asList(yourName, nobunagasBride, deathNote, sushiPolice,steinsGate, hiredGun, cellsAtWork, olympusGuardian, fmaBrotherhood, masterOfRagnarok, cowboyBebop, devander, movingCastle, avenger));
        };
    }

}
