package com.website.backend.repository;

import com.website.backend.model.AboutUsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutUsRepo extends JpaRepository<AboutUsModel, Long> {
}
