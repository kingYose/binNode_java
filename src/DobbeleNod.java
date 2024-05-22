public class DobbeleNod {
    private DobbeleNod firsr;
   private int Data;
   private DobbeleNod last;
    public DobbeleNod(int a){

        this.Data=a;
    }

    public DobbeleNod getLast() {
        return last;
    }

    public DobbeleNod getFirsr() {
        return firsr;
    }

    public void setFirsr(DobbeleNod firsr) {
        this.firsr = firsr;
    }

    public int getData() {
        return Data;
    }
}
