package br.org.catolicasc.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText barraAdd;
    private Button button;
    private Button button2;
    private ListView lista;
    private ArrayList<String> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        barraAdd = findViewById(R.id.BarraAdd);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        lista = findViewById(R.id.Lista);
        produtos = new ArrayList<>();

        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener2);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            produtos.add(barraAdd.getText().toString());
            ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, produtos);
            lista.setAdapter(arrayAdapter);
            barraAdd.setText("");  //DEixa a barra de escrita em branco apos clicar o botão

        }
    };

    View.OnClickListener onClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,DownloadImagem.class);
            startActivity(intent);
        }
    };

    }

