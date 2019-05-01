package br.org.catolicasc.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.Login);
        senha = findViewById(R.id.Senha);
        button = findViewById(R.id.Botao);

        button.setOnClickListener(onClickListener);

    }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String loginTop = login.getText().toString();
                final String senhaTop = senha.getText().toString();

                if (loginTop.equals("Ricardo") && senhaTop.equals("123")){
                    Toast.makeText(LoginActivity.this, "ENTROU", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);  //Vai para a outra TELA
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Senha invalida", Toast.LENGTH_SHORT).show();
                }


            }
        };


    }

