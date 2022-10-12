public class Dimensions {
    private final int height;
    private final int width;
    private final int length;

    static int dimensions;


    public Dimensions(int height,
                      int width,
                      int length
                      ) {
        this.height = height;
        this.width = width;
        this.length = length;


    }

    public int getDimensions(){
        return dimensions = length * width * height;
    }



    public Dimensions setLength (int length){

        return new Dimensions(height,
                width,
                length);
    }
    public  Dimensions setWidth(int width){
        return new Dimensions(height,
                width,
                length);
    }
    public  Dimensions setHeight(int height){
        return new Dimensions(height,
                width,
                length);
    }

    public int getWidth (){
        return width;
    }
    public int getLength (){
        return length;

    }
    public int getHeight(){
        return height;
    }

    public void printDimensions(){
        System.out.println(dimensions);
        System.out.println(width);
    }










}










