package com.bilal.test;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.form);
    String email=getIntent().getStringExtra("login");
        Button btn=findViewById(R.id.submitbtn);


    RatingBar r1,r2,r3,r4;
    r1=findViewById(R.id.r1);
    r2=findViewById(R.id.r2);
    r3=findViewById(R.id.r3);
    r4=findViewById(R.id.r4);
    Float num1,num2,num3,num4;
    num1=r1.getRating();
    num2=r2.getRating();
    num3=r3.getRating();
    num4=r4.getRating();
    final String data=email+"/n"+"q1:"+num1.toString()+"q2:"+num2.toString()+"q3:"+num3.toString()+"q4:"+num4.toString()+"/n";
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        writeToFile(data);
        Toast.makeText(form.this,"Thank You for your Feedback!!!", Toast.LENGTH_SHORT);

    }
});




    }
    private void writeToFile(String data)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("Rating.txt",
                    Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();


        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
