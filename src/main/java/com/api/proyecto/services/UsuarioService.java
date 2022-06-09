package com.api.proyecto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proyecto.models.Usuario;
import com.api.proyecto.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	
	 @Autowired
	    public UsuarioService(UsuarioRepository usuarioRepository) {
	        this.usuarioRepository = usuarioRepository;
	    }

	    public Usuario saveUser(Usuario  user){
	        return usuarioRepository.save(user);
	    }

	    public Usuario getUsuario(Long id){
	        return usuarioRepository.findById(id).orElse(null);
	    }
	    public ArrayList<Usuario> getUsuarios(){
	        return (ArrayList<Usuario>) usuarioRepository.findAll();
	    }
	    public Usuario updateUsuario(Usuario user){
	        return usuarioRepository.save(user);
	    }
	    
	    public String removeUsuario(Long id){
	    	usuarioRepository.deleteById(id);

	        return "Remove successful";

	    }
}
