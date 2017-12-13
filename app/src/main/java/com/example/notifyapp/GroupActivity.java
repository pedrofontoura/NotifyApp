package com.example.notifyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.notifyapp.Adapter.UserAdapter;
import com.example.notifyapp.Model.GrupoModel;
import com.example.notifyapp.Model.Usuario;
import com.example.notifyapp.Repository.UserRepository;

import java.util.ArrayList;

public class GroupActivity extends AppCompatActivity implements UserAdapter.OnItemClickListener,View.OnLongClickListener{

    public Usuario usuario;
    private RecyclerView rvUsuarios;
    private ArrayList<Usuario> usuarios;
    private UserAdapter usuariosAdapter;
    private TextView nomeGrupoTv;
    private GrupoModel grupoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        nomeGrupoTv = findViewById(R.id.nome_do_grupo_tv);
        rvUsuarios = findViewById(R.id.lista_usuarios_rv);

       bindGrupo();
      populateRecyclerView();
    }

    private void populateRecyclerView(){

        usuarios = UserRepository.getAll();
        rvUsuarios.setLayoutManager(new LinearLayoutManager(this));
        usuariosAdapter =  new UserAdapter(usuarios, this, this);
        rvUsuarios.setAdapter(usuariosAdapter);

    }

    private void bindGrupo() {
        Intent intent = getIntent();
        grupoModel = (GrupoModel) intent.getSerializableExtra("nomeGrupo");
        nomeGrupoTv.setText(grupoModel.getNomeDoGrupo());
    }
    @Override
    public boolean onLongClick(View view) {




        return false;
    }

    @Override
    public void onItemClick(Usuario usuario) {

    }
}


