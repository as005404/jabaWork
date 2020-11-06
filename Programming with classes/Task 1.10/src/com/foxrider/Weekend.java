package com.foxrider;

public enum Weekend {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int dayOfWeek;

    Weekend(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
