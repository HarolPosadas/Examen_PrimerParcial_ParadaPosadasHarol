package edu.mx.ipn.cecyt9.examen_primerparcial_paradaposadasharol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String Usuario = "harol";
    String Password = "123";
    String UsrObt = "";
    String PassObt = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView usr = (TextView)findViewById(R.id.usr);
        UsrObt = usr.getText().toString();

        TextView pass = (TextView)findViewById(R.id.pass);
        PassObt = pass.getText().toString();


    }

        public void Validar(View v){

            if(Usuario.toString().equals(UsrObt)&& Password.toString().equals(PassObt)){
            Toast toast1 = Toast.makeText(getApplicationContext(),
                    "Usuario correcto", Toast.LENGTH_SHORT);
            toast1.show();
        }
        else{
            Toast toast2 = Toast.makeText(getApplicationContext(),
                    "Usuario incorrecto", Toast.LENGTH_SHORT);
            toast2.show();
        }
    }
}
