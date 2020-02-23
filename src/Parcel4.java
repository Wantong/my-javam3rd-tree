package com.company;

interface Destination{
    int a = 0;
}
// define class in func
public class Parcel4 {
    public Destination des(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String ReadLabel() {return label;}
        }
        return new PDestination(s);
    }
    protected class PDestination implements Destination{
        private String label;

        public PDestination(String s) {
        }

        public String readLabel(){return label;}
    }
    public Destination dest(String s) {return new PDestination(s);}
    public static void main(String[] args){
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
}
