package com.example.ligainggrisandhika.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ligainggrisandhika.model.ModelClub;
import com.example.ligainggrisandhika.R;

import java.util.List;

public class AdapterClub extends RecyclerView.Adapter<AdapterClub.ViewHolder> {
    private Context context;
    private List<ModelClub> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterClub(List<ModelClub> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterClub.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view_club, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClub.ViewHolder holder, int position) {
        ModelClub items = this.listData.get(position);

        holder.tvNamaClub.setText(items.getName());
        holder.tvStadium.setText(items.getStadium());
        holder.ivImageClub.setImageResource(items.getImage());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvNamaClub, tvStadium;
        ImageView ivImageClub;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaClub = itemView.findViewById(R.id.tvNamaClub);
            tvStadium = itemView.findViewById(R.id.tvStadium);
            ivImageClub = itemView.findViewById(R.id.ivImageClub);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public ModelClub getItem(int id) {
        return listData.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}


