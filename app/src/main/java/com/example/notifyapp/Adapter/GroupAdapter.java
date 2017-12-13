package com.example.notifyapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notifyapp.Model.GrupoModel;
import com.example.notifyapp.R;

import java.util.ArrayList;

/**
 * Created by mathe on 06/12/2017.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> implements View.OnClickListener{



        private ArrayList<GrupoModel> grupoModels;
        private OnItemClickListener onItemClickListener;
        private View.OnLongClickListener onLongClickListener;



   public GroupAdapter(ArrayList<GrupoModel> grupoModels, OnItemClickListener onItemClickListener ,
                       View.OnLongClickListener onLongClickListener) {

            this.grupoModels = grupoModels;
            this.onItemClickListener = onItemClickListener;
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

            GrupoModel grupoModel = grupoModels.get(position);

            holder.tvGroup.setText(grupoModel.getNomeDoGrupo());

            holder.itemView.setTag(grupoModel);

            holder.itemView.setOnClickListener(this);

            holder.itemView.setOnLongClickListener(onLongClickListener);

        }



        @Override

        public int getItemCount() { return grupoModels.size(); }

        @Override
        public void onClick(View v) {

            onItemClickListener.onItemClick((GrupoModel) v.getTag());
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

    public interface OnItemClickListener {
        public void onItemClick(GrupoModel grupoModel);
    }

}
