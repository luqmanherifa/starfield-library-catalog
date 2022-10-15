package com.luqman.uas.katalogstarfieldbuku;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuDenah extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_denah);

        ImageButton btnBack = (ImageButton) this.findViewById(R.id.cmdBack);
        btnBack.setOnClickListener(new MenuDenah.klikBack());
    }
    class klikBack implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            finish();
        }
    }

}