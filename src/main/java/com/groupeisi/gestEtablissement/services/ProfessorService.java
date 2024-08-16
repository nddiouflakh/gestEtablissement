package com.groupeisi.gestEtablissement.services;

import com.groupeisi.gestEtablissement.dao.IProfessor;
import com.groupeisi.gestEtablissement.dao.IStudent;
import com.groupeisi.gestEtablissement.entity.ProfessorEntity;
import com.groupeisi.gestEtablissement.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private IProfessor iProfessorService;


}
