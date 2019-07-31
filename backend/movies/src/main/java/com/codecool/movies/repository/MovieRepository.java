package com.codecool.movies.repository;

import com.codecool.movies.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<ScreenFun, Long> {
}
