package com.peterpal.demo.repository;

import com.peterpal.demo.model.ScreenFun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<ScreenFun, Long> {
}
