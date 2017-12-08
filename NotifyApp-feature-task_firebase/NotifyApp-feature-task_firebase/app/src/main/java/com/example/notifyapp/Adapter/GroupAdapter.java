package com.example.notifyapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notifyapp.Model.Grupo;
import com.example.notifyapp.Model.Usuario;
import com.example.notifyapp.R;

import java.util.ArrayList;

/**
 * Created by mathe on 06/12/2017.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {



        private ArrayList<Grupo> grupos;

        private View.OnLongClickListener onLongClickListener;



   public GroupAdapter(ArrayList<Grupo> grupos, View.OnLongClickListener onLongClickListener) {

            this.grupos = grupos;

            this.onLongClickListener = onLongClickListener;

        }



        @Override

        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View itemView =

                    LayoutInflater.from(parent.getContext())

                            .inflate(R.layout.view_item_group,

                                    parent,

                                    false);



            return new ViewHolder(itemView);

        }



        @Override

        public void onBindViewHolder(ViewHolder holder, int position) {

            Grupo grupo = grupos.get(position);

            holder.tvGroup.setText(grupos.size());

            holder

                    .imvGroup

                    .setImageResource(R.drawable.common_google_signin_btn_icon_disabled/*ResourceUtil

                            .getResourceBasedOnAffiliation(

                                    trooper.getAffiliation()*/



                    );

            holder.itemView.setOnLongClickListener(onLongClickListener);

        }



        @Override

        public int getItemCount() {

            return grupos.size();

        }



        public class ViewHolder extends RecyclerView.ViewHolder {



            TextView tvGroup;

            ImageView imvGroup;

            public ViewHolder(View itemView) {

                super(itemView);

                tvGroup = itemView.findViewById(R.id.group_name_tv);

                imvGroup =

                        itemView.findViewById(R.id.group_imv);

            }

        }

}
