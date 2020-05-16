package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instruction extends AppCompatActivity {

    Button instructionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        instructionButton = findViewById(R.id.instruction_button);
        //
    }

    public void gotIt(View view) {
        view.setEnabled(false);
        finish();
    }
}
