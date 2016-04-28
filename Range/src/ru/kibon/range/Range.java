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
    public String crossingRanges(double from, double to, double from1, double to1){
        if (from == from1 || to == to1){
            return "Диапазоны совпадают";
        }
        else if ((from < from1 && from1 < to) && (from1 < to && to < to1)){
            x1 = from1;
            x2 = to;
        }
        else if ((from1 < from && from < to1) && (from < to1 && to1 < to)){
            x1 = from;
            x2 = to1;
        }
        else if ((from1 < from && from < to1) && (from1 < to && to < to1)){
            x1 = from;
            x2 = to;
        }
        else if ((from < from1 && from1 < to) && (from < to1 && to1 < to)){
            x1 = from1;
            x2 = to1;
        }
        else {
            return String.format("NULL");
        }

       return String.format("Диапазон пересечения: %f%f", x1, x2 );
    }
}

