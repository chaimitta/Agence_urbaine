/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.dao;

import com.fstg.Agence.urbaine.bean.Dossier;
import com.fstg.Agence.urbaine.bean.Observation;
import com.fstg.Agence.urbaine.bean.User;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chaimaa
 */
@Repository
public interface ObservationDao extends JpaAttributeConverter<Observation, Long>{
    public Observation findByUserAndDossier(User user, Dossier dossier);
}
