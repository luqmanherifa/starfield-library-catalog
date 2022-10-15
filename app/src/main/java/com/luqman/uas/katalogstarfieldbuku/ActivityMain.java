package com.luqman.uas.katalogstarfieldbuku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {
    private Activity activity = this;
    ImageButton btnBeranda, btnDenah, btnKatalog, btnMap, btnScanner, btnInfo;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBeranda = (ImageButton) this.findViewById(R.id.cmdRumah);
        btnBeranda.setOnClickListener(new klikBeranda());

        btnDenah = (ImageButton) this.findViewById(R.id.cmdDenah);
        btnDenah.setOnClickListener(new klikDenah());

        btnKatalog = (ImageButton) this.findViewById(R.id.cmdKatalog);
        btnKatalog.setOnClickListener(new klikKatalog());

        btnMap = (ImageButton) this.findViewById(R.id.cmdMap);
        btnMap.setOnClickListener(new klikMap());

        btnScanner = (ImageButton) this.findViewById(R.id.cmdScanner);
        btnScanner.setOnClickListener(new klikScanner());

        btnInfo = (ImageButton) this.findViewById(R.id.cmdInfo);
        btnInfo.setOnClickListener(new klikInfo());
    }

    class klikBeranda implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuBeranda.class );
            startActivity(i);
        }
    }

    class klikDenah implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuDenah.class );
            startActivity(i);
        }
    }

    class klikKatalog implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuKatalog.class );
            startActivity(i);
        }
    }

    class klikMap implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuMap.class );
            startActivity(i);
        }
    }

    class klikScanner implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuScanner.class );
            startActivity(i);
        }
    }

    class klikInfo implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MenuInfo.class );
            startActivity(i);
        }
    }

    class klikcerpen implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriCerpen.class );
            startActivity(i);
        }
    }

    class kliknovel implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriNovel.class );
            startActivity(i);
        }
    }

    class klikselfimprovement implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriSelfImp.class );
            startActivity(i);
        }
    }

    class klikpuisi implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriPuisi.class );
            startActivity(i);
        }
    }

    class kliksains implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriSains.class );
            startActivity(i);
        }
    }

    class kliksejarah implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KategoriSejarah.class );
            startActivity(i);
        }
    }

}
