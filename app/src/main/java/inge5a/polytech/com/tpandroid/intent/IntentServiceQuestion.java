package inge5a.polytech.com.tpandroid.intent;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import inge5a.polytech.com.tpandroid.GameActivity;

/**
 * Created by thibault on 10/18/17.
 */

public class IntentServiceQuestion extends IntentService {
    public static final String PARAM_IN_MSG = "imsg";
    public static final String PARAM_OUT_MSG = "omsg";


    public IntentServiceQuestion(){
        super("IntentServiceQuestion");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String current_request = intent.getStringExtra(PARAM_IN_MSG);

        String resultTxt = "bitepoilcouille";

        if (current_request.equals("new_question")){

            resultTxt="Quelle est la couleur du cheval blanc d'henry IV ? //Blanc //Rouge //Multicolore//Parabolique";
        }
        else if (current_request.equals("check_answer")){
            resultTxt="bien joué champion";
        }

        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(GameActivity.MyReceiver.ACTION_RESP);
        broadcastIntent.addCategory(Intent.CATEGORY_DEFAULT);
        broadcastIntent.putExtra(PARAM_OUT_MSG, resultTxt);
        sendBroadcast(broadcastIntent);

    }
}
