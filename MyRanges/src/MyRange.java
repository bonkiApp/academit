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
        if (this.from == range2.from || this.to == range2.to) {
            return (this);
        }
        else if ((this.from < range2.from && range2.from < this.to) && (range2.from < this.to && this.to < range2.to)) {
            x1 = range2.from;
            x2 = this.to;
        } else if ((range2.from < this.from && this.from < range2.to) && (this.from < range2.to && range2.to < this.to)) {
            x1 = this.from;
            x2 = range2.to;
        } else if ((range2.from < this.from && this.from < range2.to) && (range2.from < this.to && this.to < range2.to)) {
            x1 = this.from;
            x2 = this.to;
        } else if ((this.from < range2.from && range2.from < this.to) && (this.from < range2.to && range2.to < this.to)) {
            x1 = range2.from;
            x2 = range2.to;
        } else {
            return null;
        }
        return  new MyRange(x1, x2);
    }

    public MyRange joinRanges(MyRange range2) {
        double y1;
        double y2;
        y1 = (this.from < range2.from) ? this.from : range2.from;
        y2 = (this.to > range2.to) ? this.to : range2.to;
        return new MyRange(y1, y2);
    }

    public String printRange(MyRange range) {
        if (range != null) {
            return String.format("(%f, %f)", range.from, range.to);
        } else return null;

    }


}