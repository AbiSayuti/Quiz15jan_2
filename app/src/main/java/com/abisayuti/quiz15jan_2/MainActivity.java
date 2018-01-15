package com.abisayuti.quiz15jan_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btnsumbit;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinput = (EditText) findViewById(R.id.etinput);
        btnsumbit = (Button) findViewById(R.id.btnSumbit);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        btnsumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = etinput.getText().toString();
                if (number.isEmpty()){
                    etinput.setError("Jangan kosong");
                }else {
                    if (number.equalsIgnoreCase("1")) {
                        txtHasil.setText("Jurusan Manajemen Informatika");
                    }else if (number.equalsIgnoreCase("2")) {
                        txtHasil.setText("Jurusan Teknik Komputer");
                    } else if (number.equalsIgnoreCase("3")) {
                        txtHasil.setText("Jurusan Akutansi");
                    }  else if (number.equalsIgnoreCase("4")) {
                        txtHasil.setText("Jurusan Sistem Informasi");
                    } else if (number.equalsIgnoreCase("5"))  {
                        txtHasil.setText("Jurusan Teknologi Informasi");
                    }   else {
                        txtHasil.setText("Please only input number 1-5");
                    }

                }





            }

        });



    }
}
