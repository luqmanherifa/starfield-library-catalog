package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriSelfImp extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_selfimp);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("Loving the Wounded Soul","Regis Machdy | Gramedia Pustaka Utama","Deskripsi buku",R.drawable.buku_selfimp_ltws,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Tak Mungkin Membuat Semua Orang Senang","Jeong Moon Jeong | Gramedia Pustaka Utama","Deskripsi buku",R.drawable.buku_selfimp_tmm,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}