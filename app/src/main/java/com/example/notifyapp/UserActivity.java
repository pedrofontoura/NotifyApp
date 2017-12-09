package com.example.notifyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.notifyapp.Adapter.GroupAdapter;
import com.example.notifyapp.Model.Grupo;
import com.example.notifyapp.Repository.GroupRepository;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity  implements View.OnLongClickListener {

    private RecyclerView rvGrupos;
    private ArrayList<Grupo> grupos;
    private GroupAdapter grupoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        rvGrupos = findViewById(R.id.grupo_rv);

        populateRecyclerView();
    }

    private void populateRecyclerView(){

        grupos = GroupRepository.getAll();
        rvGrupos.setLayoutManager(new LinearLayoutManager(this));
        grupoAdapter =  new GroupAdapter(grupos, this);
        rvGrupos.setAdapter(grupoAdapter);

    }




    @Override
    public boolean onLongClick(View view) {

        Intent intent = new Intent(this, GroupActivity.class);
        intent.putExtra("nomeGrupo", grupos);
        startActivity(intent);
        return false;
    }
}
