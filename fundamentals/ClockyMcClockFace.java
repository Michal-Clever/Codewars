package fundamentals;


public class ClockyMcClockFace {
    public static void main(String[] args) {
        int angle = 271;
        System.out.println(whatTimeIsIt(angle));
    }
    public static String whatTimeIsIt(final double angle) {
        int m = (int) (angle % 30 * 2),
                h = (int) (angle / 30);
        if (h == 0) h = 12;
        return String.format("%02d:%02d", h, m);
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