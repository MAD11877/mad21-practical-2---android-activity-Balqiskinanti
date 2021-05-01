package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isFollowed = false;
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("Hello World !",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                0,
                false);
        TextView nameTxt = findViewById(R.id.name);
        TextView descTxt = findViewById(R.id.description);
        Button followBtn = findViewById(R.id.follow);
        nameTxt.setText(user.getName());
        descTxt.setText(user.getDescription());
        followBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(user.isFollowed()) {
                    user.setFollowed(false);
                    followBtn.setText("Follow");
                    Log.v(TAG,"following..");
                }
                else{
                    user.setFollowed(true);
                    followBtn.setText("Unfollow");
                    Log.v(TAG,"unfollowing..");
                }
            }
        });
        Log.v(TAG, "Create");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}