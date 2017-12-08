package com.example.harnaud.biblio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by harnaud on 08/12/2017.
 */

public class LivreAdapter extends BaseAdapter{

    private List<Livre> listEnchainement;
    private LayoutInflater inflater;

    public LivreAdapter(Context context, List<Livre> listE){
        this.inflater=LayoutInflater.from(context);
        this.listEnchainement=listE;
    }

    public int getCount() {
        return listEnchainement.size();
    }

    public Livre getItem(int i) {
        return listEnchainement.get(i);
    }

    public long getItemId(int i) {return i;}

    public View getView(int position, View convertView, ViewGroup parent) {
        TextView titre;
        TextView auteur;
        if(convertView==null){
            convertView = this.inflater.inflate(R.layout.vue_livre,parent,false);
            titre = convertView.findViewById(R.id.txtTitre);
            auteur = convertView.findViewById(R.id.txtAuteur);
            convertView.setTag(R.id.txtTitre,titre);
            convertView.setTag(R.id.txtAuteur,auteur);
        }
        else{
            titre = (TextView) convertView.getTag(R.id.txtTitre);
            auteur = (TextView) convertView.getTag(R.id.txtAuteur);
        }
        Livre exo = this.getItem(position);
        auteur.setText(String.valueOf(exo.getAuteur()));
        titre.setText(String.valueOf(exo.getTitre()));
        return convertView;
    }
}
