package com.example.appalaktiki;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class stats extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7;
    int first=-1,second=-2;
    String first1,second2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_stats);
        text1=findViewById(R.id.textView12);
        text2=findViewById(R.id.textView13);
        text3=findViewById(R.id.textView14);
        text4=findViewById(R.id.textView15);
        text5=findViewById(R.id.textView16);
        text6=findViewById(R.id.textView6);
        text7=findViewById(R.id.textView18);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("TheCloudWhoForgotHowtoPain");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                {
                    int sum = snapshot.child("sum").getValue(Integer.class);
                    String sumString=String.valueOf(sum);
                    text1.setText(sumString);


                    if (first<sum)
                    {

                        first=sum;
                        first1="The Cloud Who Forgot How to Rain";
                        String sumString2=String.valueOf(first);
                        String sumString3=String.valueOf(second);
                        text6.setText(sumString2);
                        text7.setText(sumString3);
                    }
                    else if(first==sum || second<sum){
                        second=sum;
                        second2="The Cloud Who Forgot How to Rain";
                    }

                } else{
                    Log.d("FirebaseExample", "Sum not found");
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        DatabaseReference myRef2 = database.getReference("TheTinyDragonWhoCouldOnlyWhisper");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                {
                    int sum = snapshot.child("sum").getValue(Integer.class);
                    String sumString=String.valueOf(sum);
                    text2.setText(sumString);

                    if (first<sum)
                    {

                        first=sum;
                        first1="The Tiny Dragon Who Could Only Whisper";
                    }
                    else if(first==sum || second<sum){

                        second=sum;
                        second2="The Tiny Dragon Who Could Only Whisper";

                    }
                } else{
                    Log.d("FirebaseExample", "Sum not found");
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        DatabaseReference myRef3 = database.getReference("TheSecretLibraryUndertheSea");
        myRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                {
                    int sum = snapshot.child("sum").getValue(Integer.class);
                    String sumString=String.valueOf(sum);
                    text3.setText(sumString);
                    if (first<sum)
                    {

                        first=sum;
                        first1="The Secret Library Under the Sea";
                    }
                    else if(first==sum || second<sum){
                        second=sum;
                        second2="The Secret Library Under the Sea";
                    }
                } else{
                    Log.d("FirebaseExample", "Sum not found");
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        DatabaseReference myRef4 = database.getReference("TheFoxWhoPaintedtheMoon");
        myRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                {
                    int sum = snapshot.child("sum").getValue(Integer.class);
                    String sumString=String.valueOf(sum);
                    text4.setText(sumString);
                    if (first<sum)
                    {
                        first=sum;
                        first1="The Fox Who Painted the Moon";
                    }
                    else if(first==sum || second<sum){
                        second=sum;
                        second2="The Fox Who Painted the Moon";
                    }
                } else{
                    Log.d("FirebaseExample", "Sum not found");
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        DatabaseReference myRef5 = database.getReference("TheRunawayBubble");
        myRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                {
                    int sum = snapshot.child("sum").getValue(Integer.class);
                    String sumString=String.valueOf(sum);
                    text5.setText(sumString);
                    if (first<sum)
                    {
                        first=sum;
                        first1="The Runaway Bubble";
                    }
                    else if(first==sum || second<sum){
                        second=sum;
                        second2="The Runaway Bubble";
                    }
                } else{
                    Log.d("FirebaseExample", "Sum not found");
                }

                text6.setText(first1);
                text7.setText(second2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}