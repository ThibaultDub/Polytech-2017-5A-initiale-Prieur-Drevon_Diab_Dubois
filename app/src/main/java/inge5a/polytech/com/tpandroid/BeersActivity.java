package inge5a.polytech.com.tpandroid;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import inge5a.polytech.com.controller.BeerController;
import inge5a.polytech.com.model.Beer;
import inge5a.polytech.com.retrofit.RecyclerViewAdapter;

public class BeersActivity extends AbstractActivity{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Beer> beerList;

    @Override
    protected int getContent() {
        return R.layout.activity_beers;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beers);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        BeerController b = new BeerController();
        b.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mAdapter = new RecyclerViewAdapter(beerList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
