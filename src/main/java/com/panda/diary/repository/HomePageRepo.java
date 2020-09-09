package com.panda.diary.repository;

import com.panda.diary.model.HomePageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageRepo extends JpaRepository<HomePageModel, Long> {
}
