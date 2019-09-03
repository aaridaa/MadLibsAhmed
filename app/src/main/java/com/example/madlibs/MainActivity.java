package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v)
    {
        // getting a reference to my edit text fields
        EditText adjOne = (EditText) findViewById(R.id.editTextAdj);
        EditText nounOne = (EditText) findViewById(R.id.editTextNoun);
        EditText nameOne = (EditText) findViewById(R.id.editTextName);
        EditText jobOne = (EditText) findViewById(R.id.editTextJob);
        EditText adjTwo = (EditText) findViewById(R.id.editTextAdj2);
        EditText placeOne = (EditText) findViewById(R.id.editTextPlace);
        EditText verbOne = (EditText) findViewById(R.id.editTextVerb);
        EditText phraseOne = (EditText) findViewById(R.id.editTextPhrase);

        // extracting the text from those edit text fields
        String adjOneStr = adjOne.getText().toString();
        String nounOneStr = nounOne.getText().toString();
        String nameOneStr = nameOne.getText().toString();
        String jobOneStr = jobOne.getText().toString();
        String adjTwoStr = adjTwo.getText().toString();
        String placeOneStr = placeOne.getText().toString();
        String verbOneStr = verbOne.getText().toString();
        String phraseOneStr = phraseOne.getText().toString();

        // creating the intent object so i can send data
        //Intent intent = new Intent(this, InfoActivity.class);


        // putting data from edit text fields into intent to send to other activity
        // MY_NAME and MY_AGE are constants in InfoActivity class
       // intent.putExtra(InfoActivity.MY_ADJ, adjOneStr);
        //intent.putExtra(InfoActivity.MY_NOUN, nounOneStr);
    }
}
