package com.portfolio.melina.Interface;

import com.portfolio.melina.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminamos un objeto buscado por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
