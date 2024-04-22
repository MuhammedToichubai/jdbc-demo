package java13.services;

import java13.dao.StudentDao;
import java13.dao.StudentDaoImpl;
import java13.models.Student;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */
public class StudentServiceImpl implements StudentService{
    private final StudentDao studentDao = new StudentDaoImpl();
    @Override
    public void createTable() {
        studentDao.createTable();
    }

    @Override
    public String saveStudent(Student newStudent) {
        return
              !(studentDao.saveStudent(newStudent)) ? "Student successfully saved" : "Error: Failed to save student";
    }

    @Override
    public Student findById(Long id) {
       return studentDao.findById(id).orElseThrow(() ->
               new RuntimeException("Student with id: "+id+" not found!"));
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public String updateById(Long id, Student newStudent) {
        boolean result = studentDao.updateById(id, newStudent);
        return result ? "Student with id: "+ id+ "successfully updated" :
                         "Failed to update student with id: "+id;
    }

}
