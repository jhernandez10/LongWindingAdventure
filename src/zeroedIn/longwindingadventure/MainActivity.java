package zeroedIn.longwindingadventure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.start).setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//moves to start page upon clicking the start adventure button
	final OnClickListener listener = new OnClickListener(){
		@Override
		public void onClick(final View v) {
			Intent intent = new Intent(getApplicationContext(),Start.class);
			startActivity(intent);
		}
	};
}
