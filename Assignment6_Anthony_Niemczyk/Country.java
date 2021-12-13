public class Country{
    private String country;
    private double value;

    public Country(String line){
        int i = 0;
        while (!Character.isDigit(line.charAt(i))) {
            i++;
        }
        int j = i - 1;
        while (Character.isWhitespace(line.charAt(j))) {
            j--;
        }
        country = line.substring(0, j + 1);
        value = Double.parseDouble(line.substring(i).trim());
    }
    public String getCountry(){
        return country;
    }
    public double getValue(){
        return value;
    }
}