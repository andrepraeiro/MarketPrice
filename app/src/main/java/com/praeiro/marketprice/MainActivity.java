package com.praeiro.marketprice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadMenu();
    }

    private void LoadMenu() {
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1 ,GetItems());
        ListView lvMenu = (ListView) findViewById(R.id.listView);
        lvMenu.setAdapter(itemAdapter);
    }

    private String[] GetItems() {
        return new String[]{"Estabelecimentos","Produtos", "Preços"};
    }
}
