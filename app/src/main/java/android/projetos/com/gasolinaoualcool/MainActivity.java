package android.projetos.com.gasolinaoualcool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private  EditText precoGasolina;
    private Button botaoVerificar;
    private TextView resultadoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar itens de tela
        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.buttonResultadoId);
        resultadoTexto = (TextView) findViewById(R.id.textoResultadoId);

        //adicionar evento clique
        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recupera valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converte valores string para numeros
                Double valorAlcool = Double.parseDouble( textoPrecoAlcool );
                Double valorGasolina = Double.parseDouble( textoPrecoGasolina );

                //faz o calculo
                double resultado = valorAlcool / valorGasolina;
                resposta(resultado);


            }
        });

}

    private void resposta(double resultado) {
        if( resultado <= 0.7 ){
            resultadoTexto.setText("É melhor utilizar Alcool ");
        }else{
            resultadoTexto.setText("É melhor utilizar Gasolina ");
        }
    }


}

