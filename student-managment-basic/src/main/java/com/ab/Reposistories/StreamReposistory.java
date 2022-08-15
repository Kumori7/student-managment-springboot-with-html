package com.ab.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.Entities.Student;

@Repository
public interface StreamReposistory extends JpaRepository<Student, Integer> {

}
