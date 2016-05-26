package com.example.asimqureshi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickPopularMovies(View view) {
        makeToast("Popular Movies");
    }

    public void onClickStockHawk(View view) {
        makeToast("Stock Hawk");
    }

    public void onClickBuildItBigger(View view) {
        makeToast("Build It Bigger");
    }

    public void onClickMakeYourAppMaterial(View view) {
        makeToast("Make Your App Material");
    }

    public void onClickGoUbiquitous(View view) {
        makeToast("Go Ubiquitious");
    }

    public void onClickCapstone(View view) {
        makeToast("Capstone");
    }

    protected void makeToast(String appName) {
        Toast.makeText(this, String.format("This button will launch my %s app!", appName), Toast.LENGTH_SHORT).show();
    }
}
