package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriCerpen extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_cerpen);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("9 dari Nadira","Leila S. Chudori | Penerbit KPG","Deskripsi buku",R.drawable.buku_cerpen_9dn,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Perempuan Patah Hati yang Kembali Menemukan Cinta Melalui Mimpi","Eka Kurniawan | Bentang Pustaka","Deskripsi buku",R.drawable.buku_cerpen_pph,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}