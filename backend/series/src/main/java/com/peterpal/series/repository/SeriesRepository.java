package com.peterpal.series.repository;

import com.peterpal.series.model.Genre;
import com.peterpal.series.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepository extends JpaRepository<ScreenFun, Long> {

    List<ScreenFun> findByOrderByRatingAsc();

    List<ScreenFun> findAllByGenre(@Param("genre") Genre genre);

}
