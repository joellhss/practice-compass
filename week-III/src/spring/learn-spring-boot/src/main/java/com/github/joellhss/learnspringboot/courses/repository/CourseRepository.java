package com.github.joellhss.learnspringboot.courses.repository;

import com.github.joellhss.learnspringboot.courses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
