package java13.dao;

import java13.models.Student;

import java.util.List;
import java.util.Optional;

/**
 * @author Mukhammed Asantegin
 */
public interface StudentDao {
    //create students table
    void createTable();

    //save student
    boolean saveStudent(Student newStudent);

    //find by id
    Optional<Student> findById(Long id);

    //find all
    List<Student> findAll();

    //delete by id
    boolean deleteById(Long id);

    //update
    boolean updateById(Long id, Student newStudent);

}
