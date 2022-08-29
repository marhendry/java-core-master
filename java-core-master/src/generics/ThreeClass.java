package generics;

public class ThreeClass<A, B, C>{
    private A first;
    private B second;
    private C third;

    public ThreeClass(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

        public void showTypesOfThree() {
        System.out.println("Type of 1 is: " +String.valueOf(first)+" "+ first.getClass().getName());
        System.out.println("Type of 2 is: " +String.valueOf(second)+" "+ second.getClass().getName());
        System.out.println("Type of 3 is: " +String.valueOf(third)+" "+ third.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeClass<Integer, Double, String> thCl = new ThreeClass<>
                (1, 3.0,"Three");
        thCl.showTypesOfThree();
    }
}
