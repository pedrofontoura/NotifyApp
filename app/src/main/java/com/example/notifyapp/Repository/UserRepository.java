package com.example.notifyapp.Repository;

import com.example.notifyapp.Model.Usuario;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lslopes on 09/12/2017.
 */

public class UserRepository {

    private static final ArrayList<Usuario> USUARIOS = new ArrayList<Usuario>(Arrays.asList(

            new Usuario(1,"Matheos"),
            new Usuario(2, "Leandro")

    ));


    public static ArrayList<Usuario> getAll() {

            return USUARIOS;

    }

}
