package inge5a.polytech.com.tpandroid;

import inge5a.polytech.com.controller.BeerController;

public class BeersActivity extends AbstractActivity{
    @Override
    protected int getContent() {
        BeerController b = new BeerController();
        b.start();

        return R.layout.activity_beers;
    }
}
