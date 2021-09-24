package Komal.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    EditText mTextUsername;
    EditText mtextPassword;
    EditText mtextEmail;
    EditText mtextPhone;
    EditText mtextDOB;
    RadioButton mTextMale;
    RadioButton mTextFemale;
    Button mButtonSubmit;
    Button mButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mTextUsername=(EditText)findViewById(R.id.edittext_username);
        mtextPassword=(EditText)findViewById(R.id.edittext_password);
        mtextEmail=(EditText)findViewById(R.id.edittext_emailid);
        mtextPhone=(EditText)findViewById(R.id.edittext_phone);
        mtextDOB=(EditText)findViewById(R.id.edittext_dob);
        mButtonSubmit=(Button) findViewById(R.id.button_submit);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent successintent = new Intent(Register.this,SucessfullReg.class);
                startActivity(successintent);

            }
        } );
    }
}
