package com.example.springproject.repositories;

import com.example.springproject.models.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoryRepository extends JpaRepository<Story,Long> {

    @Query("SELECT s FROM Story s WHERE s.userId = :userId")
    List<Story> findAllByUser(@Param("userId") Long userId);
}
