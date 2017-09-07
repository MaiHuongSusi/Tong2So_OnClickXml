package com.bkdn.maihuong.tinhtong2so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvso1, tvso2, tvkq;
    Button btn_tinhtong;
    EditText edt1,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tinhtong = (Button) findViewById(R.id.btn_tong);

        edt1 = (EditText) findViewById(R.id.etA);

        edt2 = (EditText) findViewById(R.id.etB);

        tvkq = (TextView) findViewById(R.id.tv_kq);

        btn_tinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                String chuoi2 = edt2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);
                int tong = so1 + so2;
                tvkq.setText(String.valueOf(tong));

            }
        });

    }
}
