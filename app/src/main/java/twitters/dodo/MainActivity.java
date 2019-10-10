package twitters.dodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView userImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userImageView = findViewById(R.id.user_image_view);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(userImageView);
    }
}
