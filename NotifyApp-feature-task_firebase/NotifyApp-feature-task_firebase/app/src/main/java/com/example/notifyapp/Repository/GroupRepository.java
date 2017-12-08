package com.example.notifyapp.Repository;

import com.example.notifyapp.Model.Grupo;
import com.example.notifyapp.Model.Usuario;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mathe on 08/12/2017.
 */

public class GroupRepository {

    private static final ArrayList<Grupo> GRUPOS = new ArrayList<Grupo>(Arrays.asList(

            new Grupo(1, "grupo1" )



    ));


    public static ArrayList<Grupo> getAll() {

        return GRUPOS;

    }



}
