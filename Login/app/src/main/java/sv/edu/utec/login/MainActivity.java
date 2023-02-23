package sv.edu.utec.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usuario, contra;
    Button ingresar;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usuario = findViewById(R.id.edtUser);
        contra = findViewById(R.id.edtContra);
        ingresar = (Button) findViewById(R.id.btnLogin);

        result = findViewById(R.id.txtMensaje);


        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usuario.getText().toString().equals("parcialETps1") && contra.getText().toString().equals("p4rC14l#tp$")) {
                    Intent i = new Intent(MainActivity.this, LoginCorrecto.class);
                    startActivities(new Intent[]{i});
                }

            else {
                result.setText("El Usuario o Contraseña son incorrectos" );
            }
            }
        });

        }
    }