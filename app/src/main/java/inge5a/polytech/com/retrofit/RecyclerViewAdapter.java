package inge5a.polytech.com.retrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import inge5a.polytech.com.model.Beer;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Beer> data = new ArrayList<>();


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;

        public ViewHolder(View v) {
            super(v);
            text = (TextView) v.findViewById(android.R.id.text1);
        }
    }

    public RecyclerViewAdapter(List<Beer> data) {
        this.data = data;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_selectable_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        if (data != null) {
            Beer beer = data.get(position);
            holder.text.setText(beer.getName());
            holder.itemView.setTag(beer.getAbv());
        }
    }

    @Override
    public int getItemCount() {
        if (data != null)
            return data.size();
        return 0;
    }

}