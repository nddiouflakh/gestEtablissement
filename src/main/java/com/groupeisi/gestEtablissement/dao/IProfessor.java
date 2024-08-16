package com.groupeisi.gestEtablissement.dao;

import com.groupeisi.gestEtablissement.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProfessor extends JpaRepository <ProfessorEntity, Long> {
    Optional<ProfessorEntity> findByEmail(String email);
}
