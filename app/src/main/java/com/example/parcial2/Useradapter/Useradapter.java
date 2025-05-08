package com.example.parcial2.Useradapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.R;
import com.example.parcial2.User.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Useradapter extends RecyclerView.Adapter<Useradapter.ViewHolder> {

    private List<User> datos;
    public  Useradapter(List<User>datos){
        this.datos= datos;

    }
    @NonNull
    @Override
    public Useradapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Useradapter.ViewHolder holder, int position) {
        User dato= datos.get(position);
        holder.bind(dato);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_nombre, txt_descripcion;
        ImageView img_usuario;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre= itemView.findViewById(R.id.txt_nombre);
            txt_descripcion = itemView.findViewById(R.id.txt_descripcion);
            img_usuario= itemView.findViewById(R.id.img_usuario);
        }
        public void bind(User dato){
            txt_nombre.setText(dato.getnombre);
            txt_descripcion.setText(dato.getDescripcion());

            Picasso.get().load(dato.getImagen()).into(img_usuario);

        }
    }
  }
