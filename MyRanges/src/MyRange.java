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

//    public MyRange crossingRanges(MyRange range2) {
//        double x1;
//        double x2;
//        if (this.from == range2.from || this.to == range2.to) {
//            return ((this.from, this.to));
//        }
//        else if ((from < from1 && from1 < to) && (from1 < to && to < to1)) {
//            x1 = from1;
//            x2 = to;
//        } else if ((from1 < from && from < to1) && (from < to1 && to1 < to)) {
//            x1 = from;
//            x2 = to1;
//        } else if ((from1 < from && from < to1) && (from1 < to && to < to1)) {
//            x1 = from;
//            x2 = to;
//        } else if ((from < from1 && from1 < to) && (from < to1 && to1 < to)) {
//            x1 = from1;
//            x2 = to1;
//        } else {
//            return String.format("NULL");
//        }
//        return (this);
//        return String.format("Интервал пересечения: (%f, %f)", x1, x2);
//    }

//    public MyRange joinRanges(MyRange range2) {
//        double y1;
//        double y2;
//        y1 = (this.from < from) ? this.from : from;
//        y2 = (this.to > to) ? this.to : to;
//        return String.format("Интервал объединения: (%f, %f)", y1, y2);
//    }

    public String printRange (MyRange range){
        return String.format("(%f, %f)", range.from, range.to);
    }
}