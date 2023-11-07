package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button1);
        button3=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View view=inflater.inflate(R.layout.toast_layout,null);
                TextView toastText = view.findViewById(R.id.toast_text);
                ImageView toastImage = view.findViewById(R.id.toast_image);

                toastText.setText("I AM RANDY ORTON");
                toastImage.setImageResource(R.drawable.images);
                Toast customToast = new Toast(getApplicationContext());
                customToast.setView(view);
                customToast.setDuration(Toast.LENGTH_SHORT);
                customToast.setGravity(Gravity.BOTTOM, 0, 0);

                customToast.show();
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LayoutInflater inflater = getLayoutInflater();
                        View view=inflater.inflate(R.layout.toast_layout1,null);
                        TextView toastText = view.findViewById(R.id.toast_text1);
                        ImageView toastImage = view.findViewById(R.id.toast_image1);

                        toastText.setText("I AM JOHN CENA");
                        toastImage.setImageResource(R.drawable.image2);
                        Toast customToast = new Toast(getApplicationContext());
                        customToast.setView(view);
                        customToast.setDuration(Toast.LENGTH_SHORT);
                        customToast.setGravity(Gravity.BOTTOM, 0, 0);

                        customToast.show();
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

                        LayoutInflater inflater = getLayoutInflater();
                        View view=inflater.inflate(R.layout.toast_layout2,null);
                        TextView toastText = view.findViewById(R.id.toast_text2);
                        ImageView toastImage = view.findViewById(R.id.toast_image2);

                        toastText.setText("I AM ROMAN");
                        toastImage.setImageResource(R.drawable.image1);
                        Toast customToast = new Toast(getApplicationContext());
                        customToast.setView(view);
                        customToast.setDuration(Toast.LENGTH_SHORT);
                        customToast.setGravity(Gravity.BOTTOM, 0, 0);

                        customToast.show();

    }
});

                    }
                });
            }
        });

    }
}