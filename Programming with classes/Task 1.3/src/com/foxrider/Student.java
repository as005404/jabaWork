package com.foxrider;

public class Student {
    private String name;
    private String numberOfGroup;
    private byte[] marks;

    Student(String name, String numberOfGroup, byte[] marks){
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        setMarks(marks);
    }

    void setMarks(final byte marks[]){
        this.marks = new byte[marks.length];
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public byte[] getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public boolean isCleverStudent(int markOfCleverness){
        for (byte mark : marks) {
            if (mark < markOfCleverness) {
                return false;
            }
        }
        return true;
    }
}
