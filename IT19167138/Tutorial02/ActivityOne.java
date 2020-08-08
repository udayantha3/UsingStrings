package Tutorial02;

public class ActivityOne extends AppCompatActivity {
	
	TextView txtView2;
	
	protected void onCreate( Bundle savedInstanceState ) {
		
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_one );
		
		Log.i( tag:"Lifecycle", msg:"onCreate() invoked" );
		
		txtView2 = findViewById( R.id.textview2 );
		txtView2.setText( "Here, I am the text message 2" );
			
	}
	
	public void onStart() {
		
		super.onStart();
		Log.i( tag: "Lifecycle", msg: "onStart() invoked" );
		
	}
	
	public void onRestart() {
		
		super.onRestart();
		Log.i( tag: "Lifecycle", msg: "onRestart() invoked" );
		
	}
	
	public void onResume() {
		
		super.onResume();
		Log.i( tag: "Lifecycle", msg: "onResume() invoked" );
		
	}
	
	public void onPause() {
		
		super.onPause();
		Log.i( tag: "Lifecycle", msg: "onPause() invoked" );
		
	}
	
	public void onStop() {
		
		super.onStop();
		Log.i( tag: "Lifecycle", msg: "onStop() invoked" );
		
	}

	public void onDestroy() {
	
		super.onDestroy();
		Log.i( tag: "Lifecycle", msg: "onDestroy() invoked" );
	
	}
	

}
