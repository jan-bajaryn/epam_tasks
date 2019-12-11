package by.epam.learn.inclass.domain;

import by.epam.learn.inclass.controller.LeaptYearAdapter;

import java.util.ArrayList;
import java.util.List;

public class Date {

    public static List<Month> months;
    LeaptYearAdapter leaptYearAdapter;

    static {
        months = new ArrayList<>();
        months.add(new Month(1, 31));
        months.add(new Month(2, 28));
        months.add(new Month(3, 31));
        months.add(new Month(4, 30));
        months.add(new Month(5, 31));
        months.add(new Month(6, 30));
        months.add(new Month(7, 31));
        months.add(new Month(8, 31));
        months.add(new Month(9, 30));
        months.add(new Month(10, 31));
        months.add(new Month(11, 30));
        months.add(new Month(12, 31));
    }


    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        leaptYearAdapter = new LeaptYearAdapter();
    }

    public Date() {
        leaptYearAdapter = new LeaptYearAdapter();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
//
//    private boolean isLeap(Date date) {
//        if (date.year % 400 == 0)
//            return false;
//        if (date.year % 4 == 0)
//            return true;
//        return false;
//    }

    public Date nextDay(Date date) {
        date.day++;
        if (date.day > months.get(date.month - 1).getDayCount()) {
            if (leaptYearAdapter.isLeap(date.year) && date.month == 2) {
                if (date.day > 29) {
                    date.day = 1;
                    date = nextMonth(date);
                }
            } else {
                date.day = 1;
                date = nextMonth(date);
            }
        }
        return date;
    }

    public Date nextMonth(Date date) {
        date.month++;
        if (date.month > months.size()) {
            date = nextYear(date);
            date.month = 1;
        }
        return date;
    }

    public Date nextYear(Date date) {
        date.year++;
        return date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
