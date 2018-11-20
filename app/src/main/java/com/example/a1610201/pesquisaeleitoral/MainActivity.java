package com.example.a1610201.pesquisaeleitoral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private int votosTotais;
    private int voto1;
    private int voto2;
    private int voto3;
    private int voto4;

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;


    private TextView votos1;
    private TextView votos2;
    private TextView votos3;
    private TextView votos4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        votos1 = findViewById(R.id.votos1);
        votos2 = findViewById(R.id.votos2);
        votos3 = findViewById(R.id.votos3);
        votos4 = findViewById(R.id.votos4);

        addListenerOnButton();
    }


    public void addListenerOnButton() {
        //TODO(1) E as porcentagens?
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto1+=1;
                votos1.setText(String.valueOf(voto1));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto2+=1;
                votos2.setText(String.valueOf(voto2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto3+=1;
                votos3.setText(String.valueOf(voto3));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto4+=1;
                votos4.setText(String.valueOf(voto4));
            }
        });

    }

}