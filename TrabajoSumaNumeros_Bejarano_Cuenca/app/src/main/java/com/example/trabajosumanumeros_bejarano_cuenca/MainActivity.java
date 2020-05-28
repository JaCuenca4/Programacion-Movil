package com.example.trabajosumanumeros_bejarano_cuenca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numero1;
    private TextView numero2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1=findViewById(R.id.txtNum1);
        numero2=findViewById(R.id.txtNum2);
        respuesta=findViewById(R.id.lblRespuesta);

    }

    public void sumar(View view){
        int resp=Integer.parseInt(numero1.getText().toString())+Integer.parseInt(numero2.getText().toString());
            respuesta.setText(resp+"");
    }
}
