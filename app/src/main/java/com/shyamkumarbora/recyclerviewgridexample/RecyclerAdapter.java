package com.shyamkumarbora.recyclerviewgridexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.AssamRiverViewHolder> {
    private View mView;
    private int[] riverAssamImage;
    private String [] riverAssamName;
    private AssamRiverViewHolder mAssamRiverViewHolder;
    private Context mContext;
    public RecyclerAdapter(int [] riverAssamImage,String [] riverAssamName,Context mContext){
        this.riverAssamImage = riverAssamImage;
        this.riverAssamName = riverAssamName;
        this.mContext = mContext;
    }
    @Override
    public AssamRiverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_layout,parent,false);
        mAssamRiverViewHolder = new AssamRiverViewHolder(mView,mContext,riverAssamImage);
        return mAssamRiverViewHolder;
    }

    @Override
    public void onBindViewHolder(AssamRiverViewHolder holder, int position) {
        holder.riverImageView.setImageResource(riverAssamImage[position]);
        holder.riverNameTextView.setText(riverAssamName[position]);

    }

    @Override
    public int getItemCount() {
        return riverAssamImage.length;
    }
    public class AssamRiverViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private Context mContext;
        public ImageView riverImageView;
        public TextView riverNameTextView;
        private int [] imageList;
        public AssamRiverViewHolder(View itemView,Context mContext,int [] imageList) {
            super(itemView);
            riverImageView = itemView.findViewById(R.id.river_album);
            riverNameTextView = itemView.findViewById(R.id.river_name_tv);
            itemView.setOnClickListener(this);
            this.mContext = mContext;
            this.imageList = imageList;
        }

        @Override
        public void onClick(View v) {
            Intent mIntent = new Intent(mContext,DisplayActivity.class);
            mIntent.putExtra("IMAGE_ID",imageList[getAdapterPosition()]);
            mContext.startActivity(mIntent);
        }
    }
}
