package com.example.notifyapp.Repository;

import com.example.notifyapp.Model.GrupoModel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mathe on 08/12/2017.
 */

public class GroupRepository {



    private static final ArrayList<GrupoModel> GRUPO_MODELS = new ArrayList<GrupoModel>(Arrays.asList(

            new GrupoModel(1, "grupo1" ),
            new GrupoModel(2, "CWI"),
            new GrupoModel(3, "Teste")

    ));


    public static ArrayList<GrupoModel> getAll() {

        return GRUPO_MODELS;

    }

}
