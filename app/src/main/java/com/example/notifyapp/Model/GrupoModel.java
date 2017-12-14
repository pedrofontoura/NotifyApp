package com.example.notifyapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mathe on 08/12/2017.
 */

public class GrupoModel implements Serializable{



    private int Id;
    private String nomeDoGrupo;
    private ArrayList<Usuario> usuarios;


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

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }



    public GrupoModel(int id, String nomeDoGrupo) {
        Id = id;
        this.nomeDoGrupo = nomeDoGrupo;
    }

    public GrupoModel(String nomeDoGrupo) {
       this.nomeDoGrupo = nomeDoGrupo;
    }


    public GrupoModel(int id, String nomeDoGrupo, ArrayList<Usuario> usuarios) {
        Id = id;
        this.nomeDoGrupo = nomeDoGrupo;
        this.usuarios = usuarios;
    }
}
