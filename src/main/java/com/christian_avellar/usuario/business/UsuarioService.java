package com.christian_avellar.usuario.business;


import com.christian_avellar.usuario.business.converter.UsuarioConverter;
import com.christian_avellar.usuario.business.dto.UsuarioDTO;
import com.christian_avellar.usuario.infrastructure.entity.Usuario;
import com.christian_avellar.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;


    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }

}
