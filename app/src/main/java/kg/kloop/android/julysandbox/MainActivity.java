package kg.kloop.android.julysandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioButton first_warrior_rb;
    private RadioButton first_wizard_rb;
    private RadioButton first_assassin_rb;
    private RadioButton second_warrior_rb;
    private RadioButton second_wizard_rb;
    private RadioButton second_assassin_rb;
    private Button playButton;
    private RadioGroup firstPlayerRadioGroup;
    private RadioGroup secondPlayerRadioGroup;
    private int firstPlayer;
    private int secondPlayer;


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_warrior_rb = findViewById(R.id.first_warrior_rb);
        first_wizard_rb = findViewById(R.id.first_wizard_rb);
        first_assassin_rb = findViewById(R.id.first_assassin_rb);
        second_warrior_rb = findViewById(R.id.second_warrior_rb);
        second_wizard_rb = findViewById(R.id.second_wizard_rb);
        second_assassin_rb = findViewById(R.id.second_assassin_rb);
        playButton = findViewById(R.id.play_button);
        firstPlayerRadioGroup = findViewById(R.id.first_player_rg);
        secondPlayerRadioGroup = findViewById(R.id.second_player_rg);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (firstPlayerRadioGroup.getCheckedRadioButtonId()) {
                    case R.id.first_warrior_rb:
                        firstPlayer = Constants.WARRIOR;
                        break;
                    case R.id.first_wizard_rb:
                        firstPlayer = Constants.WIZARD;
                        break;
                    case R.id.first_assassin_rb:
                        firstPlayer = Constants.ASSASSIN;
                        break;

                }

                switch (secondPlayerRadioGroup.getCheckedRadioButtonId()) {
                    case R.id.second_warrior_rb:
                        secondPlayer = Constants.WARRIOR;
                        break;
                    case R.id.second_wizard_rb:
                        secondPlayer = Constants.WIZARD;
                        break;
                    case R.id.second_assassin_rb:
                        secondPlayer = Constants.ASSASSIN;
                        break;

                }

            }
        });



    }
}
