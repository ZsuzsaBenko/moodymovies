package com.peterpal.series;

import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import com.peterpal.series.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class SeriesApplication {

    @Autowired
    SeriesRepository seriesRepository;

    public static void main(String[] args) {
        SpringApplication.run(SeriesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/series/**"))
                .build();
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {

            seriesRepository.save(ScreenFun.builder().title("Game of Thrones").funType("series").rating(9.5).genre(Genre.FANTASY)
                    .director("N/A").producer("N/A")
                    .year(2011).plot("Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.")
                    .runtime(57).poster("got.jpg")
                    .actors(Arrays.asList("Peter Dinklage", "Lena Headey", "Emilia Clarke", "Kit Harington"))
                    .trailer("https://www.youtube.com/embed/rlR4PJn8b8I").build());

            seriesRepository.save(ScreenFun.builder().title("Airwolf").funType("series").rating(6.8).genre(Genre.ADVENTURE)
                    .director("N/A").producer("N/A")
                    .year(1984).plot("As part of a deal with an intelligence agency to look for his missing brother, a renegade pilot goes on missions with an advanced battle helicopter.")
                    .runtime(60).poster("airwolf.jpg")
                    .actors(Arrays.asList("Jan-Michael Vincent", "Alex Cord", "Ernest Borgnine", "Jean Bruce Scott"))
                    .trailer("https://www.youtube.com/watch?v=ZE44r_EvCXc").build());

            seriesRepository.save(ScreenFun.builder().title("Homeland").funType("series").rating(8.3).genre(Genre.CRIME)
                    .director("N/A").producer("N/A")
                    .year(2011).plot("A bipolar CIA operative becomes convinced a prisoner of war has been turned by al-Qaeda and is planning to carry out a terrorist attack on American soil.")
                    .runtime(55).poster("homeland.jpg")
                    .actors(Arrays.asList("Claire Danes", "Mandy Patinkin", "Rupert Friend", "Maury Sterling"))
                    .trailer("https://www.youtube.com/watch?v=KyFmS3wRPCQ").build());

            seriesRepository.save(ScreenFun.builder().title("Rob").funType("series").rating(5.6).genre(Genre.COMEDY)
                    .director("N/A").producer("N/A")
                    .year(2012).plot("Centers on solitary guy, Rob, who marries into a huge Mexican-American family.")
                    .runtime(30).poster("rob.jpg")
                    .actors(Arrays.asList("Rob Schneider", "Cheech Marin", "Claudia Bassols", "Diana Maria Riva"))
                    .trailer("https://www.youtube.com/watch?v=GY47MwFWhPg").build());

            seriesRepository.save(ScreenFun.builder().title("Truth Be Told").funType("series").rating(6.0).genre(Genre.COMEDY)
                    .director("DJ Nash").producer("N/A")
                    .year(2015).plot("A look at the life of two best friends, a meek politically correct Caucasian ethics professor and an easy-going African American, and their families.")
                    .runtime(21).poster("tbt.jpg")
                    .actors(Arrays.asList())
                    .trailer("https://www.youtube.com/watch?v=yTuxhQt94zU").build());

            seriesRepository.save(ScreenFun.builder().title("Dr. Ken").funType("series").rating(5.8).genre(Genre.COMEDY)
                    .director("John Fox").producer("N/A")
                    .year(2015).plot("A frustrated doctor juggles his career, marriage, and family.")
                    .runtime(21).poster("drken.jpg")
                    .actors(Arrays.asList("Ken Jeong", "Suzy Nakamura", "Tisha Campbell-Martin", "Jonathan Slavin"))
                    .trailer("https://www.imdb.com/videoplayer/vi2160898841").build());

            seriesRepository.save(ScreenFun.builder().title("Making a Murderer").funType("series").rating(8.6).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(2015).plot("Filmed over a 10-year period, Steven Avery, a DNA exoneree who, while in the midst of exposing corruption in local law enforcement, finds himself the prime suspect in a grisly new crime.")
                    .runtime(60).poster("mam.jpg")
                    .actors(Arrays.asList("Dolores Avery", "Steven Avery", "Ken Kratz", "Brendan Dassey"))
                    .trailer("https://www.youtube.com/watch?v=qxgbdYaR_KQ").build());

            seriesRepository.save(ScreenFun.builder().title("The West").funType("series").rating(8.4).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(1996).plot("N/A")
                    .runtime(537).poster("thewest.jpg")
                    .actors(Arrays.asList("Peter Coyote", "N. Scott Momaday", "Murphy Guyer", "John Trudell"))
                    .trailer("https://www.youtube.com/watch?v=aRq83NLacbE").build());

            seriesRepository.save(ScreenFun.builder().title("The Blue Planet").funType("series").rating(8.9).genre(Genre.DOCUMENTARY)
                    .director("N/A").producer("N/A")
                    .year(2001).plot("Mammoth series, five years in the making, taking a look at the rich tapestry of life in the world's oceans.")
                    .runtime(389).poster("tbp.jpg")
                    .actors(Arrays.asList("David Attenborough", "Pierce Brosnan"))
                    .trailer("https://www.youtube.com/watch?v=-pdlqV4fo68").build());

            seriesRepository.save(ScreenFun.builder().title("Six Feet Under").funType("series").rating(8.7).genre(Genre.DRAMA)
                    .director("Alan Ball").producer("N/A")
                    .year(2001).plot("A chronicle of the lives of a dysfunctional family who run an independent funeral home in Los Angeles.")
                    .runtime(55).poster("sfu.jpg")
                    .actors(Arrays.asList("Peter Krause", "Michael C. Hall", "Frances Conroy", "Lauren Ambrose"))
                    .trailer("https://www.youtube.com/watch?v=VT6Fq1ENb8s").build());

            seriesRepository.save(ScreenFun.builder().title("Euphoria").funType("series").rating(8.1).genre(Genre.DRAMA)
                    .director("Sam Levinson").producer("N/A")
                    .year(2019).plot("A look at life for a group of high school students as they grapple with issues of drugs, sex, and violence.")
                    .runtime(55).poster("euphoria.jpg")
                    .actors(Arrays.asList("Zendaya", "Maude Apatow", "Angus Cloud", "Eric Dane"))
                    .trailer("https://www.youtube.com/watch?v=sTZ6NBPmWc4").build());

            seriesRepository.save(ScreenFun.builder().title("The Colbys").funType("series").rating(6.3).genre(Genre.DRAMA)
                    .director("William Bast").producer("N/A")
                    .year(1985).plot("This spin-off of Dynasty (1981) featured the adventures of Jeff and Fallon Colby in California.")
                    .runtime(60).poster("colbies.jpg")
                    .actors(Arrays.asList("Charlton Heston", "John James", "Katharine Ross", "Emma Samms"))
                    .trailer("https://www.youtube.com/watch?v=qZMSg8v11Ms").build());

            seriesRepository.save(ScreenFun.builder().title("Supertrain").funType("series").rating(4.6).genre(Genre.DRAMA)
                    .director("Earl W. Wallace").producer("N/A")
                    .year(1979).plot("The adventures of a nation-spanning train and its passengers.")
                    .runtime(60).poster("supertrain.jpg")
                    .actors(Arrays.asList("Edward Andrews", "Harrison Page", "Robert Alda", "Patrick Collins"))
                    .trailer("https://www.youtube.com/watch?v=gUERtAe73NI").build());

            seriesRepository.save(ScreenFun.builder().title("Ironside").funType("series").rating(7.0).genre(Genre.CRIME)
                    .director("Collier Young").producer("N/A")
                    .year(1967).plot("Wheelchair-bound detective Robert T. Ironside battles the bad guys on the streets of San Francisco.")
                    .runtime(60).poster("ironside.jpg")
                    .actors(Arrays.asList("Raymond Burr", "Don Galloway", "Don Mitchell", "Barbara Anderson"))
                    .trailer("https://www.youtube.com/watch?v=NfLPYL3NcWM").build());

            seriesRepository.save(ScreenFun.builder().title("Lost").funType("series").rating(8.4).genre(Genre.ADVENTURE)
                    .director("J.J. Abrams").producer("N/A")
                    .year(2004).plot("The survivors of a plane crash are forced to work together in order to survive on a seemingly deserted tropical island.")
                    .runtime(44).poster("lost.jpg")
                    .actors(Arrays.asList("Jorge Garcia", "Josh Holloway", "Yunjin Kim", "Evangeline Lilly"))
                    .trailer("https://www.youtube.com/watch?v=KTu8iDynwNc").build());

        };
    }


}
