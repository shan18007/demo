package com.swork.repo;

import org.springframework.data.repository.CrudRepository;

import com.swork.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
