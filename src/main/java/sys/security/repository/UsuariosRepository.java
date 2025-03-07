package sys.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sys.security.model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
