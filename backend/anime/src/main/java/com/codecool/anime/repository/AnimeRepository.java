package com.codecool.anime.repository;

import com.codecool.anime.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<ScreenFun, Long> {

    public List<ScreenFun> getAllByOrderByTitle();
}
