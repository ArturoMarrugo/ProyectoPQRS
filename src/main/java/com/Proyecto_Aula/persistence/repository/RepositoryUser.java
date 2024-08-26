package com.Proyecto_Aula.persistence.repository;

import com.Proyecto_Aula.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<User, Long> {
}
