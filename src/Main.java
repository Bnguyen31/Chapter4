public class Main {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(3, 4, 5);
            System.out.println(t1);

            Triangle t2 = new Triangle(1, 1, 2); // This will throw the exception that was made
        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());
        }

        try {
            Triangle t3 = new Triangle(5, 12, 13);
            System.out.println(t3);
        } catch (IllegalTriangleSideException e) {
            System.out.println(e.getMessage());
        }
    }
}