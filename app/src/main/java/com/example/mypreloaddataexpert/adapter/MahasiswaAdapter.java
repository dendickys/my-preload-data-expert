package com.example.mypreloaddataexpert.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypreloaddataexpert.R;
import com.example.mypreloaddataexpert.model.MahasiswaModel;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder> {

    private ArrayList<MahasiswaModel> listMahasiswa = new ArrayList<>();

    public MahasiswaAdapter() {
    }

    public void setData(ArrayList<MahasiswaModel> listMahasiswa) {
        if (listMahasiswa.size() > 0) {
            this.listMahasiswa.clear();
        }
        this.listMahasiswa.addAll(listMahasiswa);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MahasiswaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa_row, parent, false);
        return new MahasiswaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaHolder holder, int position) {
        holder.tvNim.setText(listMahasiswa.get(position).getNim());
        holder.tvNama.setText(listMahasiswa.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }

    class MahasiswaHolder extends RecyclerView.ViewHolder {
        private TextView tvNim;
        private TextView tvNama;

        MahasiswaHolder(@NonNull View itemView) {
            super(itemView);
            tvNim = itemView.findViewById(R.id.txt_nim);
            tvNama = itemView.findViewById(R.id.txt_name);
        }
    }
}
