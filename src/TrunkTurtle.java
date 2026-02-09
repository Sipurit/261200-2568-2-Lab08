class TrunkTurtle implements Runnable {
    public void run() {
        Turtle t = new Turtle();

        t.up();
        t.left(90);
        t.backward(200);
        t.width(50);
        t.penColor("black");
        t.down();
        t.forward(50);

        t.up();
        t.forward(10);
        t.down();
        t.penColor("green");
        t.left(90);
        t.forward(100);
        t.backward(200);
    }
}
