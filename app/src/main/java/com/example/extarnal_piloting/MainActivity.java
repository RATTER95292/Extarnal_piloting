package com.example.extarnal_piloting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    //ггг
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


    public void Click(View view){
        switch (view.getId()){

            case R.id.shablon1:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://docs.google.com/document/d/1Khzio8HN-qFPduW5i2x3DC87ppNRm85uAzxq_BKNuRk/edit"));
                startActivity(intent);

            case R.id.primer1:
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.addCategory(Intent.CATEGORY_BROWSABLE);
                intent1.setData(Uri.parse("https://docs.google.com/document/d/12cleH8NUjDxZ20vS8ep84ZYLJ4dYM8LJPPEj5usdPwg/edit"));
                startActivity(intent1);

            case R.id.zadanie1:

                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://docs.google.com/document/d/1QTzXn2_HCvx3uYZ9_dNkvzWXb4eSYvskahTKhjdGCwI/edit"));
                startActivity(intent2);

            case R.id.shablon2:
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_VIEW);
                intent3.addCategory(Intent.CATEGORY_BROWSABLE);
                intent3.setData(Uri.parse("https://drive.google.com/file/d/1RUjgp4Fs3as682QDfMxIgifOHhA977vB/view"));
                startActivity(intent3);

            case R.id.primer2:
                Intent inten = new Intent();
                inten.setAction(Intent.ACTION_VIEW);
                inten.addCategory(Intent.CATEGORY_BROWSABLE);
                inten.setData(Uri.parse("https://docs.google.com/document/d/1TJ7pT4_8BEuDRtimKAvlEZTw4jUljBSf2v-KdDwM4Tg/edit"));
                startActivity(inten);

                // о корпорации
            case R.id.zadanie2:
                Intent inte = new Intent();
                inte.setAction(Intent.ACTION_VIEW);
                inte.addCategory(Intent.CATEGORY_BROWSABLE);
                inte.setData(Uri.parse("https://docs.google.com/document/d/1QTzXn2_HCvx3uYZ9_dNkvzWXb4eSYvskahTKhjdGCwI/edit"));
                startActivity(inte);
        }
    }


}