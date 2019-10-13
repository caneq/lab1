package bsu.rfe.java.group6.lab1.Korobkin.varC1;


public class Apple extends Food {

    private String size;

    public Apple(String size) {
        super("������");
        this.size = size;
    }

    public int calculateCalories() {
        if (size.equals("���������")) {
            return 40;
        } else if (size.equals("�������")) {
            return 50;
        } else if (size.equals("�������")) {
            return 60;
        }
        else {
        	return 0;
        }
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (!(o instanceof Apple)) return false;
            if (size == null || ((Apple) o).size == null) return false;
            return size.equals(((Apple) o).size);
        }
        return false;
    }

    public String toString() {
        return super.toString() + " ������� '" + size.toUpperCase() + "'"+ ", ������������ : " + calculateCalories() + " ���";
    }
}
