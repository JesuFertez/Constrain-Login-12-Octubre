package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
        asignarImagen();
    }
    public void asignarImagen(){

        Picasso.get().load("https://static.wikia.nocookie.net/drslump/images/4/4f/Arale_by_sauron88-d5a00n0.png/revision/latest?cb=20180106050156&path-prefix=es").into(ivAvatar);
    }
    public void initWidget(){

        ivAvatar=findViewById(R.id.iv_avatar);
    }
}