package com.royalbase.heris;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CekActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent i;
            switch (item.getItemId()) {
                case R.id.beranda:
                    i = new Intent(CekActivity.this, BerandaActivity.class);
                    startActivity(i);
                    return true;
                case R.id.cek:
                    return true;
                case R.id.sewa:
<<<<<<< HEAD
                    i = new Intent(CekActivity.this, SewaActivity.class);
                    startActivity(i);
                    return true;
                case R.id.notifikasi:
                    i = new Intent(CekActivity.this, NotifikasiAcTivity.class);
                    startActivity(i);
                    return true;
=======
                    i = new Intent(CekActivity.this, BerandaActivity.class);
                    startActivity(i);
                    return true;
>>>>>>> 33a7799e76d1b179b9832942d872c2ad2fd3cd17
                case R.id.akun:
                    i = new Intent(CekActivity.this, AkunActivity.class);
                    startActivity(i);
                    return true;
                case R.id.notifikasi:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
