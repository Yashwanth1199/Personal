import java.util.Scanner;
import java.util.ArrayList;
class SimpleStartup{
    private ArrayList<String> locationCells= new ArrayList<String>();
    private int numOfGuesses;
    public void setLocationCells(ArrayList<String>n){
        locationCells = n;
    }
    public String checkYourself(String guess){
        numOfGuesses++;
        String result="miss";
        int index=locationCells.indexOf(guess);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result="kill!";
            }
            else{
                result="hit";
            }
        }
        System.out.print(result);
        return result;
    }
    public int getNumOfGuesses(){
        return numOfGuesses;
    }
}
class SimpleStartupGame2{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        SimpleStartup one= new SimpleStartup();
        ArrayList<String> locations= new ArrayList<String>();
        locations.add("A3");
        locations.add("A4");
        locations.add("A5");
        one.setLocationCells(locations);
        System.out.println("Rules \n-In a row of 10 cells labelled from A1 to A10 guess the 3 cells and make a kill to get your rating based on the number of guesses.\n Good Luck :)\n");
        while(!locations.isEmpty()){
            System.out.print("\nEnter your guess: ");
            String yourguess=s.next();
            String Result=one.checkYourself(yourguess);
        }
        int g= one.getNumOfGuesses();
        if(g<=3){
            System.out.println("\nTerrific!");
            System.out.print("Rating-100%");
        }
        else if(g<=5){
            System.out.println("\nWell Played!");
            System.out.print("Rating-75%");
        }
        else if(g<=7){
            System.out.println("\nGood");
            System.out.print("Rating-50%");
        }
        else{
            System.out.println("\nYou nearly tried all the cells better luck next time");
        }
        
    }
}