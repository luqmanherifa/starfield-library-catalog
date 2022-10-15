package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriPuisi extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_puisi);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("Hujan Bulan Juni","Sapardi Djoko Damono | Grasindo","Deskripsi buku",R.drawable.buku_puisi_hbj,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Melihat Api Bekerja","M Aan Mansyur | Gramedia Pustaka Utama","Deskripsi buku",R.drawable.buku_puisi_mab,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}