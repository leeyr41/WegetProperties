package leeyr41.buttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button but=(Button)findViewById(R.id.but1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(MainActivity.this, "좀 있으면 끝나요~~!!!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        setContentView(R.layout.activity_main);

    }
}
