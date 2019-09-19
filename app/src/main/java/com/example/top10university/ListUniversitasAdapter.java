package com.example.top10university;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUniversitasAdapter extends RecyclerView.Adapter<ListUniversitasAdapter.ListViewHolder> {
    private ArrayList<Universitas> listuniversitas;

    public ListUniversitasAdapter(ArrayList<Universitas> list) {
        this.listuniversitas = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View universitas = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_universitas, parent, false);
        return new ListViewHolder(universitas);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Universitas universitas = listuniversitas.get(position);

        Glide.with(holder.itemView.getContext())
                .load(universitas.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgphoto);

        holder.tvname.setText(universitas.getName());
        holder.tvdetail.setText(universitas.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveintent = new Intent(view.getContext(), DetailActivity.class);
                moveintent.putExtra("objek", listuniversitas.get(position));
                view.getContext().startActivity(moveintent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listuniversitas.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tvname , tvdetail, tv_content_name;

        ListViewHolder(View itemView) {
            super(itemView);
            imgphoto = itemView.findViewById(R.id.img_item_photo);
            tvname = itemView.findViewById(R.id.tv_item_name);
            tvdetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}