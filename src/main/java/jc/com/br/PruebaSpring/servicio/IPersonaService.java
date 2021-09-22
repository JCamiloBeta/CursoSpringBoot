package jc.com.br.PruebaSpring.servicio;

import jc.com.br.PruebaSpring.domain.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> listarPersona();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
