 package br.com.lucashsouza.calculadoradeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     private EditText editTextAltura;
     private EditText editTextPeso;
     private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularResultado(View view){
        double altura = Double.parseDouble(editTextAltura.getText().toString());
        double peso = Double.parseDouble(editTextPeso.getText().toString());
        double imc = peso/(altura * altura);

        if(imc <= 18.5){
            textResultado.setText("Abaixo do peso");
        } else if(imc > 18.5 && imc < 24.9){
            textResultado.setText("Peso normal");
        } else if(imc > 25.0 && imc < 29.9){
            textResultado.setText("Sobrepeso");
        } else if(imc > 30.0 && imc < 39.9){
            textResultado.setText("Obesidade tipo II");
        }
    }
}