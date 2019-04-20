package br.com.caicosoft.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.btnAbrirAlertDialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAlertDialog();
            }
        });
    }

    public void abrirAlertDialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("AlertDialog");
        dialog.setMessage("Esta aberta!");

        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        //configura cancelamento
        dialog.setCancelable(false); // false: nao consegue fechar a dialog sem clicar em uma das opções

        //configura icone
        dialog.setIcon(android.R.drawable.ic_dialog_map);

        //criar e exibir
        dialog.create();
        dialog.show();
    }
}
