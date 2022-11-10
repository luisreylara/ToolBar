package com.example.mi_toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar1; //import androidx.appcompat.widget.Toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);

        getSupportFragmentManager().beginTransaction().add(R.id.frame1,new Fragment1()).commit();
    }

    //con este método se visualiza el menú en la app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuFragmento1:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment1()).commit();
                return true;

            case R.id.menuFragmento2:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment2()).commit();
                return true;

            case R.id.menuFragmento3:getSupportFragmentManager().beginTransaction().replace(R.id.frame1,new Fragment3()).commit();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}