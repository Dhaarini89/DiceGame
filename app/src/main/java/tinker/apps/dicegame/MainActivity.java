package tinker.apps.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button button;
    ImageView imageView1,imageView2;
    Random r1=new Random();
    Random r2 = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        layout = findViewById(R.id.layout);


    }

    public void ROLL(View view)
    {
     int dice1 = r1.nextInt(6)+ 1;
     int dice2 = r2.nextInt(6) + 1;

     switch (dice1)
     {
         case 1:
             imageView1.setImageResource(R.drawable.dice1);
             break;
         case 2:
             imageView1.setImageResource(R.drawable.dice2);
             break;
         case 3:
             imageView1.setImageResource(R.drawable.dice3);
             break;
         case 4:
             imageView1.setImageResource(R.drawable.dice4);
             break;
         case 5:
             imageView1.setImageResource(R.drawable.dice5);
             break;
         case 6:
             imageView1.setImageResource(R.drawable.dice6);
             break;

     }
        switch (dice2) {
            case 1:
                imageView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6);
                break;
        }
    }

 }