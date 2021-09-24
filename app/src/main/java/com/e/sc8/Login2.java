package Komal.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login2 extends AppCompatActivity {
    EditText mTextUsername;
    EditText mtextPassword;
    Button mButtonLogin;
    TextView mTextViewOr;
    Button mButtonRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mTextUsername=(EditText)findViewById(R.id.edittext_username);
        mtextPassword=(EditText)findViewById(R.id.edittext_password);
        mButtonLogin=(Button) findViewById(R.id.button_login);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepgintent = new Intent(Login2.this,HomePage.class);
                startActivity(homepgintent);

            }
        });

        mButtonRegister=(Button) findViewById(R.id.button_register);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent = new Intent(Login2.this,Register.class);
                startActivity(registerintent);

            }
        } );

    }
}
