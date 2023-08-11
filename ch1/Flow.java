import java.util.*;

class Flow{
    public static void main(String[] args){
        System.out.print("please enter the wether.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("this is spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("this is summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("this is atumn.");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("this is winter.");
        }
        
    }
}