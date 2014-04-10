package zeroedIn.longwindingadventure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TextView;

public class Start extends Activity {
	
	private String previous_message = "You are alone in a forest and don't know where you are all you can see is the night sky";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_start);
		
		Intent intent = getIntent();
		fillDecisions(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}
	
	public void fillDecisions(Intent intent){
		
		Resources res = getResources();
		//TextView previouse = res.
		
		//setContentView(R.layout.activity_start);
	}
}
