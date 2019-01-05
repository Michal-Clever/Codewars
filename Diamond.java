public class Diamond {

    public static void main(String[] args) {

        System.out.println(print(3));
    }


    public static String print(int n) {
        if (n < 0 || n % 2 == 0) return null;
        String shape = "";
        int midRow = n/2 + 1;
        for (int i = midRow; i <= n*2 - midRow; i++) {
            for (int j = 1; j <= n - Math.abs(n - i); j++) {
                if (j <= Math.abs(n - i))
                    shape += " ";
                else
                    shape += "*";
            }
            shape += "\n";
        }
        return shape;
    }
}


//        ###Task:
//
//        You need to return a string that displays a diamond shape on the screen using asterisk ("*") characters.
//        Please see provided test cases for exact output format.
//
//        The shape that will be returned from print method resembles a diamond,
//        where the number provided as input represents the number of *’s printed on the middle line.
//        The line above and below will be centered and will have 2 less *’s than the middle line.
//        This reduction by 2 *’s for each line continues until a line with a single * is printed at the top and bottom of the figure.
//
//        Return null if input is even number or negative (as it is not possible to print diamond with even number or negative number).
//
//        Please see provided test case(s) for examples.