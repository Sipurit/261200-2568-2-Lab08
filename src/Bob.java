public class Bob {
    public static void main(String[] args) {

        Thread t1 = new Thread(new TrunkTurtle());
        Thread t2 = new Thread(new BranchTurtle());
        Thread t3 = new Thread(new TopTurtle());

        t1.start();
        t2.start();
        t3.start();
    }
}
