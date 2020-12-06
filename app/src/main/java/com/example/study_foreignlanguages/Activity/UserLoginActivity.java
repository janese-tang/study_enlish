package com.example.study_foreignlanguages.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.study_foreignlanguages.R;

public class UserLoginActivity extends AppCompatActivity {
    private EditText username_et,password_et;
    Button login_bt;
    TextView regist_bt;
    SharedPreferences sp=null;
    SharedPreferences.Editor editor=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        username_et=findViewById(R.id.username);
        password_et=findViewById(R.id.passname);
        login_bt=findViewById(R.id.login);
    }
}