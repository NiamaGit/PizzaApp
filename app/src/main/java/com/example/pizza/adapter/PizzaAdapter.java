package com.example.pizza.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.ListPizzaActivity;
import com.example.pizza.MainActivity;
import com.example.pizza.R;
import com.example.pizza.beans.Produit;

import java.util.List;
public class PizzaAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Produit> produits;
    private Context context;

    private ImageView iv;
    private TextView title,sub,code;


    public PizzaAdapter(ListPizzaActivity context, List<Produit> produits) {
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.produits = produits;
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = layoutInflater.inflate(R.layout.activity_main,null);
        iv = v.findViewById(R.id.img);
        title = v.findViewById(R.id.tit);
        sub = v.findViewById(R.id.sub);
        code = v.findViewById(R.id.code);
        Produit p = produits.get(i);
        iv.setImageResource(p.getPhoto());
        title.setText(p.getNom());
        sub.setText(p.getDuree());
        code.setText(p.getCode());

        return v;
    }
}
