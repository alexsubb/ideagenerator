package com.example.alex.idea_generator.service.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.example.alex.idea_generator.ideas.IdeaStructure;

import java.util.ArrayList;

public class IdeaAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<IdeaStructure> objects;

    public IdeaAdapter(Context context, ArrayList<IdeaStructure> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    // кол-во элементов
    @Override
    public int getCount() {
        return objects.size();
    }

    // элемент по позиции
    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    // id по позиции
    @Override
    public long getItemId(int position) {
        return position;
    }

    // пункт списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // используем созданные, но не используемые view
        View view = convertView;
        if (view == null) {
   //        view = new IdeaRectView(ctx,getIdea(position).getTitle());
        }

        return view;
    }

    // товар по позиции
    IdeaStructure getIdea(int position) {
        return ((IdeaStructure) getItem(position));
    }

}