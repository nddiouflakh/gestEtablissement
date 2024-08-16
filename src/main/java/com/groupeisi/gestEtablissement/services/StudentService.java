package com.groupeisi.gestEtablissement.services;

import com.groupeisi.gestEtablissement.dao.IStudent;
import com.groupeisi.gestEtablissement.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudent iStudentService;

    public List<StudentEntity> getAllStudents() {
        return iStudentService.findAll();
    }
    public StudentEntity getStudentEntityById(long id) {
        return (StudentEntity) (StudentEntity) getAllStudents();
    }
    @Component
    public class StudentResolver implements GraphQLQueryResolver {
        @Autowired
        private StudentService studentService;

        public List<StudentEntity> students() {
            return studentService.getAllStudents();
        }
        public StudentEntity studentEntity(Long id) {
            return studentService.getStudentEntityById(id);
        }
    }
}

