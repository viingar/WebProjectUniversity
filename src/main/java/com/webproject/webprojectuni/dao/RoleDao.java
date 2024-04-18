package com.webproject.webprojectuni.dao;

import com.webproject.webprojectuni.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}