package com.example.appalaktiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button Frenchbtn,EnglishBtn,GreekBtn,button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            // Write a message to the database
            //FirebaseDatabase database = FirebaseDatabase.getInstance();
            //DatabaseReference myRef = database.getReference("message");
            //myRef.setValue("Hello, World!");
            EnglishBtn=findViewById(R.id.EnglishBtn);
            Frenchbtn=findViewById(R.id.Frenchbtn);
            GreekBtn=findViewById(R.id.GreekBtn);
            button1=findViewById(R.id.button1);
            button2=findViewById(R.id.button2);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, menu.class);
                    startActivity(intent);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, stats.class);
                    startActivity(intent);
                }
            });
            EnglishBtn.setOnClickListener(this);
            Frenchbtn.setOnClickListener(this);
            GreekBtn.setOnClickListener(this);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.EnglishBtn){
                //button1.setText(LocaleHelper.setLanguage(this,LocaleHelper.English,R.string.istories));
                //button2.setText(LocaleHelper.setLanguage(this,LocaleHelper.English,R.string.statistika));
                button1.setText("STORIES");
                button2.setText("STATS");
                }
        else if (id == R.id.Frenchbtn) {
                //button1.setText(LocaleHelper.setLanguage(this,LocaleHelper.FRENCH,R.string.istories));
                //button2.setText(LocaleHelper.setLanguage(this,LocaleHelper.FRENCH,R.string.statistika));
                button1.setText("CONTE");
                button2.setText("STATISTICS");
                }
        else if (id == R.id.GreekBtn) {
                //button1.setText(LocaleHelper.setLanguage(this,LocaleHelper.GREEK,R.string.istories));
                //button2.setText(LocaleHelper.setLanguage(this,LocaleHelper.GREEK,R.string.statistika));
                button1.setText("ΙΣΤΟΡΙΕΣ");
                button2.setText("ΣΤΑΤΙΣΤΙΚΑ");

                }


    }
}