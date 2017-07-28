package android.projetos.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button verificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoAlcoolId);
        resultado = (TextView) findViewById(R.id.precoAlcoolId);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double valorAlcool = Double.parseDouble(precoAlcool.getText().toString());
                Double valorGasolina = Double.parseDouble(precoGasolina.getText().toString());

                resultadoConta(valorAlcool, valorGasolina);

            }

        });
}

public void resultadoConta(double valorAlcool, double valorGasolina){
    if(valorAlcool/valorGasolina >= 0.7){
        resultado.setText("Melhor usar gasolina.");
    }else{
        resultado.setText("Melhor usar alcool.");
    }
}

}

