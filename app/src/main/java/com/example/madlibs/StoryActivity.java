package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import R.layout.activity_story;

public class StoryActivity extends AppCompatActivity {

    public static final String MY_ADJ = "editTextAdj";
    public static final String MY_NOUN = "editTextNoun";
    public static final String MY_NAME = "editTextName";
    public static final String MY_JOB = "editTextJob";
    public static final String MY_ADJ2 = "editTextAdj2";
    public static final String MY_PLACE = "placeOneStr";
    public static final String MY_VERB = "verbOneStr";
    public static final String MY_PHRASE = "phraseOneStr";
    public String strToDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String myAdj = intent.getStringExtra(MY_ADJ);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myName = intent.getStringExtra(MY_NAME);
        String myJob = intent.getStringExtra(MY_JOB);
        String myAdj2 = intent.getStringExtra(MY_ADJ2);
        String myPlace = intent.getStringExtra(MY_PLACE);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myPhrase = intent.getStringExtra(MY_PHRASE);


        strToDisplay = "One day in a "+ myAdj + " land, a(n) " + myNoun + " by the name of "
                + myName + " built a great reputation as a thief, renowned by all the wrong people." +
                " But in a turn of fate, " + myName + " decided to pursue a more honest work as a(n) "
                + myJob + ". The problem was, he/she/they/it was a " + myAdj2 + " being and nothing was " +
                "going as planned at all! In a blink of an eye, " + myName + " had a family and eight " +
                "children to take care of. One of whom was sick with illness. He/she/they/it needed money" +
                " before time ran out. So " + myName + " the " + myNoun + " went to " + myPlace +
                " to look for a solution to such problems.There, in a middle of a crowd, " + myName + " began to "
                + myVerb + " and suddenly scream \"" + myPhrase.toUpperCase() + "!\"";
        TextView str = (TextView) findViewById(R.id.textViewLibs);
        str.setText(strToDisplay);
    }

    public void onCreate(View v)
    {
        overridePendingTransition(R.anim.fadein,R.anim.fadeout);
        //source: https://stackoverflow.com/questions/3389501/activity-transition-in-android
    }

    public void shareInfo(View v)
    {

        //these three lines can send the image to any app through any app that sends messages
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
