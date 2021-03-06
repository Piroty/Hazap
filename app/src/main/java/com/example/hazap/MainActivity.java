package com.example.hazap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Home();
    }
    public void Home(){
        setContentView(R.layout.home);
        Button gamestart_button=findViewById(R.id.gamestart_btn);
        Button option_button=findViewById(R.id.option_btn);
        gamestart_button.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View v) {
                                                    Game();
                                                }
                                            }
        );
        option_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Option();
            }
        });
    }
    public void Game(){
        setContentView(R.layout.game);
        Button backhome_button=findViewById(R.id.backhome_btn);
        backhome_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Home();
            }
        });
    }
    public void Option(){
        setContentView(R.layout.option);
        Button backhome_button=findViewById(R.id.backhome_btn);
        backhome_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Home();
            }
        });
    }
    public void Result(){
        setContentView(R.layout.result);
    }
}
