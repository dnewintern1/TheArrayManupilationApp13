package com.example.arraymanupilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtIndex= findViewById(R.id.txtIndex);
        TextView txtValue = findViewById(R.id.txtValue);

        String OldIndex="";
        String oldValue="";


        int[] Thearray= new int[9];

        for(int index = 0; index < 9;index++ ){

            int result = 4 + (5 * index);
            Thearray[index]=result;

        }

     //   txtValue.setText(Thearray[0] + " ");

       for(int counter= 0; counter<9;counter++){

            oldValue = txtValue.getText().toString() + "\n";
            OldIndex = txtIndex.getText().toString() + '\n';

            txtIndex.setText(OldIndex + counter + " ");
            txtValue.setText(oldValue + Thearray[counter] + " ");


        }


    }
}