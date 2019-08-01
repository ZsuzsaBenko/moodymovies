package com.peterpal.series.repository;

import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeriesRepository extends JpaRepository<ScreenFun, Long> {
    List<ScreenFun> findByOrderByRatingAsc();
    List<ScreenFun> findAllByGenre(Genre genre);

}
