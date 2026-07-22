package HandsOn_Exercises.Design_Pattern;

class Ex_6_RealImage implements Image {

    private String fileName;

    public Ex_6_RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}