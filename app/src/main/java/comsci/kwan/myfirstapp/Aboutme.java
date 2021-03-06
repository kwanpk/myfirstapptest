package comsci.kwan.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Aboutme extends AppCompatActivity {
    //Explicit
    MediaPlayer mediaPlayer;
    int soundId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        //Toast onClick
        ImageView clickImageView = (ImageView)findViewById(R.id.imvAboutme);
        clickImageView.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view){
             Toast.makeText(getApplicationContext(),"Hello ! My Name is Pornsiri",Toast.LENGTH_LONG).show();
                //show sound1 when click image กด1 ครั้ง
             soundId = R.raw.hello;
             playSound (soundId);
         }

        });
        //end Toast onlongclick
        ImageView longClickImageView = (ImageView)findViewById(R.id.imvAboutme);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
            public boolean onLongClick(View view){
            Toast.makeText(getApplicationContext(),"Thank Guy",Toast.LENGTH_LONG).show();
          //show sound2 when click image กดค้าง
           soundId = R.raw.thank;
            return true;
        }

        });
    }

    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(),soundId);
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