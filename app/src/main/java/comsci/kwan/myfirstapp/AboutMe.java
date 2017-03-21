package comsci.kwan.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutMe extends AppCompatActivity {
    //Explicit
    MediaPlayer mediaPlayer;
    int soundId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
            //toast onclick
        ImageView clickImageView = (ImageView) findViewById(R.id.imvAboutme);
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello ! My Name is Pornsiri ", Toast.LENGTH_LONG).show();
            //show sound1 when click image
                soundId = R.raw.hello;
                playSound (soundId);
            }

        });
            // end toast onlongclick
        ImageView longClickImageView = (ImageView)findViewById(R.id.imvAboutme);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Thank Guy", Toast.LENGTH_LONG).show();
                //show sound2 when click image
                soundId = R.raw.thank;
                playSound(soundId);
                return true;
            }

            });
        //Phone onClick

        }

    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundId);
        mediaPlayer.start();

    }

    public void onClickFacebook(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/pkraksasook"));
        startActivity(intent);

    }

    public void clickBackme (View view){
        finish();
    }

}

