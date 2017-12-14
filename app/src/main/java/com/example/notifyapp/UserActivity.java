package com.example.notifyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.notifyapp.Adapter.GroupAdapter;
import com.example.notifyapp.Model.Grupo;
import com.example.notifyapp.Model.GrupoModel;
import com.example.notifyapp.Repository.GroupRepository;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity  implements GroupAdapter.OnItemClickListener ,View.OnLongClickListener {

    private RecyclerView rvGrupos;
    private ArrayList<GrupoModel> grupoModels;
    private GroupAdapter grupoAdapter;
    private static final String TAG = "UserActivity";
    private ChildEventListener mChildEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        rvGrupos = findViewById(R.id.grupo_rv);

        populateRecyclerView();
    }

    private void populateRecyclerView(){

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Grupos");


        mChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
              dataSnapshot.getValue();

              Log.d(TAG, "value is " + dataSnapshot);

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        myRef.addChildEventListener(mChildEventListener);


        grupoModels = GroupRepository.getAll();
        rvGrupos.setLayoutManager(new LinearLayoutManager(this));
        grupoAdapter =  new GroupAdapter(grupoModels, this, this);
        rvGrupos.setAdapter(grupoAdapter);

    }




    @Override
    public boolean onLongClick(View view) {

        return true;
    }

    @Override
    public void onItemClick(GrupoModel grupoModel) {
        Intent intent = new Intent(this, GroupActivity.class);
        intent.putExtra("nomeGrupo", grupoModel);
        startActivity(intent);
    }
}
