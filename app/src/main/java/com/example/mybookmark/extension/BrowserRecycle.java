package com.example.mybookmark.extension;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mybookmark.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class BrowserRecycle extends  RecyclerView.Adapter<BrowserRecycle.ViewHolder> {

    ArrayList<Browser> browser = new ArrayList<>();
    private Context context;

    public BrowserRecycle(Context context) {
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public BrowserRecycle.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_browser_recycle, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull BrowserRecycle.ViewHolder holder, int position) {
        holder.browserName.setText(browser.get(position).getName());
        holder.version.setText(browser.get(position).getVersion());
        holder.browserLogo.setImageResource(browser.get(position).getImage());

        holder.install.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return browser.size();
    }

    public void setBrowser(ArrayList<Browser> browser) {
        this.browser = browser;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView browserLogo, bg_dots;
        private TextView browserName, version;
        private CardView cardParent;
        private Button install;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            browserLogo = itemView.findViewById(R.id.Browserlogo);
            bg_dots = itemView.findViewById(R.id.bg_dots);
            browserName = itemView.findViewById(R.id.browserName);
            version = itemView.findViewById(R.id.version);
            install = itemView.findViewById(R.id.install);
            cardParent = itemView.findViewById(R.id.cardParent);
        }
    }
}