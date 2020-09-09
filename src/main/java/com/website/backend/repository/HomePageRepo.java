package com.website.backend.repository;

import com.website.backend.model.HomePageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageRepo extends JpaRepository<HomePageModel, Long> {
}
