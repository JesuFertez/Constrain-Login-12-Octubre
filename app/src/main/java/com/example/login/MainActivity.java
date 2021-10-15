package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.login.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //private ImageView ivAvatar;
    //private EditText nombre, apellido, mail, contraseña;
    public static final String URL= "https://static.wikia.nocookie.net/drslump/images/4/4f/Arale_by_sauron88-d5a00n0.png/revision/latest?cb=20180106050156&path-prefix=es";
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initBinding();
        setContentView(binding.getRoot());

        asignarImagen();
        loadValues();
    }
    public void asignarImagen(){

        Picasso.get().load(URL).into(binding.ivAvatar);
    }
    public void initBinding(){

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        /*ivAvatar=findViewById(R.id.iv_avatar);
        nombre=findViewById(R.id.edt_nombre_persona);
        apellido=findViewById(R.id.edt_apellido_persona);
        mail=findViewById(R.id.edt_Mail_persona);
        contraseña=findViewById(R.id.edt_contraseña_persona);*/

    }
    public void loadValues(){
        binding.edtNombrePersona.setText("María Jesús");
        binding.edtApellidoPersona.setText("Fernández");
    }


}