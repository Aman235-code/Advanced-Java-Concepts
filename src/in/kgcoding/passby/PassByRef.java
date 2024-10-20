package in.kgcoding.passby;

public class PassByRef {
    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void move(Point p){
        p.x += 1;
        p.y ++;
        System.out.println(p);
    }

    public static void main(String[] args) {
        Point point = new Point(4,8);
        System.out.println(point);
        move(point);
        System.out.println(point);
    }

}
