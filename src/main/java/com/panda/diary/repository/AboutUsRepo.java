package com.panda.diary.repository;

import com.panda.diary.model.AboutUsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutUsRepo extends JpaRepository<AboutUsModel, Long> {
}
