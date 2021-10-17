package com.example.mybookmark.FAQ;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mybookmark.R;
import com.example.mybookmark.extension.BrowserRecycle;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FaqContent extends RecyclerView.Adapter<FaqContent.ViewHolder> {

    ArrayList<FAQ> faq = new ArrayList<>();

    private Context context;

    public FaqContent(Context context) {
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public FaqContent.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_faq_content, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FaqContent.ViewHolder holder, int position) {
        holder.faqTitle.setText(faq.get(position).getTitle());
        holder.faqDesc.setText(faq.get(position).getContent());

        holder.arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.faqDesc.setVisibility(View.VISIBLE);
                holder.close.setVisibility(View.VISIBLE);
                holder.arrow.setVisibility(View.GONE);

            }
        });

        holder.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.arrow.setVisibility(View.VISIBLE);
                holder.faqDesc.setVisibility(View.GONE);
                holder.close.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return faq.size();
    }

    public void setFaq(ArrayList<FAQ> faq) {
        this.faq = faq;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView arrow,close, pembatas;
        private TextView faqTitle, faqDesc;
        private RelativeLayout faqParent;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            arrow = itemView.findViewById(R.id.arrow);
            close =itemView.findViewById(R.id.close);
            pembatas = itemView.findViewById(R.id.pembatas);
            faqTitle = itemView.findViewById(R.id.faqTitle);
            faqDesc = itemView.findViewById(R.id.faqDesc);
            faqParent = itemView.findViewById(R.id.faqParent);


        }
    }
}