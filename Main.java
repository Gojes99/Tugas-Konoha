public class Main{
  public static void main(String[] args){
    Shinobi[] m = new Shinobi[3];

    m[0] = new Shinobi();
    m[0].setNo("012606");
    m[0].setNama("Uchiha Sasuke");
    m[0].setTingkat("Genin");

    m[1] = new Shinobi();
    m[1].setNo("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setTingkat("Genin");

    m[2] = new Shinobi();
    m[2].setNo("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setTingkat("Chunin");

    System.out.println("Data Shinobi");
    for(Shinobi x:m){
      System.out.println("No Registrasi : "+x.getNo());
      System.out.println("Nama          : "+x.getNama());
      System.out.println("Prodi         : "+x.getTingkat());
      System.out.println();
    }
  }
}
