package kg.kloop.android.julysandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView firstHealthTextView;
    TextView firstArmorTextView;
    TextView firstSpecialTextView;
    TextView secondHealthTextView;
    Button firstKickButton;
    Button firstSpecialKickButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstHealthTextView = findViewById(R.id.first_health_tv);
        firstArmorTextView = findViewById(R.id.first_armor_tv);
        firstSpecialTextView = findViewById(R.id.first_special_tv);
        secondHealthTextView = findViewById(R.id.second_health_tv);
        firstKickButton = findViewById(R.id.first_kick_b);
        firstSpecialKickButton = findViewById(R.id.first_special_kick_b);



    }
}
