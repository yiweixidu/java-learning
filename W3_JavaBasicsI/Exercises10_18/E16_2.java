package W3_JavaBasicsI.Exercises10_18;

public class E16_2 {
    public static void main(String[] args) {
        // Creat an array to store lines of an ASCII art representation
        String[] arra = new String[5];

        // Populate theh array with lines to form a ASCII art representation
        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| @ @ |]";
        arra[2] = " |  ^  |";
        arra[3] = " | '-' |";
        arra[4] = " +-----+";

        // Use a loop to print each line of the ASCII are representation
        for (int i =0; i <5; i++) {
            System.out.println(arra[i]);
        }
    }
}
