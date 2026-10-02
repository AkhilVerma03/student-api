package com.akhil.studentapi.service;

import com.akhil.studentapi.Student;
import com.akhil.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {

        return studentRepository.findAll();
    }
    public Student findById(Long id) {

        return studentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Student not found"));
    }
    public Student save(Student student) {

        return studentRepository.save(student);
    }
    public Student updateStudent(Long id , Student student) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Student not found"));
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(Long id) {
        Student deletingStudent = studentRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("Student not found"));
        studentRepository.delete(deletingStudent);
    }
}
