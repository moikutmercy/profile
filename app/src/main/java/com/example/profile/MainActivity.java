package com.example.profile;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Find the views by their IDs
        ImageView imageViewProfile = findViewById(R.id.imageViewProfile);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewAge = findViewById(R.id.textViewAge);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewPhoneNumber = findViewById(R.id.textViewPhoneNumber);
        TextView textViewAddress = findViewById(R.id.textViewAddress);


        imageViewProfile.setImageResource(R.drawable.profilepicture);


        textViewName.setText("John Doe");
        textViewAge.setText("Age: 30");
        textViewEmail.setText("Email: johndoe@example.com");
        textViewPhoneNumber.setText("Phone: +1234567890");
        textViewAddress.setText("Address: 123 Main St, City, Country");
    }
}
