package com.example.notifyapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private FirebaseAuth mAuth;
    private TextView btn_login;
    private EditText text_user;
    private EditText text_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        this.setupUI();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
        createDatabase();
    }

    private void updateUI(FirebaseUser currentUser) {
        if (currentUser == null) {

        }
    }

    private void createDatabase() {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Grupos");
        ArrayList<String> array = new ArrayList<String>();
        array.add("grupo1");
        array.add("grupo2");
        array.add("grupo3");
        myRef.setValue(array);
    }

    private void setupUI() {
        text_user = findViewById(R.id.login_view_usuario_2);
        text_pass = findViewById(R.id.login_view_senha_2);

        btn_login = findViewById(R.id.login_view_button_logar_2);
        btn_login.setOnClickListener(this);


    }

    private void createUser(String user, String pass) {
        mAuth.createUserWithEmailAndPassword(user, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                        // ...
                    }
                });
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent(this, UserActivity.class);
//        startActivity(intent);

        int i = v.getId();
        if (i == R.id.login_view_button_logar_2) {
            String usuario = text_user.getText().toString();
            String senha = text_pass.getText().toString();
            createUser(usuario, senha);
        }
    }
}
