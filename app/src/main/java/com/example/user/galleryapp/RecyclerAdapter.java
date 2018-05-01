package com.example.user.galleryapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>  {

        @Override
        public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View photoView = inflater.inflate(R.layout.recycler_view_item, parent, false);
            RecyclerAdapter.MyViewHolder viewHolder = new RecyclerAdapter.MyViewHolder(photoView);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {

            ImageData imageData = imageDataArray[position];
            ImageView imageView = holder.ImageView;
            Glide.with(mContext)
                    .load(imageData.getUrl())
                    .placeholder(R.drawable.ic_error)
                    .into(imageView);
        }

        @Override
        public int getItemCount() {
            return (imageDataArray.length);
        }

        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public ImageView ImageView;

            public MyViewHolder(View itemView) {
                super(itemView);
                ImageView = itemView.findViewById(R.id.recycler_item);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {

                int position = getAdapterPosition();
                if(position != RecyclerView.NO_POSITION) {
                    ImageData imageData = imageDataArray[position];
                    Intent intent = new Intent(mContext, ImageActivity.class);
                    intent.putExtra(ImageActivity.EXTRA_SPACE_PHOTO, imageData);
                    mContext.startActivity(intent);
                }
            }
        }

        private ImageData[] imageDataArray;
        private Context mContext;

        public RecyclerAdapter(Context context, ImageData[] images) {
            mContext = context;
            imageDataArray = images;
        }
    }


