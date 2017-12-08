package com.example.harnaud.biblio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListeLivres = (Button) findViewById(R.id.btnListeLivre);
        btnListeLivres.setOnClickListener(observateurClickBouton);
    }

    private View.OnClickListener observateurClickBouton = new View.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnListeLivre:
                    Intent i = new Intent(getApplicationContext(),listeLivres.class);
                    startActivity(i);
            }
        }
    };
}
