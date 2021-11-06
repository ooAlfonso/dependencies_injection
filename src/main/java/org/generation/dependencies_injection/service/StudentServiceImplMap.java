package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImplMap
        implements StudentService
{
    private final Map<Integer, String> studentList = new HashMap<>();

    private void addStudents() {
        studentList.put(1, "Carlos Eduardo");
        studentList.put(2, "Rodrigo");
        studentList.put(3, "Marina");

    }


    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> all() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return null;
    }
}
