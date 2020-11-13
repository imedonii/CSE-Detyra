public class Profesori extends Mesimdhenesi{
      String thirrjaAkademike;

      public Profesori(String emri,int vitiLindjes,String thirrjaAkademike){
          super(emri,vitiLindjes,"Ligjerata");
          this.thirrjaAkademike=thirrjaAkademike;
      }

      //get
      public String getThirrjaAkademike(){
         return thirrjaAkademike;
      }

      //set
      public void setThirjaAkademike(String thirrjaAkademike){
            this.thirrjaAkademike = thirrjaAkademike;
      }

      // toString method
      @Override
      public String toString(){
            return "Profesori "+super.toString()+", ka thirrje "+thirrjaAkademike;
       }
}
