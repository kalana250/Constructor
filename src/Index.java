public class Index {

    int x;
    int y;

    Index(){
         x=5 ;
         y=10 ;
    }

    public static void main(String[] args) {

        Index i= new Index();
        System.out.println("The Value is: " + ((i.x)+(i.y)));
    }
}
