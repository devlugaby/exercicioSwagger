package com.Luana.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luana.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
