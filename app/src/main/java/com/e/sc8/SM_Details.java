package Komal.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SM_Details extends AppCompatActivity {

    EditText mTextFBUname;
    EditText mtextFBPass;
    EditText mTextSCUname;
    EditText mtextSCPass;
    Button mButtonSMsetup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sm__details);
        mTextFBUname=(EditText)findViewById(R.id.edittext_fb_uname);
        mtextFBPass=(EditText)findViewById(R.id.edittext_fb_pass);
        mTextSCUname=(EditText)findViewById(R.id.edittext_sc_uname);
        mtextSCPass=(EditText)findViewById(R.id.edittext_sc_pass);
        mButtonSMsetup=(Button) findViewById(R.id.button_SM_submit);
        mButtonSMsetup=(Button) findViewById(R.id.button_SM_submit);
        mButtonSMsetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cont_setup_intent = new Intent(SM_Details.this,ContinueSetup.class);
                startActivity(cont_setup_intent);

            }
        } );





    }
}
