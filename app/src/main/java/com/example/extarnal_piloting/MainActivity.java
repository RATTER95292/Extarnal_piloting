package com.example.extarnal_piloting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import android.annotation.SuppressLint;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //WebView sborka1 = (WebView)findViewById(R.id.video1);

        //Самолет с ЭД
        String video1 = "https://youtu.be/mGNPX4eOHGE";


        //sborka1.getSettings().setJavaScriptEnabled(true);
        //WebClient webViewClient = new WebClient();
        //sborka1.setWebViewClient(webViewClient);

        //sborka1.loadUrl(video1);


        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);

        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    /*    Самолет с ЭД
    сборка парашута https://youtu.be/BxuvOp4MLqo
    построение плана полета https://youtu.be/gJREURn_vws

      Самолет с ДВС
    сборка https://youtu.be/jDsCSeW9DqU

      Квадракоптера
    сборка https://youtu.be/VHLuAjPhY5g

      Обработка данных
     Урок 1 https://youtu.be/BbEqox2ZmFc
     Урок 2 https://youtu.be/_ZJT2A3jX-M?list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0
     Урок 3 https://youtu.be/vDmt0GCXKgs?list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0
     Урок 4 https://youtu.be/VKmomw1-4qE?list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0
     Урок 5 https://youtu.be/QIDTgRqqjic?list=PLNLqotQpxb3nUX8nYVzU30YFJcoPCT5V0
    */



    public void Click(View view){
        switch (view.getId()){

            case R.id.shablon1:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://docs.google.com/document/d/1Khzio8HN-qFPduW5i2x3DC87ppNRm85uAzxq_BKNuRk/edit"));
                startActivity(intent);
                return;

            case R.id.primer1:
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.addCategory(Intent.CATEGORY_BROWSABLE);
                intent1.setData(Uri.parse("https://docs.google.com/document/d/12cleH8NUjDxZ20vS8ep84ZYLJ4dYM8LJPPEj5usdPwg/edit"));
                startActivity(intent1);
                return;

            case R.id.zadanie1:

                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://docs.google.com/document/d/1QTzXn2_HCvx3uYZ9_dNkvzWXb4eSYvskahTKhjdGCwI/edit"));
                startActivity(intent2);
                return;

            case R.id.shablon2:
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_VIEW);
                intent3.addCategory(Intent.CATEGORY_BROWSABLE);
                intent3.setData(Uri.parse("https://drive.google.com/file/d/1RUjgp4Fs3as682QDfMxIgifOHhA977vB/view"));
                startActivity(intent3);
                return;

            case R.id.primer2:
                Intent inten = new Intent();
                inten.setAction(Intent.ACTION_VIEW);
                inten.addCategory(Intent.CATEGORY_BROWSABLE);
                inten.setData(Uri.parse("https://docs.google.com/document/d/1TJ7pT4_8BEuDRtimKAvlEZTw4jUljBSf2v-KdDwM4Tg/edit"));
                startActivity(inten);
                return;

                // о корпорации
            case R.id.zadanie2:
                Intent inte = new Intent();
                inte.setAction(Intent.ACTION_VIEW);
                inte.addCategory(Intent.CATEGORY_BROWSABLE);
                inte.setData(Uri.parse("https://docs.google.com/document/d/1QTzXn2_HCvx3uYZ9_dNkvzWXb4eSYvskahTKhjdGCwI/edit"));
                startActivity(inte);
        }
    }

    public void Button(View view){



        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://lahmeneffa.gitbook.io/docs-tkuik/"));
        startActivity(intent);
    }


}