import java.io.IOException;
public class main {
    public static void main(String[] args) throws IOException{
        int choice;
        do{
            System.out.println("Option one: Green");
            System.out.println("Option two: Blue");
            System.out.println("Option three: Red");
            System.out.println("Option four: Yellow");
            System.out.print("Choose which number you want: ");
            choice = System.in.read();
            System.out.println(choice);
        }while(choice < 1 || choice > 4);
    }
}