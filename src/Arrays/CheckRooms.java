package Arrays;

public class CheckRooms {
    static int[] roomNums = {2,216,15,109,156,120,93,18,21,65};
    public static String check(int n) {
        for (int i = 0; i < roomNums.length; i++) {
            if (roomNums[i] == n) {
                return "The student in room " + n + " has paid the bill.";
            }

        }
        return "The student in room " + n + " has not paid the bill yet.";
    }

    public static void main(String[] args) {
        System.out.println(check(216));
    }
}
