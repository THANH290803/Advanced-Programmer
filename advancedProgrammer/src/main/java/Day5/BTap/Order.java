package Day5.BTap;

public class Order {
    static class Builder{
        private boolean traDa;

        private int banhMyThapCam20k;

        private boolean pho;

        private boolean bun;

        private boolean coca;

        private boolean cafe;

        private boolean xoi;

        private boolean kem;

        private boolean traSua;

        private boolean chao;

        public Builder() {
        }

        public Builder setTraDa(boolean traDa) {
            this.traDa = traDa;
            return this;
        }

        public Builder setBanhMyThapCam20k(int banhMyThapCam20k) {
            this.banhMyThapCam20k = banhMyThapCam20k;
            return this;
        }

        public Builder setPho(boolean pho) {
            this.pho = pho;
            return this;
        }

        public Builder setBun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public Builder setCoca(boolean coca) {
            this.coca = coca;
            return this;
        }

        public Builder setCafe(boolean cafe) {
            this.cafe = cafe;
            return this;
        }

        public Builder setXoi(boolean xoi) {
            this.xoi = xoi;
            return this;
        }

        public Builder setKem(boolean kem) {
            this.kem = kem;
            return this;
        }

        public Builder setTraSua(boolean traSua) {
            this.traSua = traSua;
            return this;
        }

        public Builder setChao(boolean chao) {
            this.chao = chao;
            return this;
        }

        public Order create(){
            return new Order(traDa, banhMyThapCam20k, pho, bun, coca, cafe, xoi, kem, traSua, chao);
        }
    }

    private boolean traDa;

    private int banhMyThapCam20k;

    private boolean pho;

    private boolean bun;

    private boolean coca;

    private boolean cafe;

    private boolean xoi;

    private boolean kem;

    private boolean traSua;

    private boolean chao;

    private Order(boolean traDa, int banhMyThapCam20k, boolean pho, boolean bun, boolean coca, boolean cafe, boolean xoi, boolean kem, boolean traSua, boolean chao) {
        this.traDa = traDa;
        this.banhMyThapCam20k = banhMyThapCam20k;
        this.pho = pho;
        this.bun = bun;
        this.coca = coca;
        this.cafe = cafe;
        this.xoi = xoi;
        this.kem = kem;
        this.traSua = traSua;
        this.chao = chao;
    }

    public boolean isTraDa() {
        return traDa;
    }

    public void setTraDa(boolean traDa) {
        this.traDa = traDa;
    }

    public int getBanhMyThapCam20k() {
        return banhMyThapCam20k;
    }

    public void setBanhMyThapCam20k(int banhMyThapCam20k) {
        this.banhMyThapCam20k = banhMyThapCam20k;
    }

    public boolean isPho() {
        return pho;
    }

    public void setPho(boolean pho) {
        this.pho = pho;
    }

    public boolean isBun() {
        return bun;
    }

    public void setBun(boolean bun) {
        this.bun = bun;
    }

    public boolean isCoca() {
        return coca;
    }

    public void setCoca(boolean coca) {
        this.coca = coca;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isXoi() {
        return xoi;
    }

    public void setXoi(boolean xoi) {
        this.xoi = xoi;
    }

    public boolean isKem() {
        return kem;
    }

    public void setKem(boolean kem) {
        this.kem = kem;
    }

    public boolean isTraSua() {
        return traSua;
    }

    public void setTraSua(boolean traSua) {
        this.traSua = traSua;
    }

    public boolean isChao() {
        return chao;
    }

    public void setChao(boolean chao) {
        this.chao = chao;
    }

    @Override
    public String toString() {
        return "Order[" +
                "traDa=" + traDa +
                ", banhMyThapCam20k=" + banhMyThapCam20k +
                ", pho=" + pho +
                ", bun=" + bun +
                ", coca=" + coca +
                ", cafe=" + cafe +
                ", xoi=" + xoi +
                ", kem=" + kem +
                ", traSua=" + traSua +
                ", chao=" + chao +
                ']';
    }
}
