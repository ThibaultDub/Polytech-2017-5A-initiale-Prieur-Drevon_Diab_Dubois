package inge5a.polytech.com.tpandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.FrameLayout;

/**
 * Created by nico- on 11/10/2017.
 */

public abstract class AbstractActivity extends AppCompatActivity {

    private FrameLayout fl_activity_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);

        Toolbar toolbar = (Toolbar) findViewById(R.id.fragment_toolbar_main);
        this.setSupportActionBar(toolbar);


        fl_activity_content = (FrameLayout) findViewById(R.id.activity_content);
        this.getLayoutInflater().inflate(getContent(),fl_activity_content);
    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    protected abstract int getContent();

}
