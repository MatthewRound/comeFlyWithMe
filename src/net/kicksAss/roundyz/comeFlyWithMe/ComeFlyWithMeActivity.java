package net.kicksAss.roundyz.comeFlyWithMe;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ComeFlyWithMeActivity extends Activity implements OnClickListener {

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

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// this.setTitle();
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
		} else if (target == weGotCoffee) {
			this.playAudio(R.raw.we_got_coffee);
		}else if (target == weGotCup) {
			this.playAudio(R.raw.we_got_cup);
		}else if (target == weGotFullFatMilk){
			this.playAudio(R.raw.we_got_full_fat_milk);
		}else if (target == weGotGas){
			this.playAudio(R.raw.we_got_gas_to_give_us_a_hot_hot_fire);
		}else if (target ==weGotLowFatMilk){
			this.playAudio(R.raw.we_got_low_fat_milk);
		}else if (target ==weGotSoyaMilk){
			this.playAudio(R.raw.we_got_soya_milk_for_the_lactose_intollerant_community);
		}else if (target ==weGotSweetner){
			this.playAudio(R.raw.we_got_sweetner);
		}else if (target ==wellTodaySomethingVery){
			this.playAudio(R.raw.well_today_something_very_mysterious_occured);
		}
	}

	private void playAudio(int wavFileName) {
		mp = MediaPlayer.create(this, wavFileName);
		mp.start();
	}
}
