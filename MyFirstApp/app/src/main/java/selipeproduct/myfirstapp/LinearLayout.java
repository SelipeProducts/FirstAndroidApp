package selipeproduct.myfirstapp;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.ContentValues;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


public class LinearLayout extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // Initialize member TextView so we can manipulate it later
    //    mTextView = (TextView) findViewById(R.id.text_message);


    }
    //

    //
    @Override
    public void onDestroy() { //destroying an activity
        super.onDestroy();  // Always call the superclass
        // Stop method tracing that the activity started during onCreate()
        android.os.Debug.stopMethodTracing();
    }

    //
    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first

        // Release the Camera because we don't need it when paused
        // and other activities might need to use it.
//        if (mCamera != null) {
//            mCamera.release();
//            mCamera = null;
//        }
    }
    //
    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first

        // Get the Camera instance as the activity achieves full user focus
//        if (mCamera == null) {
//            initializeCamera(); // Local method to handle camera init
//        }
    }
    //
    @Override
    protected void onStop() {
        super.onStop();  // Always call the superclass method first

        // Save the note's current draft, because the activity is stopping
        // and we want to be sure the current note progress isn't lost.
//        ContentValues values = new ContentValues();
//        values.put(NotePad.Notes.COLUMN_NAME_NOTE, getCurrentNoteText());
//        values.put(NotePad.Notes.COLUMN_NAME_TITLE, getCurrentNoteTitle());
//
//        getContentResolver().update(
//                mUri,    // The URI for the note to update.
//                values,  // The map of column names and new values to apply to them.
//                null,    // No SELECT criteria are used.
//                null     // No WHERE columns are used.
//        );
    }
    //

    @Override
    protected void onStart() {
        super.onStart();  // Always call the superclass method first

        // The activity is either being restarted or started for the first time
        // so this is where we should make sure that GPS is enabled
//        LocationManager locationManager =
//                (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
//
//        if (!gpsEnabled) {
//            // Create a dialog here that requests the user to enable GPS, and use an intent
//            // with the android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS action
//            // to take the user to the Settings screen to enable GPS when they click "OK"
//        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();  // Always call the superclass method first

        // Activity being restarted from stopped state
    }
    //
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) { //save activity state
        // Save the user's current game state
//        static final String STATE_SCORE = "playerScore"; //instance variables
//        static final String STATE_LEVEL = "playerLevel";
//        savedInstanceState.putInt(STATE_SCORE, mCurrentScore);
//        savedInstanceState.putInt(STATE_LEVEL, mCurrentLevel);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
    //


    //
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
