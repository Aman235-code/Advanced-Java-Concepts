package in.kgcoding.abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTyres;

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("Going to a place");
    }

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going");
    }
}
