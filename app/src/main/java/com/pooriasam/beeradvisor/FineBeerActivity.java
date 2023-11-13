package com.pooriasam.beeradvisor;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FineBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        //Get a reference to the textview
        TextView brands=(TextView) findViewById(R.id.brands);
        //Get a reference to the spinner
        Spinner color=(Spinner) findViewById(R.id.color);
        //Get the selected item in the spinner
        String beerType=String.valueOf(color.getSelectedItem());

        //Display the selected item
        brands.setText(beerType);
    }
}