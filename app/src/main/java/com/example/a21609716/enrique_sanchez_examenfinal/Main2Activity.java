package com.example.a21609716.enrique_sanchez_examenfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button btnSin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.db) {
            Toast toast = Toast.makeText(this,"going Alumni", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.event) {
            Toast toast = Toast.makeText(this,"going Perfil", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.ordena) {
            Toast toast = Toast.makeText(this,"going ordena", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.book) {
            Toast toast = Toast.makeText(this,"going book", Toast.LENGTH_LONG );
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }


}
