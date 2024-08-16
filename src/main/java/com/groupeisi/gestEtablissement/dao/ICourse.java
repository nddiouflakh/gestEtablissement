package com.groupeisi.gestEtablissement.dao;

import com.groupeisi.gestEtablissement.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface ICourse extends JpaRepository <CourseEntity,Long> {
//    Optional<CourseEntity> findById(Long id);
}
