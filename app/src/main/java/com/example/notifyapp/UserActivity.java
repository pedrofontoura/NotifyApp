package com.example.notifyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.notifyapp.Adapter.GroupAdapter;
import com.example.notifyapp.Model.GrupoModel;
import com.example.notifyapp.Repository.GroupRepository;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity  implements GroupAdapter.OnItemClickListener ,View.OnLongClickListener {

    private RecyclerView rvGrupos;
    private ArrayList<GrupoModel> grupoModels;
    private GroupAdapter grupoAdapter;
    private static final String TAG = "UserActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        rvGrupos = findViewById(R.id.grupo_rv);

        populateRecyclerView();
    }

    private void populateRecyclerView(){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Grupos");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<GrupoModel> value = (ArrayList) dataSnapshot.getValue();
                Log.d(TAG, "value is " + value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "Failed to read Value", databaseError.toException());
            }
        });

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
