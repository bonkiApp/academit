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

       return String.format("Интервал пересечения: (%f, %f)", x1, x2 );
    }

    double y1;
    double y2;
    public String joinRanges(double from, double to, double from1, double to1) {
        y1 = (from < from1) ? from: from1;
        y2 = (to > to1) ? to: to1;
        return String.format("Интервал объединения: (%f, %f)", y1, y2);
    }

    double z1;
    double z2;
    public String subtractRanges (double from, double to, double from1, double to1){
        if (x1 != 0){
            z1 = from - to1;
            z2 = from1 - to;
            return String.format("Интервал разности: (%f, %f)", z1, z2);
        } else {
            return String.format("Нет пересечения: (%f, %f)", from, to);
        }

    }


}

