package com.codecool.games.repository;

import com.codecool.games.model.Genre;
import com.codecool.games.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<ScreenFun, Long> {

    List<ScreenFun> getScreenFunsByGenre(@Param("genre") Genre genre);

    ScreenFun getScreenFunsById(@Param("id") long id);
}
