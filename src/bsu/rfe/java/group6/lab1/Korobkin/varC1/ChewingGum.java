package bsu.rfe.java.group6.lab1.Korobkin.varC1;

public class ChewingGum extends Food {
    String flavour;
    public ChewingGum(String flavour){
        super("����������� �������");
        this.flavour = flavour;
    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    public int calculateCalories() {
        if (flavour.equals("����")) return 10;
        if (flavour.equals("�����")) return 11;
        if (flavour.equals("�����")) return 12;
        return 0;
    }
    public boolean equals(Object arg0) {
        if(!super.equals(arg0)) return false;
        if(!(arg0 instanceof ChewingGum)) return false;
        return this.flavour.equals(((ChewingGum)arg0).flavour);
    }
    public String toString() {
        return super.toString() + " � ��������� \"" + flavour + "\"" + ", ������������ : "
                + calculateCalories() + "���" ;

    }
}
