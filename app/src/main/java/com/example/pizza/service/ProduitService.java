package com.example.pizza.service;

import com.example.pizza.beans.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService(){
        this.produits = new ArrayList<>();
    }
    @Override
    public boolean Create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean Delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public boolean Update(Produit o) {
        return false;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits){
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
