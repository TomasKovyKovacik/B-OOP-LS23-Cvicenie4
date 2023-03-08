package sk.stuba.fei.uim.oop;

public class Main {
    // https://stackoverflow.com/a/5762502
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Hello" + ANSI_GREEN + " world!");
        System.out.println("Don't forget to" + ANSI_RESET + " reset!");
        System.out.println(ANSI_RED_BACKGROUND + ANSI_BLUE + "Blue on red");
        System.out.println(ANSI_RESET + ANSI_BLUE + ANSI_RED_BACKGROUND + "Order doesn't matter");
        System.out.println("Don't color the new line char!" + ANSI_RESET);
        System.out.println("Reset resets both");
    }
}
