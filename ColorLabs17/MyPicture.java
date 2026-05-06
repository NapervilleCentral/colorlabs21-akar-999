import java.awt.Color;

public class MyPicture extends SimplePicture
{
    public MyPicture() { super(); }
    public MyPicture(String fileName) { super(fileName); }
    public MyPicture(int width, int height) { super(width, height); }
    public MyPicture(MyPicture copy) { super(copy); }
    public MyPicture(java.awt.image.BufferedImage image) { super(image); }

    // copy picture region
    public void copy(MyPicture source, int targetX, int targetY)
    {
        for (int x = 0; x < source.getWidth(); x++) {
            for (int y = 0; y < source.getHeight(); y++) {
                int tx = targetX + x;
                int ty = targetY + y;
                if (tx >= 0 && tx < this.getWidth() && ty >= 0 && ty < this.getHeight()) {
                    Pixel src = source.getPixel(x, y);
                    Pixel dst = this.getPixel(tx, ty);
                    dst.setColor(src.getColor());
                }
            }
        }
    }

    // mirror temple roof
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;

        for (int y = 27; y < 97; y++) {
            for (int x = 13; x < mirrorPoint; x++) {
                leftPixel = this.getPixel(x, y);
                rightPixel = this.getPixel(mirrorPoint + (mirrorPoint - x), y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    // mirror vertically
    public void mirrorVertical()
    {
        int w = this.getWidth();
        int h = this.getHeight();
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w / 2; x++) {
                Pixel left = this.getPixel(x, y);
                Pixel right = this.getPixel(w - 1 - x, y);
                right.setColor(left.getColor());
            }
        }
    }

    // convert to grayscale
    public void grayscale()
    {
        Pixel[] pixels = this.getPixels();
        for (Pixel p : pixels) {
            int avg = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            p.setColor(new Color(avg, avg, avg));
        }
    }

    // recursively create a fractal inset effect (image goes infinitely into bottom‑right)
    public void recursiveInset()
    {
        int w = this.getWidth();
        int h = this.getHeight();

        // base case – stop when the picture is too small to divide
        if (w <= 1 || h <= 1)
            return;

        // make a half‑size copy by sampling every second pixel
        int newW = w / 2;
        int newH = h / 2;
        if (newW < 1) newW = 1;
        if (newH < 1) newH = 1;

        MyPicture small = new MyPicture(newW, newH);
        for (int y = 0; y < newH; y++) {
            for (int x = 0; x < newW; x++) {
                Pixel src = this.getPixel(x * 2, y * 2);
                Pixel dst = small.getPixel(x, y);
                dst.setColor(src.getColor());
            }
        }

        // apply the same effect recursively to the smaller copy
        small.recursiveInset();

        // paste the processed small picture into the bottom‑right corner of this one
        int startX = w - newW;
        int startY = h - newH;
        for (int y = 0; y < newH; y++) {
            for (int x = 0; x < newW; x++) {
                Pixel src = small.getPixel(x, y);
                Pixel dst = this.getPixel(startX + x, startY + y);
                dst.setColor(src.getColor());
            }
        }
    }

    // detect edges
    public void edgeDetection(double threshold)
    {
        int w = this.getWidth();
        int h = this.getHeight();
        Color[][] copy = new Color[w][h];

        for (int y = 0; y < h; y++)
            for (int x = 0; x < w; x++)
                copy[x][y] = this.getPixel(x, y).getColor();

        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w - 1; x++) {
                Color c1 = copy[x][y];
                Color c2 = copy[x + 1][y];
                Color c3 = copy[x][y + 1];

                double avg1 = (c1.getRed() + c1.getGreen() + c1.getBlue()) / 3.0;
                double avg2 = (c2.getRed() + c2.getGreen() + c2.getBlue()) / 3.0;
                double avg3 = (c3.getRed() + c3.getGreen() + c3.getBlue()) / 3.0;

                if (Math.abs(avg1 - avg2) > threshold || Math.abs(avg1 - avg3) > threshold)
                    this.getPixel(x, y).setColor(Color.BLACK);
                else
                    this.getPixel(x, y).setColor(Color.WHITE);
            }
        }
    }

    // invert colors
    public void negate() {
        Pixel[] pixels = this.getPixels();
        for (Pixel p : pixels) {
            int r = 255 - p.getRed();
            int g = 255 - p.getGreen();
            int b = 255 - p.getBlue();
            p.setColor(new Color(r, g, b));
        }
    }

   
}
