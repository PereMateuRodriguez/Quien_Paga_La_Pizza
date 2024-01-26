
public class Main {
    public static void main(String[] args) {
       double cost = 28.789;

       if (cost <= 5){
           double tio = cost;

       }
       else{
           double tia = cost / 3;
           double tio = cost - tia;
           if (tia > 10){
                double tio_2 = tia - 10;
                tia = 10;
                tio = tio + tio_2;
           }

       }
        tio = Math.round(tio * 100.0)/100.0;



    }
}
