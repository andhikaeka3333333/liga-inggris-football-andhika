package com.example.ligainggrisandhika.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ligainggrisandhika.R;
import com.example.ligainggrisandhika.model.ModelTopScore;

import java.util.List;

public class AdapterTopScore extends RecyclerView.Adapter<AdapterTopScore.ViewHolder> {
    private Context context;
    private List<ModelTopScore> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterTopScore(List<ModelTopScore> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterTopScore.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_top_score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTopScore.ViewHolder holder, int position) {
        ModelTopScore items = this.listData.get(position);

        holder.tvNamaPemain.setText(items.getName());
        holder.tvNamaClub.setText(items.getClub());
        holder.ivImagePemain.setImageResource(items.getImage());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvNamaPemain, tvNamaClub;
        ImageView ivImagePemain;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaPemain = itemView.findViewById(R.id.tvNamaPemain);
            tvNamaClub = itemView.findViewById(R.id.tvNamaClub);
            ivImagePemain = itemView.findViewById(R.id.ivImagePemain);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public ModelTopScore getItem(int id) {
        return listData.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}


