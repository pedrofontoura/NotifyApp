package com.example.notifyapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notifyapp.Model.Usuario;
import com.example.notifyapp.R;

import java.util.ArrayList;

/**
 * Created by mathe on 08/12/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {



    private ArrayList<Usuario> usuarios;

    private View.OnLongClickListener onLongClickListener;



    public UserAdapter(ArrayList<Usuario> usuarios,
                       AdapterView.OnItemClickListener onItemClickListener, View.OnLongClickListener onLongClickListener) {

        this.usuarios = usuarios;

        this.onLongClickListener = onLongClickListener;

    }



    @Override

    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView =

                LayoutInflater.from(parent.getContext())

                        .inflate(R.layout.view_item_group,

                                parent,

                                false);



        return new UserAdapter.ViewHolder(itemView);

    }



    @Override

    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {

        Usuario usuario = usuarios.get(position);

        holder.tvUser.setText(usuario.getName());

        holder

                .imvUser

                .setImageResource(R.drawable.common_google_signin_btn_icon_disabled/*ResourceUtil

                            .getResourceBasedOnAffiliation(

                                    trooper.getAffiliation()*/



                );

        holder.itemView.setOnLongClickListener(onLongClickListener);

    }



    @Override

    public int getItemCount() {

        return usuarios.size();

    }



    public class ViewHolder extends RecyclerView.ViewHolder {



        TextView tvUser;

        ImageView imvUser;

        public ViewHolder(View itemView) {

            super(itemView);

            tvUser = itemView.findViewById(R.id.user_name_tv);

            imvUser =

                    itemView.findViewById(R.id.user_list_imv);

        }

    }






}
