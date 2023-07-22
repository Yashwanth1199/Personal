import java.util.Scanner;
class SimpleStartup{
    private int locationCells[];
    private int numOfHits=0;
    public void setLocationCells(int[]n){
        locationCells = n;
    }
    public String checkYourself(int guess){
        String result="miss";
        for(int cell:locationCells){
            if(cell==guess){
                result="hit";
                numOfHits++;
                break;
            }
        }
        System.out.println(result);
        return result;
    }
}
class SimpleStartupGame1{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        SimpleStartup one= new SimpleStartup();
        int[]locations={3,4,5};
        one.setLocationCells(locations);
        int hits=0;
        while(hits!=3){
            System.out.print("Enter your guess: ");
            int yourguess=s.nextInt();
            String Result=one.checkYourself(yourguess);
            if(Result.equals("hit")){
                hits++;
            }
        }
        System.out.print("KILL!");
    }
}