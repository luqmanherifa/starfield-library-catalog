package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriSains extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_sains);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("Kosmos","Carl Sagan | Penerbit KPG","Deskripsi buku",R.drawable.buku_sains_kos,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("The Selfish Gene","Richard Dawkins | Penerbit KPG","Deskripsi buku",R.drawable.buku_sains_tsg,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}