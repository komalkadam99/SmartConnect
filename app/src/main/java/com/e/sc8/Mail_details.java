package Komal.sc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mail_details extends AppCompatActivity {

    EditText mTextGmailUname;
    EditText mtextGmailPass;
    EditText mTextOutlookUname;
    EditText mtextOutlookPass;
    Button mButtonMailsetup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_details);
        mTextGmailUname=(EditText)findViewById(R.id.edittext_gmail_id);
        mtextGmailPass=(EditText)findViewById(R.id.edittext_gmail_pass);
        mTextOutlookUname=(EditText)findViewById(R.id.edittext_outlook_uname);
        mtextOutlookPass=(EditText)findViewById(R.id.edittext_outlook_pass);
        mButtonMailsetup=(Button) findViewById(R.id.button_Mail_submit);
        mButtonMailsetup=(Button) findViewById(R.id.button_Mail_submit);
        mButtonMailsetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cont_setup_intent = new Intent(Mail_details.this,ContinueSetup.class);
                startActivity(cont_setup_intent);

            }
        } );
    }
}
