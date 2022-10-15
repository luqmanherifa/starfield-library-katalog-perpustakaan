package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KategoriSejarah extends AppCompatActivity {

    List<BukuData> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori_sejarah);

        lstBook = new ArrayList<>();
        lstBook.add(new BukuData("Bung Karno Penyambung Lidah Rakyat Indonesia","Cindy Adams | Yayasan Bung Karno","Deskripsi buku",R.drawable.buku_sejarah_bkp,R.drawable.scan_cerpen_9dn));
        lstBook.add(new BukuData("Madilog","Tan Malaka | Narasi","Deskripsi buku",R.drawable.buku_sejarah_mdl,R.drawable.scan_cerpen_9dn));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        BukuDataAdapter myAdapter = new BukuDataAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}