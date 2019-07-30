package com.codecool.games.repository;

import com.codecool.games.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<ScreenFun, Long> {

}
