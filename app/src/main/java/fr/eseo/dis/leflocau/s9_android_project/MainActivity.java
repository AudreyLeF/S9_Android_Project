package fr.eseo.dis.leflocau.s9_android_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userNameEditText;
    EditText passwordEditText;
    TextView indicationsTextView;

    String userName;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.login);
        passwordEditText = findViewById(R.id.password);
        indicationsTextView = findViewById(R.id.indications);

        Button connexionButton = findViewById(R.id.button);
        connexionButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View actuelView)
            {
                if (userNameEditText.getText().length() != 0 && userNameEditText.getText().toString() != "") {
                    if (passwordEditText.getText().length() != 0 && passwordEditText.getText().toString() != "") {

                        userName = userNameEditText.getText().toString();
                        password = passwordEditText.getText().toString();
                        indicationsTextView.setText("");

                    }

                    else{
                        indicationsTextView.setText("Please enter Password");
                    }

                }
                else{
                    indicationsTextView.setText("Please enter Username");
                }

                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });
    }
}
