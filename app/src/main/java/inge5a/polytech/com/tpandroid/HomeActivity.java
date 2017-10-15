package inge5a.polytech.com.tpandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;

public class HomeActivity extends AbstractActivity {

    private Button btn_1vs1;
    private Button btn_1vsAI;
    private Button btn_teamVsTeam;
    private Button btn_1vs1Online;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn_1vs1 = (Button) findViewById(R.id.btn_1Vs1);
        btn_1vsAI = (Button) findViewById(R.id.btn_1VsAi);
        btn_teamVsTeam = (Button) findViewById(R.id.btn_teamVsTeam);
        btn_1vs1Online = (Button) findViewById(R.id.btn_1Vs1Online);
    }

    @Override
    protected int getContent() {
        return R.layout.activity_home;
    }

    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn_1Vs1:
                goToGame();
                break;
            case R.id.btn_1VsAi:
                goToGame();
                break;
            case R.id.btn_teamVsTeam:
                goToGame();
                break;
            case R.id.btn_1Vs1Online:
                goToGame();
                break;
        }
    }

    public void goToGame(){
        Intent myIntent = new Intent(getBaseContext(), GameActivity.class);
        getBaseContext().startActivity(myIntent);
    }

}
