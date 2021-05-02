package com.example.qualificationmarrigeproject.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qualificationmarrigeproject.R;

import java.util.ArrayList;
public class Homeadapter extends RecyclerView.Adapter <Homeadapter.HomeViewHolder> {
    ArrayList<CardModel> arrayList;
    RecyclerListener listener;

    public Homeadapter(ArrayList<CardModel> arrayList,RecyclerListener listener) {
        this.arrayList = arrayList;
        this.listener=listener;
    }
    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new HomeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_card, null));
    }
    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, final int position) {
        CardModel cardModel = arrayList.get(position);
        holder.card_name.setText(cardModel.getCard_name());
        holder.card_image.setImageResource(cardModel.getCard_image()); }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    class HomeViewHolder extends RecyclerView.ViewHolder {
        TextView card_name;
        ImageView card_image;


        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            card_image = itemView.findViewById(R.id.card_image);
            card_name = itemView.findViewById(R.id.card_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.listener(getAdapterPosition());
                }
            });

        }
    }

}