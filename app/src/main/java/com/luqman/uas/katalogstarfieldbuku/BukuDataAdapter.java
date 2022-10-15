package com.luqman.uas.katalogstarfieldbuku;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BukuDataAdapter extends RecyclerView.Adapter<BukuDataAdapter.MyViewHolder> {

    private Context mContext ;
    private List<BukuData> mData ;

    public BukuDataAdapter(Context mContext, List<BukuData> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.buku_cardview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tvAdJudul.setText(mData.get(position).getJudul());
        holder.tvAdCover.setImageResource(mData.get(position).getCover());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, BukuDetail.class);

                // passing data to the book activity
                intent.putExtra("Judul",mData.get(position).getJudul());
                intent.putExtra("Kategori",mData.get(position).getKategori());
                intent.putExtra("Deskripsi",mData.get(position).getDeskripsi());
                intent.putExtra("Cover",mData.get(position).getCover());
                intent.putExtra("QRCode",mData.get(position).getQRCode());
                // start the activity
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvAdJudul;
        ImageView tvAdCover;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvAdJudul = (TextView) itemView.findViewById(R.id.id_buku_judul);
            tvAdCover = (ImageView) itemView.findViewById(R.id.id_buku_gambar);
            cardView = (CardView) itemView.findViewById(R.id.id_cardview);
        }
    }
}