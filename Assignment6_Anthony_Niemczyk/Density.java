import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Density {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("worldpop.txt"));
        Scanner s2 = new Scanner(new File("worldarea.txt"));

        PrintWriter out = new PrintWriter("world_pop_density.txt");

        while (s1.hasNextLine() && s2.hasNextLine()){
            Country population = new Country(s1.nextLine());
            Country area = new Country(s2.nextLine());

            double density = 0;
            if (area.getValue() != 0){
                density = population.getValue() / area.getValue();
            }
            out.printf("%-40s%15.2f\n", population.getCountry(), density);
        }
        s1.close();
        s2.close();
        out.close();
    }
}