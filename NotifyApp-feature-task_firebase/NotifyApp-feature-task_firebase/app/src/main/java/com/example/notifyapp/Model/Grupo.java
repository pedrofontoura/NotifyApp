package com.example.notifyapp.Model;

/**
 * Created by mathe on 08/12/2017.
 */

public class Grupo {



    private int Id;
    private String nomeDoGrupo;
    private Usuario[] usuarios;

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void setNomeDoGrupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Grupo(int id, Usuario[] usuarios) {
        Id = id;
        this.usuarios = usuarios;
    }

    public Grupo(int id, String nomeDoGrupo) {
        Id = id;
        this.nomeDoGrupo = nomeDoGrupo;
    }


    public Grupo(int id, String nomeDoGrupo, Usuario[] usuarios) {
        Id = id;
        this.nomeDoGrupo = nomeDoGrupo;
        this.usuarios = usuarios;
    }
}
