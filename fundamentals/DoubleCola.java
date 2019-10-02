package fundamentals;

public class DoubleCola {
    public static void main(String[] args) {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        System.out.println(WhoIsNext(names,1));
        System.out.println(WhoIsNext(names,2));
        System.out.println(WhoIsNext(names,3));
        System.out.println(WhoIsNext(names,4));
        System.out.println(WhoIsNext(names,5));
        System.out.println(WhoIsNext(names,6));
        System.out.println(WhoIsNext(names,7));
        System.out.println(WhoIsNext(names,8));
        System.out.println(WhoIsNext(names,9));
        System.out.println(WhoIsNext(names,10));
        System.out.println(WhoIsNext(names,11));
        System.out.println(WhoIsNext(names,12));
        System.out.println(WhoIsNext(names,13));
        System.out.println(WhoIsNext(names,14));
        System.out.println(WhoIsNext(names,15));
        System.out.println(WhoIsNext(names,16));
        System.out.println(WhoIsNext(names,17));
        System.out.println(WhoIsNext(names,18));
        System.out.println(WhoIsNext(names,19));
        System.out.println(WhoIsNext(names,20));
    }
    public static String WhoIsNext(String[] names, int n){
        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
        }
        return names[n-1];
    }
}
