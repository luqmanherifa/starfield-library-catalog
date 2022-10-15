package com.luqman.uas.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuInfo extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_info);

        ImageButton btnBack = (ImageButton) this.findViewById(R.id.cmdBack);
        btnBack.setOnClickListener(new MenuInfo.klikBack());

        ImageButton bAbout = (ImageButton) findViewById(R.id.cmdTentang);
        ImageButton bHelp = (ImageButton) findViewById(R.id.cmdBantuan);

        bAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.info_tentang);
                dialog.setTitle("Info Aplikasi");

                TextView tek1 = (TextView) dialog.findViewById(R.id.tek1);
                ImageView logo = (ImageView) dialog.findViewById(R.id.logo);
                TextView tek2 = (TextView) dialog.findViewById(R.id.tek2);
                TextView tek3 = (TextView) dialog.findViewById(R.id.tek3);
                TextView tek5 = (TextView) dialog.findViewById(R.id.tek5);
                tek5.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/"));
                        startActivity(intent);
                    }
                });
                TextView tek4 = (TextView) dialog.findViewById(R.id.tek4);
                tek4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:171111118@mhs.stiki.com"));
                        startActivity(intent);
                    }
                });
                Button btok = (Button) dialog.findViewById(R.id.btok);
                btok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.info_bantuan);
                dialog.setTitle("Info Bantuan");

                Button bthelp = (Button) dialog.findViewById(R.id.bthelp);
                bthelp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), InfoBantuan.class);
                        startActivity(intent);
                    }
                });

                Button btset = (Button) dialog.findViewById(R.id.btset);
                btset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(intent);
                    }
                });

                Button btupd = (Button) dialog.findViewById(R.id.btupd);
                btupd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Intent intent = new Intent(getApplicationContext(), TesUpdate.class);
                        //startActivity(intent);
                    }

                });
                dialog.show();
            }
        });

    }

    class klikBack implements Button.OnClickListener
    {
        public void onClick (View v)
        {

            finish();
        }
    }
}