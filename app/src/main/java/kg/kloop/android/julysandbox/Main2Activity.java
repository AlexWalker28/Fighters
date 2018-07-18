package kg.kloop.android.julysandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView firstHealthTextView;
    TextView firstArmorTextView;
    TextView firstSpecialTextView;
    TextView secondHealthTextView;
    Button firstKickButton;
    Button firstSpecialKickButton;
    Warrior firstWarrior;
    Warrior secondWarrior;


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

        // нужен, чтобы выбрать тип бойца
        Intent intent = getIntent();
        int firstPlayerClass = intent.getIntExtra("first_player", 0);
        int secondPlayerClass = intent.getIntExtra("second_player", 0);

        firstWarrior = new Warrior(100, 0.1, 10, 30);
        secondWarrior = new Warrior(100, 0.1, 10, 30);

        update();

        firstKickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstWarrior.kick(secondWarrior);
                update();
            }
        });



    }

    private void update() {
        firstHealthTextView.setText("" + firstWarrior.getHealth());
        firstArmorTextView.setText("" + firstWarrior.getArmour());
        secondHealthTextView.setText("" + secondWarrior.getHealth());
    }
}
