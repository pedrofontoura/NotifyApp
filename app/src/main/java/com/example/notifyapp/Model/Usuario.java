package com.example.notifyapp.Model;

/**
 * Created by mathe on 08/12/2017.
 */

public class Usuario {


    private int Id;
    private String name;
    private String senha;


    public Usuario(int id, String name, String senha) {
        Id = id;
        this.name = name;
        this.senha = senha;
    }

    public Usuario(int id, String name) {
        Id = id;
        this.name = name;

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
