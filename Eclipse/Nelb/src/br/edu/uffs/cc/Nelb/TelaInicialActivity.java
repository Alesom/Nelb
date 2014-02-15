package br.edu.uffs.cc.Nelb;

//importa��o das classes necess�rias para o funcionamento do aplicativo
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class TelaInicialActivity extends Activity {

  //vari�veis que usaremos durante o processo
  private Button btLocalizar;

  @Override // M�todo onCreate, iniciada quando o aplicativo � aberto
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.tela_inicial);
    //  setupElements();
      btLocalizar = (Button) findViewById(R.id.btLocalizar);
      btLocalizar.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v){
        	  Intent TrocaTela=new Intent(TelaInicialActivity.this, BuscaLocalizacao.class);
        	  TelaInicialActivity.this.startActivity(TrocaTela);
        	  TelaInicialActivity.this.finish();
        	  
          }
      });
      
  }

  // M�todo usado para importar os elementos da classe R
  
  //M�todo que faz a leitura de fato dos valores recebidos do GPS
 
 
}