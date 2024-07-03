import java.util.Scanner;

public class Lecture09_30_23Task5 {
    public static void main(String[] args) {
        Scanner triangleEdges = new Scanner(System.in);

        System.out.println("Enter the first edge of a triangle as an integer:");
        int edge1 = triangleEdges.nextInt();
        System.out.println("Input the second edge of the same triangle as an integer:");
        int edge2 = triangleEdges.nextInt();
        int edge3MaxRange = (edge1 + edge2) - 1;
        System.out.println("The maximum range of the triangle's third edge: " + edge3MaxRange);
    }
}
