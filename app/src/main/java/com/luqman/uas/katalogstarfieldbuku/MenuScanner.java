package com.luqman.uas.katalogstarfieldbuku;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuScanner extends AppCompatActivity {
    public static TextView resultTextView;
    Button scan_btn;
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.scan_hasil);

        ImageButton btnBack = (ImageButton) this.findViewById(R.id.cmdBack);
        btnBack.setOnClickListener(new MenuScanner.klikBack());

        resultTextView=(TextView)findViewById(R.id.result_text);
        scan_btn=(Button)findViewById(R.id.btn_scan);

        scan_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), ActivityScanner.class));
            }
        });
    }

    class klikBack implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            finish();
        }
    }

}