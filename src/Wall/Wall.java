package Wall;

import HW.Competitor;
import Obstacies.Obstacies;

public class Wall implements Obstacies {

    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public void doIt(Competitor competitor1, Competitor competitor2, Competitor c) {
        c.jump(heigth);

    }
}
