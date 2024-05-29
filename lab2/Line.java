public class Line {
    private double k;
    private double b; 

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line otherLine) {
        if (this.k == otherLine.k && this.b == otherLine.b) {
            return null; 
        } else if (this.k == otherLine.k) {
            return null; 
        }

        double x = (otherLine.b - this.b) / (this.k - otherLine.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }

    private class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ";" + y + ")";
        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        System.out.println(line1.intersection(line2)); // (1;2)
    }
}