package ch1;
import java.util.*;


class Gender {
    public static void main(String[] args){
        System.out.print("please enter your ID Number.(011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);
        switch(gender) {
            case '1': case '3':
                System.out.println("you are a man");
                break;
            case '2': case '4':
                System.out.println("you are a woman");
                break;
                default:
                System.out.println("it is not available ID number");
        }
    }
}
