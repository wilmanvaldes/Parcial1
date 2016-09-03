package com.example.jvaldes.parcial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
                String password = ((EditText) findViewById(R.id.txtpassword)).getText().toString();
                if(usuario.equals("Admin")&& password.equals("Admin"))
                {
                  Intent nuevoform = new Intent(Login.this,Pantalla2.class);
                  startActivity(nuevoform);
                }// cierra if
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();

                } // cierra else

            }//cierra onClick
             });
    }// cierra oncreate
}