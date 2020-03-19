import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ImportCampions {

    public ArrayList<Hero> hero = new ArrayList<>();

    public ArrayList<Hero> importChampions(String filename)throws FileNotFoundException {
        //Champion;BE;RP;HP;HP+;HP5;HP5+;Resource;MP;MP+;MP5;MP5+;MS;AD;AD+;AS;AS+;Range;Armor;Armor+;MR;MR+;Release date;Attributes

        Hero tmpHero = null;
        File fh = new File(filename);

        if(fh.exists()){
            Scanner file = new Scanner(fh);
            while(file.hasNextLine()){
                String line = file.nextLine();
                String[] lineArr = line.split(";");

                try{
                    tmpHero = new Hero(lineArr[0], Integer.parseInt(lineArr[1]), Integer.parseInt(lineArr[2]), Double.parseDouble(lineArr[3]), Integer.parseInt(lineArr[4]), Integer.parseInt(lineArr[5]),
                            Double.parseDouble(lineArr[6]), lineArr[7], Double.parseDouble(lineArr[8]), Double.parseDouble(lineArr[9]), Double.parseDouble(lineArr[10]), Double.parseDouble(lineArr[11]),Integer.parseInt(lineArr[12]),
                            Double.parseDouble(lineArr[13]), Double.parseDouble(lineArr[14]), Double.parseDouble(lineArr[15]), Double.parseDouble(lineArr[16]), lineArr[17],
                            Double.parseDouble(lineArr[18]), Double.parseDouble(lineArr[19]), Double.parseDouble(lineArr[20]), Double.parseDouble(lineArr[21]), Date.parse(lineArr[22]), lineArr[23]);

                            hero.add(tmpHero);

                }catch(Exception e){
                    System.out.println("Error: " + e.toString());
                }
            }
        }


        return hero;
    }

    @Override
    public String toString() {
        return "ImportCampions{" +
                "hero=" + hero +
                '}';
    }
}
