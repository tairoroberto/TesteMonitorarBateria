package com.example.testemonitorarbateria;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadCastBateria extends BroadcastReceiver {	
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		int level = intent.getIntExtra("level",0);
		Log.i("Script", "Bateria: "+level+"%");		
		
	}

}
