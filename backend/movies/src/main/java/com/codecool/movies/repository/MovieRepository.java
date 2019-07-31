package com.codecool.movies.repository;

import com.codecool.movies.model.Genre;
import com.codecool.movies.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<ScreenFun, Long> {

    List<ScreenFun> findAllByGenre(Genre genre);
}
