public class MyRange {
    private static double from;
    private static double to;

    public MyRange(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public static boolean isInside(double number) {
        return (number >= from && number <= to);
    }

    public static double findRange(MyRange range) {
        double rangeLength = Math.abs(to - from);
        return rangeLength;
    }

    public MyRange crossingRanges(MyRange range1, MyRange range2) {
        double x1;
        double x2;
        if (from == from1 || to == to1) {
            return "Интервалы совпадают";
        } else if ((from < from1 && from1 < to) && (from1 < to && to < to1)) {
            x1 = from1;
            x2 = to;
        } else if ((from1 < from && from < to1) && (from < to1 && to1 < to)) {
            x1 = from;
            x2 = to1;
        } else if ((from1 < from && from < to1) && (from1 < to && to < to1)) {
            x1 = from;
            x2 = to;
        } else if ((from < from1 && from1 < to) && (from < to1 && to1 < to)) {
            x1 = from1;
            x2 = to1;
        } else {
            return String.format("NULL");
        }

        return String.format("Интервал пересечения: (%f, %f)", x1, x2);
    }

}