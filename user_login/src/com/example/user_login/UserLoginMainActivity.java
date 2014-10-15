package com.example.user_login;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;



public class UserLoginMainActivity extends ActionBarActivity {

	private static final String LOGCAT="MainActivity";
	EditText editLogin;
	EditText editPassword;
	UserLogin userLogin;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editLogin = (EditText)findViewById(R.id.editText1);
        editPassword = (EditText)findViewById(R.id.editText2);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void onClickButtonAcceder(View v){
    	try{
    		String login = editLogin.getText().toString();
    		String password = editPassword.getText().toString();
    		userLogin = new UserLogin(login, password);
    		Log.i(LOGCAT, userLogin.toString());
    	} catch (UserLoginException e){
    		Log.e(LOGCAT, e.getMessage());
    	}
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
