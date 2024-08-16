package com.groupeisi.gestEtablissement.dao;

import com.groupeisi.gestEtablissement.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IStudent extends JpaRepository <StudentEntity, Long> {
    Optional<StudentEntity> findByEmail(String email);
    Optional<StudentEntity> findOneById(Long id);
    List<StudentEntity> findAllByOrderByIdDesc();
}
