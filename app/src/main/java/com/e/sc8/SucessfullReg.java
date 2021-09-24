package Komal.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SucessfullReg extends AppCompatActivity {
    Button mButtonSocialMedia;
    Button mButtonBanking;
    Button mButtonMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucessfull_reg);
        mButtonSocialMedia=(Button) findViewById(R.id.button_SocialMedia);
        mButtonSocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent successintent = new Intent(SucessfullReg.this,SM_Details.class);
                startActivity(successintent);

            }
        } );
        mButtonBanking=(Button) findViewById(R.id.button_Banking);
        mButtonBanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent successintent = new Intent(SucessfullReg.this,Bank_details.class);
                startActivity(successintent);

            }
        } );
        mButtonMail=(Button) findViewById(R.id.button_Mail);
        mButtonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent successintent = new Intent(SucessfullReg.this,Mail_details.class);
                startActivity(successintent);

            }
        } );

    }
}
