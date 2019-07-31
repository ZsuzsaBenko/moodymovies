package com.peterpal.demo.repository;

import com.peterpal.demo.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeriesRepository extends JpaRepository<ScreenFun, Long> {
    List<ScreenFun> findByOrderByRatingAsc();
}
