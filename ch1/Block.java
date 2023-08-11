class Block {
    static {
        System.out.println("static{}");
    }
    {
        System.out.println("{}");
    }
    public Block(){
        System.out.println("constructor");
    }

    public static void main(String args[]){
        System.out.println("Block bt= new Block();");
        Block bt = new Block();

        System.out.println("Block bt2 = new Block();");
        Block bt2 = new Block();
    }
}
