package com.example.a3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a3.R;

import java.util.List;

public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.ViewHolder> {

    private final List<Bird> birds;
    private final LayoutInflater inflater;

    public BirdAdapter(List<Bird> birds, Context context) {
        this.birds = birds;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Bird bird = birds.get(position);
        holder.birdView.setImageResource(bird.getBirdRes());
        holder.nameView.setText(bird.getName());
        holder.birdDescriptionView.setText(bird.getBirdDescription());
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView birdView;
        final TextView nameView, birdDescriptionView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            birdView = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.name);
            birdDescriptionView = itemView.findViewById(R.id.desc);
        }
    }

}