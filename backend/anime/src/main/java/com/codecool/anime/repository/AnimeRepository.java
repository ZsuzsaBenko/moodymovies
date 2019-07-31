package com.codecool.anime.repository;

import com.codecool.anime.model.Genre;
import com.codecool.anime.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<ScreenFun, Long> {

    List<ScreenFun> getAllByOrderByTitle();

    List<ScreenFun> getScreenFunsByRatingGreaterThanAndGenre(@Param("rating") double rating, @Param("genre") Genre genre);

    List<ScreenFun> getScreenFunsByRatingLessThanEqualAndGenre(@Param("rating") double rating, @Param("genre") Genre genre);
}
