package com.projetospring.cadastroUsuario.repository;

import com.projetospring.cadastroUsuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
