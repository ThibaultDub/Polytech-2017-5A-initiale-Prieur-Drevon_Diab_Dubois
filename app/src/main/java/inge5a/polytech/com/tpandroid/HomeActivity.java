package inge5a.polytech.com.tpandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.*;

public class HomeActivity extends AppCompatActivity {

    private Button btn_1vs1;
    private Button btn_1vsAI;
    private Button btn_teamVsTeam;
    private Button btn_1vs1Online;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_1vs1 = (Button) findViewById(R.id.btn_1Vs1);
        btn_1vsAI = (Button) findViewById(R.id.btn_1VsAi);
        btn_teamVsTeam = (Button) findViewById(R.id.btn_teamVsTeam);
        btn_1vs1Online = (Button) findViewById(R.id.btn_1Vs1Online);
    }


    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn_1Vs1:
                btn_1vs1.setText("ça marche");
                goToGame();
                break;
            case R.id.btn_1VsAi:
                btn_1vsAI.setText("ça fonctionne");
                goToGame();
                break;
            case R.id.btn_teamVsTeam:
                Log.i("HomeActivity", "Click on btn_teamVsTeam");
                goToGame();
                btn_teamVsTeam.setText("ça pulse");
                break;
            case R.id.btn_1Vs1Online:
                btn_1vs1Online.setText("ça roule");
                goToGame();
                break;
        }
    }

    public void goToGame(){
        Intent myIntent = new Intent(getBaseContext(), GameActivity.class);
        getBaseContext().startActivity(myIntent);
    }

}
