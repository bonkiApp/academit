public class MyRange {
    private double from;
    private double to;

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

    public boolean isInside(double number) {
        return (number >= this.from && number <= this.to);
    }

    public double findRange(MyRange range) {
        double rangeLength = Math.abs(to - from);
        return rangeLength;
    }

    public MyRange crossingRanges(MyRange range2) {
        double x1;
        double x2;
        MyRange cross;
        if (this.from == range2.from || this.to == range2.to) {
            return (this);
        }
        else if ((this.from < from && from < this.to) && (from < this.to && this.to < to)) {
            x1 = from;
            x2 = this.to;
        } else if ((from < this.from && this.from < to) && (this.from < to && to < this.to)) {
            x1 = this.from;
            x2 = to;
        } else if ((from < this.from && this.from < to) && (from < this.to && this.to < to)) {
            x1 = this.from;
            x2 = this.to;
        } else if ((this.from < from && from < this.to) && (this.from < to && to < this.to)) {
            x1 = from;
            x2 = to;
        } else {
            return null;
        }
//        return (this);
        return cross = new MyRange(x1, x2);
    }

//    public MyRange joinRanges(MyRange range2) {
//        double y1;
//        double y2;
//        y1 = (this.from < from) ? this.from : from;
//        y2 = (this.to > to) ? this.to : to;
//        return String.format("Интервал объединения: (%f, %f)", y1, y2);
//    }

    public String printRange(MyRange range) {
        return String.format("(%f, %f)", range.from, range.to);
    }


}