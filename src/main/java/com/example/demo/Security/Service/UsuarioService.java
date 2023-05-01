/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Security.Service;

import com.example.demo.Security.Entity.Usuario;
import com.example.demo.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
//import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
      @Autowired
      IUsuarioRepository iusuarioRepository;
      
      public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
          return iusuarioRepository.findByNombreUsuario(nombreUsuario);
      }
      
      public boolean existisByNombreUsuario(String nombreUsuario){
          return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
      }
      
       public boolean existisByEmail(String email){
          return iusuarioRepository.existsByEmail(email);
      }
       
       public void save(Usuario usuario){
           iusuarioRepository.save(usuario);
       }
}
