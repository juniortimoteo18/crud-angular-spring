package com.motto.crudspring.repository;

import com.motto.crudspring.model.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long>{
     
}
