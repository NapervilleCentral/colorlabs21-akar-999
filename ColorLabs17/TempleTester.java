public class TempleTester {
    public static void main(String[] args) {
        String basePath = "images/temple.JPG";
        MyPicture temple = new MyPicture(basePath);
        temple.mirrorTemple();  
        temple.explore();
        temple.write("images/fixed_temple.JPG");
    }
}
