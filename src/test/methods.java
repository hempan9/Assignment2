package test;

public class methods {
    public static void main(String[] args) {
        methods m = new methods();
      int a=  m.sumx(20,30);
       m.dispRes(a);
    }
    public  int sumx(int x, int y){
        int sum = 0;
        sum = x+y;
        return sum;
    }
    public void dispRes(int a){
        System.out.println("Sum = "+a);
    }
}
