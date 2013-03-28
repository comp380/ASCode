package cs380.games;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.util.*;
import android.content.*;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void open15Puzzle(View v){
		Intent puzzle=new Intent(this,Puzzle15.class);
		startActivity(puzzle);
	}
}
