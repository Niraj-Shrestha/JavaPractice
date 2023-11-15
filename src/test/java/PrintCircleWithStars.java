public class PrintCircleWithStars {
    public static void main(String[] args) {
        int radius = 10;
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print(". ");
                } else {
                    System.out.print("  "); // Two spaces for better spacing
                }
            }
            System.out.println();
        }
    }
}
