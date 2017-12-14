package com.example.notifyapp.Model;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mathe on 14/12/2017.
 */
@IgnoreExtraProperties
public class Grupo {


    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public Map<String, Boolean> stars = new HashMap<>();

    public void setNomeDoGrupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
    }

    private String nomeDoGrupo;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
    }

    public Grupo(){

    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("nomeDoGrupo", nomeDoGrupo);

        return result;
    }
}
