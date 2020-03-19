import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {

        ImportCampions importFile = new ImportCampions();
        String filePth = "Data/Mappe1.csv";

        ArrayList<Hero> hero = new ArrayList<>();

        hero=importFile.importChampions(filePth);


    }
}
