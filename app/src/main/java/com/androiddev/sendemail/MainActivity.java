package com.androiddev.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Intent intent = null;
    Intent chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imgBtn_background);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"pramodk8001@gmail.com","thedevilwolf6001@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"hii! how are you doing?");
                intent.putExtra(Intent.EXTRA_TEXT,"hey, this is my first mail using my app !!");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent,"send Email");
                startActivity(chooser);

            }
        });
    }
}