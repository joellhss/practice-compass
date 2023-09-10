package com.github.joellhss.learnspringboot.courses.controller;

import com.github.joellhss.learnspringboot.courses.model.Course;
import com.github.joellhss.learnspringboot.courses.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseRepository repository;

    public CourseController(CourseRepository repository) {
        this.repository = repository;
    }



    @GetMapping
    public List<Course> getAllCourses() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        Optional<Course> repositoryById = repository.findById(id);
        if (repositoryById.isEmpty()) {
            throw new RuntimeException("Não há nenhuma correspondência para o id: " + id);
        }
        return repositoryById;
    }

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course) {
        repository.save(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
