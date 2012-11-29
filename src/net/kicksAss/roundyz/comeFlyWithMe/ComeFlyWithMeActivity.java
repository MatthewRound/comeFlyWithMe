package net.kicksAss.roundyz.comeFlyWithMe;

import java.io.File;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
//import android.R;



public class ComeFlyWithMeActivity extends Activity {

	MediaPlayer  mp;
    public ComeFlyWithMeActivity(Bundle onSavedStateInstance) {
        // eliding some bookkeepping
    	setTitle("Precious little app");
    	Uri snd = Uri.fromFile(new File(Environment.getExternalStorageDirectory().getPath()+"/comeFlyTest.wav"));
    	mp = MediaPlayer.create(this, snd);

        Button zero = (Button)this.findViewById(R.id.button1);
        zero.setText("me like the...");
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
