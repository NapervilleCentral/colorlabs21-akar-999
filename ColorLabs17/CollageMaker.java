public class CollageMaker
{
    public static void main(String[] args)
    {
        String basePath = "images/final_collage.JPG";
        MyPicture source = new MyPicture(basePath);

        int tileW = source.getWidth();
        int tileH = source.getHeight();

        MyPicture canvas = new MyPicture(tileW * 3, tileH * 2);

        // original image
        canvas.copy(source, 0, 0);

        // vertical mirror
        MyPicture mirrored = new MyPicture(basePath);
        mirrored.mirrorVertical();
        canvas.copy(mirrored, tileW, 0);

        // edge detection 
        MyPicture edge = new MyPicture(basePath);
        edge.edgeDetection(6.7);
        canvas.copy(edge, 2 * tileW, 0);

        // fractal inset effect
        MyPicture fractal = new MyPicture(basePath);
        fractal.recursiveInset();
        canvas.copy(fractal, 0, tileH);

        // negative effect (inverse)
        MyPicture neg = new MyPicture(basePath);
        neg.negate();
        canvas.copy(neg, tileW, tileH);

        // grayscale effect 
        MyPicture gray = new MyPicture(basePath);
        gray.grayscale();
        canvas.copy(gray, 2 * tileW, tileH);
        
        canvas.write("images/final_collage.jpg");
        canvas.explore();
    }
}