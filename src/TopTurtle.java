class TopTurtle implements Runnable {
    public void run() {
        Turtle t = new Turtle();

        t.up();
        t.setPosition(0, 58);
        t.down();
        t.penColor("gold");
        t.width(15);

        t.right(45);
        t.forward(10);
        t.backward(20);

        t.setPosition(0, 58);
        t.right(90);
        t.forward(10);
        t.backward(20);

        t.setPosition(0, 58);
        t.left(45);
        t.forward(10);
        t.backward(20);
    }
}
