package com.example.myrunning;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.myrunning.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class StoreActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //      setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_store);

        bottomNavigationView = findViewById(R.id.navigation_store);
        NavController navController = Navigation.findNavController(this, R.id.nav_store_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.running:
                startActivity(new Intent(this, MainActivity.class));

                return true;
            case R.id.store:
                Navigation.findNavController(this, R.id.nav_store_fragment).navigate(R.id.shoppingFragment);               startActivity(new Intent(this, StoreActivity.class));
                return true;
            case R.id.setting:

























                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }



}



