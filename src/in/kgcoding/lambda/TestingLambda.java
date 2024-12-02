package in.kgcoding.lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda testingLambda = new TestingLambda();
        int sum = testingLambda.sum(6,7);
        testingLambda.printString("This is the course");

//        toPrint -> System.out.println(toPrint);
        // (a,b) -> a + b
        // (a,b) -> { int sum = a+b; System.out.println(sum); }
    }

    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
