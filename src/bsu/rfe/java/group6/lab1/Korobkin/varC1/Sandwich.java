package bsu.rfe.java.group6.lab1.Korobkin.varC1;

public class Sandwich extends Food{

    private String filling1;
    private String filling2;

    public Sandwich(String filling1,String filling2) {
        super("Бутерброд");
        this.filling1 = filling1;
        this.filling2 = filling2;
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        if(filling1.equals("сыр")) {
            calories += 55;
        }
        if(filling1.equals("масло")) {
            calories += 40;
        }
        if(filling2.equals("ветчина")) {
            calories += 60;
        }
        if(filling2.equals("свинина")) {
            calories += 70;
        }

        return calories;
    }

    public String getFilling1() {
        return filling1;
    }

    public void setFilling1(String filling1) {
        this.filling1 = filling1;
    }

    public String getFilling2() {
        return filling2;
    }

    public void setFilling2(String filling2) {
        this.filling2 = filling2;
    }

    public boolean equals(Object o1) {
        if(super.equals(o1)) {
            if(!(o1 instanceof Sandwich)) return false;
            if(filling1 == null || filling2 == null) return false;
            if(!(filling1.equals( ((Sandwich)o1).filling1))) return false;
            return filling2.equals( ((Sandwich)o1).filling2);
        }
        return false;
    }

    public String toString() {
        return super.toString() + " c " + "'" + filling1.toUpperCase() + "'" + " и " + "'" + filling2.toUpperCase() + "' " 
        		+ ", калорийность : " + calculateCalories() + " кал" ;
    }
}
