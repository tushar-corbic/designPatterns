package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class SqaurePegAdapter extends RoundPeg{
    private SquarePeg squarePeg;

    public SqaurePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @override
    public double getRadius(){
        double result
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result
    }
}