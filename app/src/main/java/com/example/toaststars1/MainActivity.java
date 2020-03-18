package com.example.toaststars1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get controls for the xml file.
        final Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        final RatingBar ratBar = (RatingBar) findViewById(R.id.ratBar);

        //Get the rating.
        float starRating = ratBar.getRating();

        //Compose a string to respond to the rating.
        String responseString = ackRating(starRating);

        //Show a toast message with the response.
        Toast.makeText(this, responseString, Toast.LENGTH_SHORT ).show();


    }//onCreate()

    //Method to provide a response to the user on giving application feedback.
    public void showResponse(View arg0){




    }//showResponse()

    public String ackRating(float s){

        String ack;

        if(s >= 5.0)
            //Do something.
            ack = "Generous rating. \nGreat thanks :))";
        else
        if(s >= 4.0)
            ack = "Good rating. Thanks a lot :)";
        else
        if(s >= 3.0)
            ack = "OK rating. Have an ok day :|";
        else
        if(s >= 2.0)
            ack = "Not so good :(";
        else
            ack = "Awwww... Mean  :((";

        return ack;

    }//ackRating()

}//class
