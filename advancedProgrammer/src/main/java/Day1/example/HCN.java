package Day1.example;

public class HCN {
    private float chieuDai = 1.0f;

    private float chieuRong = 1.0f;

    public HCN(){}

    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float chuVi(){
        return (chieuDai + chieuRong) * 2;
    }

    public float dienTich(){
        return chieuDai * chieuRong;
    }

}
