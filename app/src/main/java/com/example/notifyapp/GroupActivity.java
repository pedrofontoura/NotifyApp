package com.example.notifyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.notifyapp.Adapter.GroupAdapter;
import com.example.notifyapp.Adapter.UserAdapter;
import com.example.notifyapp.Model.Grupo;
import com.example.notifyapp.Model.Usuario;
import com.example.notifyapp.Repository.GroupRepository;

import java.util.ArrayList;

public class GroupActivity extends AppCompatActivity implements View.OnLongClickListener{

    public Grupo grupo;
    private RecyclerView rvUsuarios;
    private ArrayList<Usuario> grupos;
    private UserAdapter grupoAdapter;
    private TextView nomeGrupoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        nomeGrupoTv = findViewById(R.id.nome_do_grupo_tv);
    rvUsuarios = findViewById(R.id.grupo_rv);

        populateRecyclerView();
    }

    private void populateRecyclerView(){

//        grupos = GroupRepository.getAll();
//        rvGrupos.setLayoutManager(new LinearLayoutManager(this));
//        grupoAdapter =  new GroupAdapter(grupos, this);
//        rvGrupos.setAdapter(grupoAdapter);

    }

//    private void bindGrupo() {
//        Intent intent = getIntent();
//        grupo = (Grupo) intent.getSerializableExtra("nomeGrupo");
////        setTitle(grupo.getNomeDoGrupo());
//        nomeGrupoTv.setText(grupo.getNomeDoGrupo());
//    }
        @Override
    public boolean onLongClick(View view) {
        return false;
    }
}


//    private void populateRecyclerView() {
//        troopers = TrooperRepository.tryGettingFromSharedPreferences(getSharedPreferences(Constants.PREFS_NAME, MODE_PRIVATE));
//
//        rvTroopers.setLayoutManager(new LinearLayoutManager(this));
//        trooperAdapter = new TrooperAdapter(troopers, this, this);
//        rvTroopers.setAdapter(trooperAdapter);
//    }