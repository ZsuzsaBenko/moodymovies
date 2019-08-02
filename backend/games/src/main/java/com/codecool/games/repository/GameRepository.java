package com.codecool.games.repository;

import com.codecool.games.model.Genre;
import com.codecool.games.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<ScreenFun, Long> {

    ScreenFun getScreenFunsById(long id);

    List<ScreenFun> getScreenFunsByRatingLessThanEqualAndGenre(double rating, Genre genre);

    List<ScreenFun> getScreenFunsByRatingGreaterThanAndGenre(double rating, Genre genre);

    List<ScreenFun> getScreenFunsByGenre(Genre genre);
}
