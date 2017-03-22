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

public class Aboutme1 extends AppCompatActivity {

    //Explicit
    MediaPlayer mediaPlayer;
    int soundId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme1);
        //Toast onClick
        ImageView clickImageView = (ImageView) findViewById(R.id.imvAboutme);
        clickImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello ! My Name is Pornsiri", Toast.LENGTH_LONG).show();
                //show sound1 when click image
                soundId = R.raw.hello;
                playSound(soundId);
            }
        }); // End Toast OnlongClick

        ImageView longClickImageView = (ImageView) findViewById(R.id.imvAboutme);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Toast.makeText(getApplicationContext(),"Thank Guy",Toast.LENGTH_LONG).show();
                soundId = R.raw.thank;
                playSound(soundId);
                return true;
            }

        });
        // phone onclick
        TextView phonetextview = (TextView)findViewById(R.id.textView5);
        phonetextview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:0875695672"));
                startActivity(phoneIntent);
            }
        });
    }

    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundId);
        mediaPlayer.start();
    }

    public void onClickfacebook (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/pkraksasook"));
        startActivity(intent);
    }

    public void clickBackAboutme (View view){
        finish();
    }

}