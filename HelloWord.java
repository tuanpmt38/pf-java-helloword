public class HelloWord {
    public static void main(String[] args) {
        String name;
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Hello:" +name);
    }
}
