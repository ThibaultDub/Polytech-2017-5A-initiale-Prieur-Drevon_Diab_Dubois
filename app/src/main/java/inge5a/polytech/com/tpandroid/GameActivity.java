package inge5a.polytech.com.tpandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import inge5a.polytech.com.tpandroid.intent.IntentServiceQuestion;

public class GameActivity extends AbstractActivity {
    public class MyReceiver extends BroadcastReceiver {
        public static final String ACTION_RESP = "inge5a.polytech.com.tpandroid.intent.action.TEXT_TO_DISPLAY";

        @Override
        public void onReceive(Context context, Intent intent) {
            String text = intent.getStringExtra(IntentServiceQuestion.PARAM_OUT_MSG);
            tv_question.setText(text);
        }
    }

    private TextView tv_question;
    private MyReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv_question = (TextView) findViewById(R.id.tv_question);


        IntentFilter filter = new IntentFilter(MyReceiver.ACTION_RESP);
        filter.addCategory(Intent.CATEGORY_DEFAULT);
        receiver = new MyReceiver();
        registerReceiver(receiver, filter);


        Intent msgIntent = new Intent(this, IntentServiceQuestion.class);
        msgIntent.putExtra(IntentServiceQuestion.PARAM_IN_MSG, "new_question");
        startService(msgIntent);



    }

    @Override
    protected int getContent() {
        return R.layout.activity_game;
    }


}

