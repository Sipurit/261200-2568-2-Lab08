class BranchTurtle implements Runnable {
    public void run() {
        Turtle t = new Turtle();

        t.up();
        t.penColor("green");
        t.width(50);
        t.setPosition(0, -100);
        t.down();
        t.forward(80);
        t.backward(160);

        for (int i = 1; i < 5; i++) {
            int y = 10 * i;
            t.up();
            t.setPosition(0, -100 + (4 * y));
            t.down();
            t.forward(80 - (20 * i));
            t.backward(160 - (40 * i));
        }
    }
}
