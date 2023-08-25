class Array{
    public static void main(String[] args){
<<<<<<< HEAD
      int sum = 0;
      float average = 0f;
      
      int[] score = {100,88, 100,100,90};

      for(int i=0; i<score.length; i++){
        sum+= score[i];
      }
      average = sum / (float)score.length;

      System.out.println("total score : " +sum);
      System.out.println("average score :" +average);
=======
        char[] abc = {'a','b','c','d'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length + num.length];
        System.out.println(result.length);
        System.arraycopy(abc,0,result,0,abc.length);
        System.out.println(result);
        System.arraycopy(num,0,result,abc.length, num.length);
        System.out.println(result);
>>>>>>> 3b03c53c5a5de8d5bdf898f2086267c59cabf6de
    }
}