package com.royalsoftsolutions.search_viewuses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item1){
            Toast.makeText(this,"item 1..",Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId() == R.id.item2){
            Toast.makeText(this,"item 2..",Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId() == R.id.item3){
            Toast.makeText(this,"item 3..",Toast.LENGTH_LONG).show();
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }
}