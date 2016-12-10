package selipeproduct.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//    }
}
