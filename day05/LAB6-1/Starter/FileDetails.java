import java.io.*;

public class FileDetails {
    public static void main(String[] args) {
        //
        // To-do: Add code here
        //
        if (args.length != 1) {
            System.out.println("Usage : java FileDetails <FileName>");
            return;
        }

        String fileName = args[0];

        // read the file that passed from parameter of main method
        File file = new File(fileName);
        try (FileInputStream stream = new FileInputStream(file)) {
            char[] contents = new char[(int)file.length()];

            for (int i = 0; i < contents.length; i++) {
                contents[i] = (char)stream.read();
            }

            for(char content : contents) {
                System.out.print(content);
            }
            System.out.println();

            summarize(contents);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void summarize(char[] contents) {
        
        int vowel = 0;
        int consonats = 0;
        int line = 0;
        
        for (char c : contents) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowel++;
                }        
                else {
                    consonats++;
                }                
            }
            else if(c == '\n') {
                line++;
            }
        }

        System.out.println("All length : "+ contents.length + "\nvowel : " + vowel + "\nconsonats : " + consonats + "\nline : " + line);
    }
}