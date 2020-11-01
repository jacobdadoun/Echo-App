package com.example.echo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView enterTextInTextView;
    private TextView jacobDadounText;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        enterTextInTextView = findViewById(R.id.banner);
        editText = findViewById(R.id.echo_input);
        button = findViewById(R.id.echo_button);
        jacobDadounText = findViewById(R.id.jacobDadounText);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action", null).show();
            }
        });

        initButtonListener();
    }

    public void initButtonListener(){
        button.setOnClickListener((v) -> {
            jacobDadounText.setText((editText.getText().toString()));
        });
    }
}