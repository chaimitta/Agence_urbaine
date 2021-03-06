package com.fstg.Agence.urbaine.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.TauxTaxe;
import com.fstg.Agence.urbaine.bean.TypeDossier;
import com.fstg.Agence.urbaine.bean.TypeProjet;

@Repository
public interface TauxTaxeDao extends JpaRepository<TauxTaxe, Long> {
	
	public List<TauxTaxe> findByTypeDossier(TypeDossier typeDossier);

	public List<TauxTaxe> findByTypeProjet(TypeProjet typeProjet);
	
	public List<TauxTaxe> findByTypeDossierAndTypeProjet(TypeDossier typeDossier, TypeProjet typeProjet);
	
	public List<TauxTaxe> findByDateDepartApplicationBefore(Date date);
	
	public List<TauxTaxe> findByDateFinApplicationAfter(Date date);
	
	public TauxTaxe findByTypeDossierAndTypeProjetAndDateDepartApplicationBeforeAndDateFinApplicationAfter(TypeDossier typeDossier, TypeProjet typeProjet, Date date, Date date2);
	
	public boolean existsByTypeDossierAndTypeProjetAndDateDepartApplicationAndDateFinApplication(TypeDossier typeDossier, TypeProjet typeProjet, Date dateDepart, Date dateFin);
}
