import java.util.HashMap;

public class Welcome {

    // The Task
    // Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
    // Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database.
    // It should default to English if the language is not in the database, or in the event of an invalid input.

    public static String greet(String language) {
        HashMap<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        greeting.put("estonian", "Tere tulemast");
        greeting.put("finnish", "Tervetuloa");
        greeting.put("flemish", "Welgekomen");
        greeting.put("french", "Bienvenue");
        greeting.put("german", "Willkommen");
        greeting.put("irish", "Failte");
        greeting.put("italian", "Benvenuto");
        greeting.put("latvian", "Gaidits");
        greeting.put("lithuanian", "Laukiamas");
        greeting.put("polish", "Witamy");
        greeting.put("spanish", "Bienvenido");
        greeting.put("swedish", "Valkommen");
        greeting.put("welsh", "Croeso");
        
        if (greeting.containsKey(language)) {
            return greeting.get(language);
        }
        return greeting.get("english");
    }
}
