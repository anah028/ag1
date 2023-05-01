/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;

/**
 *
 * @author anilu
 */
public interface IPersonaService {

    //traer lista de persona
    public List<Persona> getPersona();

    //guardar un objeto tipo persona
    public void savePersona(Persona persona);

//eliminar un objeto buscando por ID
    public void deletePersona(Long id);

    //buscar persona por id
    public Persona findPersona(Long id);
}