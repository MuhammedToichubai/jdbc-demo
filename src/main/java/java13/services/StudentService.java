package java13.services;

import java13.models.Student;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */
public interface StudentService {

    //create table
    void createTable();
    String saveStudent(Student newStudent);

    //find by id
    Student findById(Long id);

    //find all
    List<Student> findAll();

    //delete by id
    boolean deleteById(Long id);

    //update
    String updateById(Long id, Student newStudent);
}
