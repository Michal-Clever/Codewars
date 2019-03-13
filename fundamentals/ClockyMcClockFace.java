package fundamentals;


public class ClockyMcClockFace {
    public static void main(String[] args) {
        int angle = 271;
        System.out.println(whatTimeIsIt(angle));
    }

    public static String whatTimeIsIt(final double angle) {
        String time = null;
        int h = (int) Math.floor(angle / 30);
        int m = (int) Math.floor(angle % 30 * 2);
        if (angle == 0 || angle == 360)
            time = "12:00";
        else if (h < 1) {
            if (m < 10) time = "12:0" + m;
            else time = "12:" + m;
        } else if (h < 10 && m < 10)
            time = "0" + h + ":0" + m;
        else if (h < 10 && m >= 10)
            time = "0" + h + ":" + m;
        else if (h >= 10 && m < 10)
            time = h + ":0" + m;
        else if (h >= 10 && m >= 10)
            time = h + ":" + m;
        return time;
    }
}
//
//Story
//        Due to lack of maintenance the minute-hand has fallen off Town Hall clock face.
//
//        And because the local council has lost most of our tax money to a Nigerian email scam there are no funds to fix the clock properly.
//
//        Instead, they are asking for volunteer programmers to write some code that tell the time by only looking at the remaining hour-hand!
//
//        What a bunch of cheapskates!
//
//        Can you do it?
//
//        Kata
//        Given the angle (in degrees) of the hour-hand, return the time in HH:MM format. Round down to the nearest minute.
//
//        Examples
//        12:00 = 0 degrees
//        03:00 = 90 degrees
//        06:00 = 180 degrees
//        09:00 = 270 degrees
//        12:00 = 360 degrees
//        Notes
//        0 <= angle <= 360