package com.codecool.games.repository;

import com.codecool.games.model.Genre;
import com.codecool.games.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<ScreenFun, Long> {

    ScreenFun getFirstByGenre(@Param("genre") Genre genre);

    ScreenFun getScreenFunsById(@Param("id") long id);

    List<ScreenFun> getScreenFunsByRatingLessThanEqualAndGenre(@Param("rating") double rating, @Param("genre") Genre genre);

    List<ScreenFun> getScreenFunsByRatingGreaterThanAndGenre(@Param("rating") double rating, @Param("genre") Genre genre);

    List<ScreenFun> getScreenFunsByGenre(@Param("genre") Genre genre);
}
