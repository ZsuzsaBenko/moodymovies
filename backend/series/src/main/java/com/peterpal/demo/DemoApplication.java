package com.peterpal.demo;

import com.peterpal.demo.model.Genre;
import com.peterpal.demo.model.ScreenFun;
import com.peterpal.demo.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class DemoApplication {

    @Autowired
    SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner init() {
        return args -> {
            seriesRepository.save(ScreenFun.builder().title("valami").funType("Series").rating(5).genre(Genre.DRAMA)
                    .director("N/A").producer("N/A")
                    .year(1995).plot("plot").runtime(55).poster("poster")
                    .actors(Arrays.asList("a1", "a2"))
                    .trailer("link").build());

            seriesRepository.save(ScreenFun.builder().title("Game of Thrones").funType("Series").rating(9.5).genre(Genre.FANTASY)
                    .director("N/A").producer("N/A")
                    .year(2011).plot("Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.").runtime(57).poster("https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_SX300.jpg")
                    .actors(Arrays.asList("Peter Dinklage", "Lena Headey", "Emilia Clarke", "Kit Harington"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Airwolf").funType("Series").rating(6.8).genre(Genre.ADVENTURE)
                    .director("N/A").producer("N/A")
                    .year(1984).plot("As part of a deal with an intelligence agency to look for his missing brother, a renegade pilot goes on missions with an advanced battle helicopter.").runtime(60).poster("https://m.media-amazon.com/images/M/MV5BODYyY2EwNTYtMmY3Mi00MWRkLWJlYjEtNmJhMmIzNDU0ZGE4XkEyXkFqcGdeQXVyNjExODE1MDc@._V1_SX300.jpg")
                    .actors(Arrays.asList("Jan-Michael Vincent", "Alex Cord", "Ernest Borgnine", "Jean Bruce Scott"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Homeland").funType("Series").rating(8.3).genre(Genre.CRIME)
                    .director("N/A").producer("N/A")
                    .year(2011).plot("A bipolar CIA operative becomes convinced a prisoner of war has been turned by al-Qaeda and is planning to carry out a terrorist attack on American soil.").runtime(55).poster("https://m.media-amazon.com/images/M/MV5BZjNiOTA4YTEtYmE0Ni00Mzg4LTg1OTgtNTE0YWE3YTc0MDVhXkEyXkFqcGdeQXVyNjc3OTUzNzM@._V1_SX300.jpg")
                    .actors(Arrays.asList("Claire Danes", "Mandy Patinkin", "Rupert Friend", "Maury Sterling"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Rob").funType("Series").rating(5.6).genre(Genre.COMEDY)
                    .director("N/A").producer("N/A")
                    .year(2012).plot("Centers on solitary guy, Rob, who marries into a huge Mexican-American family.")
                    .runtime(30).poster("https://m.media-amazon.com/images/M/MV5BMTQ2OTE4NDQwOF5BMl5BanBnXkFtZTcwNDAyODAyNw@@._V1_SX300.jpg")
                    .actors(Arrays.asList("Rob Schneider", "Cheech Marin", "Claudia Bassols", "Diana Maria Riva"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Truth Be Told").funType("Series").rating(6.0).genre(Genre.COMEDY)
                    .director("DJ Nash").producer("N/A")
                    .year(2015).plot("A look at the life of two best friends, a meek politically correct Caucasian ethics professor and an easy-going African American, and their families.")
                    .runtime(21).poster("https://m.media-amazon.com/images/M/MV5BMTk5ODgwNTAwNl5BMl5BanBnXkFtZTgwMDgwMDI2NjE@._V1_SX300.jpg")
                    .actors(Arrays.asList())
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Dr. Ken").funType("Series").rating(5.8).genre(Genre.COMEDY)
                    .director("John Fox").producer("N/A")
                    .year(2015).plot("A frustrated doctor juggles his career, marriage, and family.")
                    .runtime(21).poster("https://m.media-amazon.com/images/M/MV5BZTAxNWE2ZDgtZjU2My00Yzk2LWIxZTUtMWRjMWU0ZDM1N2YwXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_SX300.jpg")
                    .actors(Arrays.asList("Ken Jeong", "Suzy Nakamura", "Tisha Campbell-Martin", "Jonathan Slavin"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("Making a Murderer").funType("Series").rating(8.6).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(2015).plot("Filmed over a 10-year period, Steven Avery, a DNA exoneree who, while in the midst of exposing corruption in local law enforcement, finds himself the prime suspect in a grisly new crime.")
                    .runtime(60).poster("https://m.media-amazon.com/images/M/MV5BMTg4Mjc1NjE4Ml5BMl5BanBnXkFtZTgwMjk2NjA1NjM@._V1_SX300.jpg")
                    .actors(Arrays.asList("Dolores Avery", "Steven Avery", "Ken Kratz", "Brendan Dassey"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("The West").funType("Series").rating(8.4).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(1996).plot("N/A")
                    .runtime(537).poster("https://m.media-amazon.com/images/M/MV5BZDA5MjIxYzktY2JiZS00OGZkLWJlZWItNjI5YWM0YjIzZmMxXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg")
                    .actors(Arrays.asList("Peter Coyote", "N. Scott Momaday", "Murphy Guyer", "John Trudell"))
                    .trailer("").build());

            seriesRepository.save(ScreenFun.builder().title("The Blue Planet").funType("Series").rating(8.9).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(2001).plot("Mammoth series, five years in the making, taking a look at the rich tapestry of life in the world's oceans.")
                    .runtime(389).poster("https://m.media-amazon.com/images/M/MV5BZGFhMGNmNDktYjY0Mi00YWE1LTlmMDQtZTBiNmU4NGYzZjZkXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg")
                    .actors(Arrays.asList("David Attenborough", "Pierce Brosnan"))
                    .trailer("").build());

//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());
//
//            seriesRepository.save(ScreenFun.builder().title("").funType("Series").rating().genre()
//                    .director("N/A").producer("N/A")
//                    .year().plot("")
//                    .runtime().poster("")
//                    .actors(Arrays.asList())
//                    .trailer("").build());



        };
    }


}
