package com.iara.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.iara.R;

public class LoginActivity extends AppCompatActivity {

    private com.iara.databinding.ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = com.iara.databinding.ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}