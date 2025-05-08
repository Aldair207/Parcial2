package com.example.parcial2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtContrasena;
    Button btnLogin;
    public static final String dataUserCache = "dataUser";
    private static final int modo_private = Context.MODE_PRIVATE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.edt_usuario);
        edtContrasena = findViewById(R.id.edt_contrasena);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(v -> {
            String usuario = edtUsuario.getText().toString();
            String contrasena = edtContrasena.getText().toString();

            if (usuario.isEmpty() || contrasena.isEmpty()) {
                Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_SHORT).show();
            } else if (usuario.equals("Aldair celedon") && contrasena.equals("12345678")) {
                Intent intent = new Intent(MainActivity.this, inic_fragment.class);
                intent.putExtra("respuesta", "Respuesta: Desarrollo multiplataforma permite crear apps con un solo código base");
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
