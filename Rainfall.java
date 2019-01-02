public class Rainfall {
    
    public static double mean(String town, String strng) {
        if (!strng.contains(town + ":")) return -1;
        double[] v = Rainfall.doubAr(town, strng);
        double sum = 0;
        for (int i = 0; i < v.length; i++) sum += v[i];
        return sum / v.length;
    }

    public static double variance(String town, String strng) {
        if (!strng.contains(town + ":")) return -1;
        double[] v = Rainfall.doubAr(town, strng);
        double mean = mean(town, strng);
        double temp = 0;
        for (double a : v) temp += (mean - a) * (mean - a);
        return temp / v.length;
    }

    public static double[] doubAr(String town, String strng) {
        String[] s = strng.split("\n");
        for (int i = 0; i < s.length; i++)
            if (s[i].split(":")[0].equals(town)) {
                String[] nm = s[i].split(":")[1].split(",");
                double[] v = new double[nm.length];
                for (int i2 = 0; i2 < nm.length; i2++)
                    v[i2] = Double.parseDouble(nm[i2].split(" ")[1]);
                return v;
            }
        return null;
    }
}

//         dataand data1 are two strings with rainfall records of a few cities for months from January to December.
//        The records of towns are separated by \n. The name of each town is followed by :.
//
//        data and towns can be seen in "Your Test Cases:".
//
//        Task:
//        function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1
//        (In R and Julia this function is called avg).
//        function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
//        Examples:
//        mean("London", data), 51.19(9999999999996)
//        variance("London", data), 57.42(833333333374)
//        Notes:
//        if functions mean or variance have as parameter town a city which has no records return -1 or -1.0 (depending on the language)
//        Don't truncate or round: the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) /
//        test_result) <= 1e-6 depending on the language.
//        Shell tests only variance
//        A ref: http://www.mathsisfun.com/data/standard-deviation.html
//        data and data1 (can be named d0 and d1 depending on the language; see "Sample Tests:") are adapted from: http://www.worldclimate.com
