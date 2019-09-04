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

        //if(adjOneStr.length() == 0 || nounOneStr.length() == 0 || nameOneStr.length() == 0 ||
               // jobOneStr.length() == 0 || adjTwoStr.length() == 0 || placeOneStr.length() == 0 ||
                //verbOneStr.length() == 0 || phraseOneStr.length() == 0)
        //{
           // Toast t = new Toast()
        //}

        // creating the intent object so i can send data
        Intent intent = new Intent(this, StoryActivity.class);


        // putting data from edit text fields into intent to send to other activity
        // MY_NAME and MY_AGE are constants in InfoActivity class
        intent.putExtra(StoryActivity.MY_ADJ, adjOneStr);
        intent.putExtra(StoryActivity.MY_NOUN, nounOneStr);
        intent.putExtra(StoryActivity.MY_NAME, nameOneStr);
        intent.putExtra(StoryActivity.MY_JOB, jobOneStr);
        intent.putExtra(StoryActivity.MY_ADJ2, adjTwoStr);
        intent.putExtra(StoryActivity.MY_PLACE, placeOneStr);
        intent.putExtra(StoryActivity.MY_VERB, verbOneStr);
        intent.putExtra(StoryActivity.MY_PHRASE, phraseOneStr);

        startActivity(intent);
    }


}
