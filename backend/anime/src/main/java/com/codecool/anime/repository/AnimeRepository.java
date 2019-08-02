package com.codecool.anime.repository;

import com.codecool.anime.model.Genre;
import com.codecool.anime.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<ScreenFun, Long> {

    List<ScreenFun> getAllByOrderByTitle();

    List<ScreenFun> getScreenFunsByRatingGreaterThanAndGenre(double rating, Genre genre);

    List<ScreenFun> getScreenFunsByRatingLessThanEqualAndGenre(double rating, Genre genre);
}
