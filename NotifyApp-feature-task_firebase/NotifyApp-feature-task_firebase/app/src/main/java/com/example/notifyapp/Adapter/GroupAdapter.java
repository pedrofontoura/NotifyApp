package com.example.notifyapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notifyapp.R;

/**
 * Created by mathe on 06/12/2017.
 */

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {



     //   private ArrayList<Trooper> troopers;

        private View.OnLongClickListener onLongClickListener;



   /* public GroupAdapter(ArrayList<Trooper> troopers, View.OnLongClickListener onLongClickListener) {

            this.troopers = troopers;

            this.onLongClickListener = onLongClickListener;

        }*/



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

          //  Trooper trooper = troopers.get(position);

         //   holder.tvGroup.setText(trooper.getName());

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

            return 0/*troopers.size()*/;

        }



        public class ViewHolder extends RecyclerView.ViewHolder {



            TextView tvGroup;

            ImageView imvGroup;

            View separator;



            public ViewHolder(View itemView) {

                super(itemView);

                tvGroup = itemView.findViewById(R.id.group_name_tv);

                imvGroup =

                        itemView.findViewById(R.id.group_imv);

            }

        }

}
