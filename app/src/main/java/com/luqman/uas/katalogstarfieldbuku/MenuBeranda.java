package com.luqman.uas.katalogstarfieldbuku;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class MenuBeranda extends AppCompatActivity {
    Button btnLocation;
    TextView txtLoc1, txtLoc2, txtLoc3, txtLoc4, txtLoc5;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_beranda);

        ImageButton btnBack = (ImageButton) this.findViewById(R.id.cmdBack);
        btnBack.setOnClickListener(new klikBack());

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

    }

    class klikBack implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            finish();
        }
    }

    public void hublokasi(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Togamas+Dieng/@-7.9735977,112.611397,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78829b5912e81d:0x9cdde4039177212b!8m2!3d-7.973603!4d112.613591?hl=id")));
    }

    public void hubtelpon(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082814231615")));
    }

}