public class StaticBlocks {
    {//initialization blocks
        System.out.println("1");
    }

    StaticBlocks(){
        System.out.println("2");
    }

    static{
        System.out.println("3");
    }
    
    {
        System.out.println("4");
    }
    public static void main(String[] args) {
        StaticBlocks s = new StaticBlocks();
    }
}
