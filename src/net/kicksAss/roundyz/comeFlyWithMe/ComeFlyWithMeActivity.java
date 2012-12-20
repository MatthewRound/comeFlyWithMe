package net.kicksAss.roundyz.comeFlyWithMe;

import java.io.File;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ComeFlyWithMeActivity extends Activity implements OnClickListener 
{

	MediaPlayer mp;

	Button noWater;
	Button weGotCoffee;
	Button weGotCup;
	Button weGotFullFatMilk;
	Button weGotGas;
	Button weGotLowFatMilk;
	Button weGotSoyaMilk;
	Button weGotSweetner;
	Button wellTodaySomethingVery;

	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// views are in main.xml
		noWater = (Button) findViewById(R.id.noWater);
		weGotCoffee = (Button) findViewById(R.id.weGotCoffee);
		weGotCup = (Button) findViewById(R.id.weGotCup);
		weGotFullFatMilk = (Button) findViewById(R.id.weGotFullFatMilk);
		weGotGas = (Button) findViewById(R.id.weGotGas);
		weGotLowFatMilk = (Button) findViewById(R.id.weGotLowFatMilk);
		weGotSoyaMilk = (Button) findViewById(R.id.weGotSoyaMilk);
		weGotSweetner = (Button) findViewById(R.id.weGotSweetner);
		wellTodaySomethingVery = (Button) findViewById(R.id.wellTodaySomethingVery);

		noWater.setOnClickListener(this);
		weGotCoffee.setOnClickListener(this);
		weGotCup.setOnClickListener(this);
		weGotFullFatMilk.setOnClickListener(this);
		weGotGas.setOnClickListener(this);
		weGotLowFatMilk.setOnClickListener(this);
		weGotSoyaMilk.setOnClickListener(this);
		weGotSweetner.setOnClickListener(this);
		wellTodaySomethingVery.setOnClickListener(this);
	}


	@Override
	public void onClick(View target) 
	{
		// TODO add the others to this
		if (target == noWater) {
			this.playAudio(R.raw.but_we_got_no_water);
			
		}
	}

	private void playAudio(Uri wavFileName) 
	{
			mp = MediaPlayer.create(this, wavFileName);
			mp.start();
	}
}
