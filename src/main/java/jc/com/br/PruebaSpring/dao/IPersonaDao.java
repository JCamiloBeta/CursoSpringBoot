package jc.com.br.PruebaSpring.dao;


import jc.com.br.PruebaSpring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long> {
}