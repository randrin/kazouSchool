package com.kazou.school.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kazou.school.model.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {

}
