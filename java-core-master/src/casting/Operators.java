package casting;

public class Operators {
    public static void main(String[] args) {
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? (20+30) : 30;
        System.out.println( "Значение b: " + b );
        System.out.println("-------------------------");
        String name = "Олег";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );
    }
}
