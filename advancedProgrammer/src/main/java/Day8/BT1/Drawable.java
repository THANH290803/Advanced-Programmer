package Day8.BT1;

public class Drawable {
    public <T extends IHinhHoc> void draw(T t){
        System.out.println("Ve hinh: " + t.toString());
    }
}
