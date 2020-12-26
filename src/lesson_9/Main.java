package lesson_9;

import HW.Cat;
import HW.Competitor;
import Man.Man;
import Obstacies.Obstacies;
import Robot.Robot;
import Wall.Wall;

public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = { new Cat(), new Cat()};
        Competitor [] competitor = {(Competitor) new Robot(), (Competitor) new Robot()};
        Competitor [] competitors1 = {(Competitor) new Man(), (Competitor) new Man()};
        Obstacies [] obstacies = {new Wall(2), new Wall(22)};

        for (Competitor competitor1 : competitors) {
            for (Competitor competitor2 : competitor) {
                for (Competitor competitor3 : competitors1) {
                    for (Obstacies obstacy : obstacies) {
                        obstacy.doIt(competitor1,competitor2,competitor3);

                    }

                }

            }

        }
                        
                    }
                    
                }
                

