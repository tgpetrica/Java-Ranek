public class RGB {
    public static void main(String[] args) {
        int red = 120;
        int green = 65;
        int blue = 211;

        int color = (red << 16) | (green << 8) | blue;

        System.out.println(color);

        int extractedR = (color >> 16) & 255;
        int extractedG = (color >> 8) & 255;
        int extractedB = color & 255;

        System.out.println(extractedR + ", " + extractedG + ", " + extractedB);
    }
}
