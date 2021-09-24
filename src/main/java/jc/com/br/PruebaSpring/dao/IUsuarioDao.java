package jc.com.br.PruebaSpring.dao;

import jc.com.br.PruebaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
