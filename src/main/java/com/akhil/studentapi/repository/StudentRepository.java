package com.akhil.studentapi.repository;

import com.akhil.studentapi.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
