package com.example.djurus.decisions2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView champIcon;
    private TextView champName;
    private Button goButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        champIcon= (ImageView)findViewById(R.id.champIcon);
        champName = (TextView)findViewById(R.id.champName);
        goButton = (Button) findViewById(R.id.goButton);
//        champName.setText("Test");
//        champIcon.setImageResource(R.drawable.akali);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double randomNum=Math.random();
                Log.d("Our random number",""+randomNum);
                if(randomNum < 0.2){
                    champName.setText("Akali");
                    champIcon.setImageResource(R.drawable.akali);
                }
                else if( randomNum < 0.4){
                    champName.setText("Gragas");
                    champIcon.setImageResource(R.drawable.gragas);
                }
                else if (randomNum < 0.6) {
                    champName.setText("Lissandra");
                    champIcon.setImageResource(R.drawable.lissandra);
                }
                else if (randomNum < 0.8){
                    champName.setText("Malphite");
                    champIcon.setImageResource(R.drawable.malphite);
                }
                else{
                    champName.setText("Pantheon");
                    champIcon.setImageResource(R.drawable.pantheon);
                }
                Intent i = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(i);
            }
        });
    }
}
