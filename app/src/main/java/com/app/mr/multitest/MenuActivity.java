package com.app.mr.multitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMenu;
    private MenuAdapter adapterMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerViewMenu = (RecyclerView)findViewById(R.id.recyclerMenuId);
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(this));

        adapterMenu = new MenuAdapter(obtenerMenu());
        recyclerViewMenu.setAdapter(adapterMenu);
    }


    public List<MenuModelo> obtenerMenu(){
        List<MenuModelo> menu = new ArrayList<>();
        menu.add(new MenuModelo("Encuesta",R.drawable.report));
        menu.add(new MenuModelo("Registro",R.drawable.register));
        menu.add(new MenuModelo("Reporte",R.drawable.report));

        return menu;
    }
}
