public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        Rectangle box = new Rectangle(0, 0, 100, 200);

        rectmovleft(box, point);

        System.out.println("New Box Attributes:");
        System.out.println("x: " + box.x);
        System.out.println("y: " + box.y);
        System.out.println("width: " + box.width);
        System.out.println("height: " + box.height);
    }

    public static void rectmovleft(Rectangle box, Point p) {
        if (p.x < 0) {
            throw new IllegalArgumentException("Usage: input x is not legal");
        }

        box.x = box.x + p.x;
        box.y = box.y + p.y;
    }
}