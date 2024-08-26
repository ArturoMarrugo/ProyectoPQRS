package com.Proyecto_Aula.persistence.repository;


import com.Proyecto_Aula.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRole extends JpaRepository<Role, Long> {
}
