package com.example.tugas4.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugas4.R;
import com.example.tugas4.model.AplikasiModel;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter <HomeAdapter.ViewHolder>{
    private Context context;
    private ArrayList<AplikasiModel> aplikasiModels;

    public ArrayList<AplikasiModel> getMenuModels(){
        return aplikasiModels;
    }

    public void setMenuModels(ArrayList<AplikasiModel> aplikasiModels) {
        this.aplikasiModels = aplikasiModels;
    }

    public HomeAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        final AplikasiModel mn = aplikasiModels.get(position);

        Glide.with(context).load(getMenuModels().get(position).getLogo()).into(holder.imv1);
        holder.tev1.setText(getMenuModels().get(position).getNama());
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send."+ aplikasiModels.get(holder.getAdapterPosition()).getNama());
                sendIntent.setType("text/plain");
                context.startActivity(Intent.createChooser(sendIntent,"send to"));
            }
        });

//        holder.cvItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(context, MenuDetail.class);
//                i.putExtra("Nama", mn.getNama());
//                i.putExtra("Deskripsi", mn.getDeskripsi());
//                context.startActivity(i);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return aplikasiModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imv1;
        private TextView tev1;
        private ImageView share;
        private CardView cvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imv1= itemView.findViewById(R.id.iv1);
            tev1= itemView.findViewById(R.id.tv1);
            share = itemView.findViewById(R.id.Btnshare);
            cvItem = itemView.findViewById(R.id.cv_item);
        }
    }
}
