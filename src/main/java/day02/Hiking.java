package day02;

import java.util.List;

public class Hiking {
    public double getPlusElevation(List<Double> listOfAltitude) {
        double elevation = 0;
        for (int i = 1; i < listOfAltitude.size(); i++) {
            double current = listOfAltitude.get(i);
            double theLast = listOfAltitude.get(i-1);
            if (current>theLast){
                elevation+= current-theLast;
            }
        }
        return elevation;
    }
}
