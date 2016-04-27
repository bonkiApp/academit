package ru.kibon.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
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
        return (number >= from && number <= to);
    }

    public double findRange(double from, double to){
        double rangeLength = Math.abs(to - from);
        return rangeLength;
    }

    double x1;
    double x2;
    public double crossingRanges(double from, double to, double from1, double to1){
        if ((Math.abs(from1) > Math.abs(from) && Math.abs(from1) < Math.abs(to)) && ((Math.abs(to) > Math.abs(from1)) && (Math.abs(to) < Math.abs(to1))) ){
            x1 = from1;
            x2 = to;
        }
        if ((Math.abs(to1) > Math.abs(from) && Math.abs(to1) < Math.abs(to)) && ((Math.abs(from) > Math.abs(from1)) && (Math.abs(from) < Math.abs(to1))) ){
            x1 = from;
            x2 = to1;
        }

        System.out.printf("Диапазон пересечения: %f%f", x1, x2 );
       return ;
    }
}

