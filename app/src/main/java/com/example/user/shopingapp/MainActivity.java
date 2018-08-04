package com.example.user.shopingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class MainActivity extends AppCompatActivity {
  MagicButton btnshop,btncustomer,btnsupplier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnshop=(MagicButton)findViewById(R.id.magic_button1);
        btncustomer=(MagicButton)findViewById(R.id.magic_button2);
        btnsupplier=(MagicButton)findViewById(R.id.magic_button3);

        btnshop.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MakeshopActivity.class);
                startActivity(intent);

            }
        });
        btncustomer.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,CustomerActivity.class);
                startActivity(intent);

            }
        });
        btnsupplier.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,SupplierActivity.class);
                startActivity(intent);

            }
        });
    }
}
