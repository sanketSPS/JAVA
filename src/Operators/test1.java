class test1 {
    public static void main(String[] args) {

        int currentSteps=8000;
        int dailyStepGoal=10000;
        currentSteps += dailyStepGoal - currentSteps; boolean isGoalAchieved = currentSteps >= dailyStepGoal;
        System.out.println(currentSteps);

        float f=2.5f;
        System.out.println(f);

        int a1,b1,c1;
        a1=b1=c1=5;
        int exp=a1+ b1++ + ++c1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(exp);
        //int ++a5 = 100;
        //System.out.println(a5);
        /*
        int x, y, z;

        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
         */

    }
}
