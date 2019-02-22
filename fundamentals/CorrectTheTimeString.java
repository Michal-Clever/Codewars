package fundamentals;

public class CorrectTheTimeString {

    public static String timeCorrect(String timestring) {
        String pattern = ("\\d\\d:\\d\\d:\\d\\d");


        if (timestring == null) {
            return null;
        } else if (timestring.equals("")) {
            return "";
        } else if (!(timestring.matches(pattern))) {
            return null;
        } else {
            int hours, minutes, seconds;

            seconds = Integer.valueOf(timestring.substring(6, 8));
            minutes = Integer.valueOf(timestring.substring(3, 5));
            hours = Integer.valueOf(timestring.substring(0, 2));

            if (seconds >= 60) {
                minutes += (seconds / 60);
                seconds -= 60;
            }

            if (minutes >= 60) {
                hours += (minutes / 60);
                minutes -= 60;
            }

            if (hours > 23) {
                hours -= ((hours / 24) * 24);
            }
            return (String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
        }

    }

}

//        A new task for you!
//
//        You have to create a method, that corrects a given time string.
//        There was a problem in addition, so many of the time strings are broken.
//        Time-Format is european. So from "00:00:00" to "23:59:59".
//
//        Some examples:
//
//        "09:10:01" -> "09:10:01"
//        "11:70:10" -> "12:10:10"
//        "19:99:99" -> "20:40:39"
//        "24:01:01" -> "00:01:01"
//
//        If the input-string is null or empty return exactly this value! (empty string for C++)
//        If the time-string-format is invalid, return null. (empty string for C++)
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have created other katas. Have a look if you like coding and challenges.