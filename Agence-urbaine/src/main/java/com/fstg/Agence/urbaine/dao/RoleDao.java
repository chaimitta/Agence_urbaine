package com.fstg.Agence.urbaine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.Agence.urbaine.bean.Role;
import com.fstg.Agence.urbaine.bean.User;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    
}
