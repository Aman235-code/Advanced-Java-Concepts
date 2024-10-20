package in.kgcoding.polymorphism;

public class Overloading {

    Overloading(){
        System.out.println("Default cons");
    }

    Overloading(String pop){
        System.out.println(pop);
    }



    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b,int c,int d){
        return a + b + c + d;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        int res = overloading.add(5,7);
        int total = overloading.add(5,9,res,1);
        System.out.println(overloading.add("Ahaa"," Granny"));
        System.out.println(total);
    }
}
