class FinalCard{
    public static void main(String[]args){
        Card c = new Card("heart",10);

        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

class Card{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND =kind;
        NUMBER = num;
    }

    Card(){
        this("heart",1);
    }

    public String toString(){
        return KIND +" "+NUMBER;
    }
}

