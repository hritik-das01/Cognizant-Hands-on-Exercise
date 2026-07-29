package HandsOn_Exercises.Design_Pattern;

class Ex_6_ProxyImage implements Image {

    private String fileName;
    private Ex_6_RealImage realImage;

    public Ex_6_ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        // Lazy Initialization
        if (realImage == null) {
            realImage = new Ex_6_RealImage(fileName);
        }

        // Cached object is reused
        realImage.display();
    }
}