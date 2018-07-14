package com.patrag.data.types;

public class Score {
    private int english;
    private int math;
    private long total;

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTotal(long total) {
        this.total = total;
    }


    public int english() {
        return english;
    }

    public int math() {
        return math;
    }

    public long total() {
        return total;
    }
}
