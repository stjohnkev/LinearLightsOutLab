package e.kevin_st_john.linearlightsoutlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LightsOutGame mGame;
    private TextView mGameStateTextView;
    private Button[] mButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code goes here
        mGame = new LightsOutGame(7);
        mGameStateTextView=findViewById(R.id.text_at_top);

        mButtons = new Button[7];

        mButtons[0] = findViewById(R.id.button0);
        mButtons[1] = findViewById(R.id.button1);
        mButtons[2] = findViewById(R.id.button2);
        mButtons[3] = findViewById(R.id.button3);
        mButtons[4] = findViewById(R.id.button4);
        mButtons[5] = findViewById(R.id.button5);
        mButtons[6] = findViewById(R.id.button6);


       upDateView();
    }

    private void upDateView() {
        //mGameStateTextView.setText(mGame.stringForGameState());


        for(int i=0;i<7;i++){
            // mButtons[i].setText(mGame.stringForButtonAtIndex(i));
            mButtons[i].setText(Integer.toString(mGame.getValueAtIndex(i)));
        }
    }

    public void pressedButton(View view){

    }
}
