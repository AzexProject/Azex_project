package com.example.qualificationmarrigeproject.RecyclerAdapter_Videos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qualificationmarrigeproject.R;
import com.example.qualificationmarrigeproject.recycler.CardModel;

import java.util.List;

public class Recycler_Adapter_Video extends RecyclerView.Adapter<Recycler_Adapter_Video.ViewHolder_playList_ofVideos> {

        List<CardModel> list_videos ;
        //  Context context ;
        //  LayoutInflater inflater ;

        public Recycler_Adapter_Video(List<CardModel> list_videos) {
            this.list_videos = list_videos;
            //this.context = context;
            //this.inflater  = LayoutInflater.from(context);
        }

        public ViewHolder_playList_ofVideos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_playlist_videos_layout , null , false );
        // null?
            return new ViewHolder_playList_ofVideos(view);
        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_playList_ofVideos holder, int position) {
            CardModel card = list_videos.get(position);
        holder.tv_title_video.setText(card.getCard_name());
        holder.img_video.setImageResource(card.getCard_image());
        // id == -1 .
      /*  holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                }

        });

    } */

  }

                public int getItemCount() {
                    return list_videos.size();
                }

                public class ViewHolder_playList_ofVideos extends RecyclerView.ViewHolder {
                    TextView tv_title_video ;
                    ImageView img_video ;
                    ImageView img_fav ;
                    //CardView cardView ;
                    public ViewHolder_playList_ofVideos(@NonNull View itemView) {
                        super(itemView);
                        tv_title_video = itemView.findViewById(R.id.tv_title_video);
                        img_video = itemView.findViewById(R.id.img_video);
                        img_fav = itemView.findViewById(R.id.img_favourite);
                        img_fav.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                img_fav.setImageResource(R.drawable.ic_favorite_black_24dp);
                            }
                        });
                        //cardView = itemView.findViewById(R.id.cardView_cards);


                    }
                } }
