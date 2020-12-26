package Man;

public class Man implements Competitor {

    private int maxRun;
    private int maxJump;

    private boolean onDistance;

    public Man() {
        maxRun = 500;
        maxJump = 20;
        onDistance = true;
    }


    @Override
    public void run(int dist) {
        if (dist > maxRun) {
            System.out.println("Кот не пробежит" + dist + "m");
            onDistance = false;
        } else {
            System.out.println("Кто пробежит" + dist + "m");
        }
    }

    @Override
    public void jump(int heigth) {
        if (heigth > maxJump) {
            System.out.println("Кот не прыгнет" + heigth + "m");
            onDistance = false;
        } else {
            System.out.println("Кто прыгнет" + heigth + "m");
        }
    }

    @Override
    public boolean onDistance() {
        return onDistance;
    }

    public class ManCompetitor {
    }
}
