package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkTeclado, chkMouse, chkMonitor, chkHeadset, chkWebcam;
    private RadioGroup rgArmazenamento;
    private Switch swBackup;
    private Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkTeclado = findViewById(R.id.chkTeclado);
        chkMouse = findViewById(R.id.chkMouse);
        chkMonitor = findViewById(R.id.chkMonitor);
        chkHeadset = findViewById(R.id.chkHeadset);
        chkWebcam = findViewById(R.id.chkWebcam);
        rgArmazenamento = findViewById(R.id.rgArmazenamento);
        swBackup = findViewById(R.id.swBackup);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnFinalizar.setOnClickListener(v -> {
            StringBuilder resumo = new StringBuilder();
            resumo.append("Setup TI:\n");

            if (chkTeclado.isChecked()) resumo.append("- Teclado\n");
            if (chkMouse.isChecked()) resumo.append("- Mouse\n");
            if (chkMonitor.isChecked()) resumo.append("- Monitor\n");
            if (chkHeadset.isChecked()) resumo.append("- Headset\n");
            if (chkWebcam.isChecked()) resumo.append("- Webcam\n");

            int idRadio = rgArmazenamento.getCheckedRadioButtonId();
            if (idRadio != -1) {
                RadioButton rb = findViewById(idRadio);
                resumo.append("Disco: ").append(rb.getText()).append("\n");
            }

            if (swBackup.isChecked()) {
                resumo.append("Backup: Habilitado");
            } else {
                resumo.append("Backup: Desabilitado");
            }

            Toast.makeText(this, resumo.toString(), Toast.LENGTH_LONG).show();
        });
    }
}