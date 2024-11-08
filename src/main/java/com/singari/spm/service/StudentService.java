package com.singari.spm.service;

import com.singari.spm.dto.StudentDto;
import jakarta.validation.Valid;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(@Valid StudentDto studentDto);

    void deleteStudent(Long studentId);
}
