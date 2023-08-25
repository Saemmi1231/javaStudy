public class Myparent{
    private   int prv; //같은 클래스
              int dft; //같은 패키지
    protected int prt; //같은 패키지 + 자손(다른 패키지)
    public    int pub; //제한 없음

    public void printMember(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);

    }
}

class MyparentTest {
    public static void main(String[]args){
        Myparent m = new Myparent();
       // System.out.println(m.prv);
        System.out.println(m.dft);
        System.out.println(m.prt);
        System.out.println(m.pub);

    }
}
