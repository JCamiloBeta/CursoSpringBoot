package jc.com.br.PruebaSpring.dao;


import jc.com.br.PruebaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}