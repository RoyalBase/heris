package com.royalbase.heris;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SewaActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        Intent i;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.beranda:
                    i = new Intent(SewaActivity.this, BerandaActivity.class);
                    startActivity(i);
                    return true;
                case R.id.cek:
                    i = new Intent(SewaActivity.this, CekActivity.class);
                    startActivity(i);
                    return true;
                case R.id.sewa:
                    i = new Intent(SewaActivity.this, SewaActivity.class);
                    startActivity(i);
                    return true;
                case R.id.notifikasi:
                    i = new Intent(SewaActivity.this, NotifikasiActivity.class);
                    startActivity(i);
                    return true;
                case R.id.akun:
                    i = new Intent(SewaActivity.this, AkunActivity.class);
                    startActivity(i);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewa);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.sewa);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
