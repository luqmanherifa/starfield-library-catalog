package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class BukuDetail extends AppCompatActivity {

    private TextView tvJudul, tvDeskripsi, tvKategori;
    private ImageView ivCover, ivQRCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buku_detail);

        tvJudul = (TextView) findViewById(R.id.txtJudul);
        tvKategori = (TextView) findViewById(R.id.txtKategori);
        tvDeskripsi = (TextView) findViewById(R.id.txtDeskripsi);
        ivCover = (ImageView) findViewById(R.id.imgCover);
        ivQRCode = (ImageView) findViewById(R.id.imgQRCode);

        // Recieve data
        Intent intent = getIntent();
        String Judul = intent.getExtras().getString("Judul");
        String Kategori = intent.getExtras().getString("Kategori");
        String Deskripsi = intent.getExtras().getString("Deskripsi");
        int Cover = intent.getExtras().getInt("Cover") ;
        int QRCode = intent.getExtras().getInt("QRCode") ;

        // Setting values

        tvJudul.setText(Judul);
        tvKategori.setText(Kategori);
        tvDeskripsi.setText(Deskripsi);
        ivCover.setImageResource(Cover);
        ivQRCode.setImageResource(QRCode);
    }
}