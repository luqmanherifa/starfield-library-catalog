package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class InfoTentang extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_tentang);

        ImageButton btnBack = (ImageButton) this.findViewById(R.id.cmdBack);
        btnBack.setOnClickListener(new InfoTentang.klikBack());
    }
    class klikBack implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            finish();
        }
    }

    public void hubwebsite(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/en/home-page/")));
    }

}