import org.w3c.dom.Node;

public class DobbleLink {
  private DobbeleNod haed;
  private DobbeleNod last;





  public void add(int data) {
      DobbeleNod myDobble = new DobbeleNod(data);
      if (haed == null) {
          haed = myDobble;
          last = myDobble;
          return;
      } else {
          DobbeleNod corent = last;
          myDobble.setFirsr(corent);
          last = myDobble;
      }
  }
  public void Printer(){
      DobbeleNod g=haed;
      while (g!=null){
      System.out.println(g.getData());
      g=g.getLast();








  }
}}
