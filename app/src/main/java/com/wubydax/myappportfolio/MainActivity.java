package com.wubydax.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSpotify, btnScores, btnLibrary, btnBigger, btnReader, btnCapstone;
    Button[] myButtons;
    int[] ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtons = new Button[]{btnSpotify, btnScores, btnLibrary, btnBigger, btnReader, btnCapstone};
        ids = new int[]{R.id.btnSpotify, R.id.btnScores, R.id.btnLibrary, R.id.btnBigger, R.id.btnReader, R.id.btnCapStone};
        setUpButtons();
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

    private void setUpButtons() {
        for (int i = 0; i < myButtons.length && i < ids.length; i++) {
            myButtons[i] = (Button) findViewById(ids[i]);
            myButtons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) v;
        String btnText = String.format(getString(R.string.toast_text), btn.getText().toString());
        Toast.makeText(this, btnText, Toast.LENGTH_SHORT).show();

    }
}
