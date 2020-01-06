package by.tms.calcApp.util;

public class Help {
    private static String[] text = {
           "*****************************************************",
            "Application commands:",
            "",
            "[h] - help (this information)",
            "[e] - exit",
            "[li] - log in",
            "[lo] - log out",
            "[reg] - registration",
            "[ed] - edit profile",
            "[his] - history of entered numbers and obtained results, if exists (ONLY FOR REGISTERED USERS!)",
            "*****************************************************",
            "Calculator can perform next operations:",
            "",
            "[sum] - addition",
            "[sub] - subtraction",
            "[mul] - multiplication",
            "[div] - division",
            "[u] - use previous result as input, if exists (ONLY FOR REGISTERED USERS!)",
            "*****************************************************",
            "",
            "To start calculating, press any other key! Notice that only registered user can use history of calculations.",
            ""
    };

    private Help() {}

    public static String[] show() {
        return text;
    }
}
