import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * read and write for movies
 */
public class ReadWriteJson {
    public static void fiveQuestions(Macbook m) {
        Scanner scanFiveQuestions = new Scanner(System.in);
        System.out.println("How much ram does the macbook have?");
        String answerQuestions = scanFiveQuestions.next();
        m.setRam(answerQuestions);
        System.out.println(m.getRam());
        System.out.println("which color is the macbook?");
        answerQuestions = scanFiveQuestions.next();
        m.setColor(answerQuestions);
        System.out.println(m.getColor());
        System.out.println("what year was the macbook made?");
        answerQuestions = scanFiveQuestions.next();
        m.setYear(Integer.parseInt(answerQuestions));
        System.out.println(m.getYear());
        System.out.println("what size screen is the macbook?");
        answerQuestions = scanFiveQuestions.next();
        m.setSize(Float.parseFloat(answerQuestions));
        System.out.println(m.getSize());
        System.out.println("which screen type is the macbook?");
        answerQuestions = scanFiveQuestions.next();
        m.setDisplay(answerQuestions);
        System.out.println(m.getDisplay());

    }

    public static void main(String[] args) throws IOException {
        Macbook daneMacbook = new Macbook("8gb", "gold", 2015, 13.3, "retina");

        Gson gson = new GsonBuilder().create();

        File f = new File("macbook.txt");

        boolean wantUpdate = false;

        if(f.exists()){
            //scan the file
            Scanner scan = new Scanner(f);
            scan.useDelimiter("\\Z");
            String contents = scan.next();
            System.out.println(contents);
            //deserialize
            Macbook daneMacbook2 = gson.fromJson(contents, Macbook.class);
            //ask user if they want to update?
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Would you like to update?");
            String answerQuestions = scan2.next();

            if(answerQuestions.equalsIgnoreCase("Yes")) {
                wantUpdate = true;
            }

        }
            if (wantUpdate == true || !f.exists()) {
                fiveQuestions(daneMacbook);
                String json = gson.toJson(daneMacbook);
                FileWriter fw = new FileWriter(f);
                // write to the file
                fw.write(json);
                fw.close();
            }

    }
}

