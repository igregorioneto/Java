package org.jpa.core;

import org.jpa.modelo.basico.Usuario;

public class UsuarioDAO extends DAO<Usuario> {
    public UsuarioDAO() {
        super(Usuario.class);
    }
}
