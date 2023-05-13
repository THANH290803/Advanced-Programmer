package Day5.BTap;

public class Order {
    static class Builder {
        private int traDa;

        private int banhMyThapCam20k;

        private int pho;

        private int bun;

        private int coca;

        private int cafe;

        private int xoi;

        private int kem;

        private int traSua;

        private int chao;

        public Builder() {
        }

        public Builder setTraDa(int traDa) {
            this.traDa = traDa;
            return this;
        }

        public Builder setBanhMyThapCam20k(int banhMyThapCam20k) {
            this.banhMyThapCam20k = banhMyThapCam20k;
            return this;
        }

        public Builder setPho(int pho) {
            this.pho = pho;
            return this;
        }

        public Builder setBun(int bun) {
            this.bun = bun;
            return this;
        }

        public Builder setCoca(int coca) {
            this.coca = coca;
            return this;
        }

        public Builder setCafe(int cafe) {
            this.cafe = cafe;
            return this;
        }

        public Builder setXoi(int xoi) {
            this.xoi = xoi;
            return this;
        }

        public Builder setKem(int kem) {
            this.kem = kem;
            return this;
        }

        public Builder setTraSua(int traSua) {
            this.traSua = traSua;
            return this;
        }

        public Builder setChao(int chao) {
            this.chao = chao;
            return this;
        }

        public Order create() {
            return new Order(traDa, banhMyThapCam20k, pho, bun, coca, cafe, xoi, kem, traSua, chao);
        }
    }

    private int traDa;

    private int banhMyThapCam20k;

    private int pho;

    private int bun;

    private int coca;

    private int cafe;

    private int xoi;

    private int kem;

    private int traSua;

    private int chao;

    private Order(int traDa, int banhMyThapCam20k, int pho, int bun, int coca, int cafe, int xoi, int kem, int traSua, int chao) {
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

    public int isTraDa() {
        return traDa;
    }

    public void setTraDa(int traDa) {
        this.traDa = traDa;
    }

    public int getBanhMyThapCam20k() {
        return banhMyThapCam20k;
    }

    public void setBanhMyThapCam20k(int banhMyThapCam20k) {
        this.banhMyThapCam20k = banhMyThapCam20k;
    }

    public int isPho() {
        return pho;
    }

    public void setPho(int pho) {
        this.pho = pho;
    }

    public int isBun() {
        return bun;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public int isCoca() {
        return coca;
    }

    public void setCoca(int coca) {
        this.coca = coca;
    }

    public int isCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int isXoi() {
        return xoi;
    }

    public void setXoi(int xoi) {
        this.xoi = xoi;
    }

    public int isKem() {
        return kem;
    }

    public void setKem(int kem) {
        this.kem = kem;
    }

    public int isTraSua() {
        return traSua;
    }

    public void setTraSua(int traSua) {
        this.traSua = traSua;
    }

    public int isChao() {
        return chao;
    }

    public void setChao(int chao) {
        this.chao = chao;
    }

    public void printOrder() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- D05K13 Store ----\n");
        if (traDa > 0) {
            sb.append("Tra da: " + traDa + "\n");
        }
        if (banhMyThapCam20k > 0) {
            sb.append("Banh mi 20k: " + banhMyThapCam20k + "\n");
        }
        if (pho > 0) {
            sb.append("Pho: " + pho + "\n");
        }
        if (bun > 0) {
            sb.append("Bun: " + bun + "\n");
        }
        if (coca > 0) {
            sb.append("Co ca: " + coca + "\n");
        }
        if (cafe > 0) {
            sb.append("Caphe: " + cafe + "\n");
        }
        if (xoi > 0) {
            sb.append("Xoi: " + xoi + "\n");
        }
        if (kem > 0) {
            sb.append("Kem: " + kem + "\n");
        }
        if (traSua > 0) {
            sb.append("Tra sua: " + traSua + "\n");
        }
        if (chao > 0) {
            sb.append("Chao: " + chao + "\n");
        }
        System.out.println(sb.toString());
    }
}
