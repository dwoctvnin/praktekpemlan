package pemlan;

public class lingkaran {
    int Jarijari;
    double luas(){
        return Jarijari*Jarijari* Math.PI;
    }
    void setJarijari(int newJarijari){
        Jarijari=newJarijari;
    }

    public static void main (String[] args){
        lingkaran lingkaran1= new lingkaran();
        lingkaran1.setJarijari(1);
        System.out.println("Luas lingkaran dengan jari-jari "+ lingkaran1.Jarijari + " yaitu " + lingkaran1.luas());

        lingkaran lingkaran2=new lingkaran();
        lingkaran2.setJarijari(7);
        System.out.println("Luas lingkaran dengan jari-jari "+ lingkaran2.Jarijari + " yaitu " + lingkaran2.luas());

        lingkaran lingkaran3=new lingkaran();
        lingkaran3.setJarijari(100);
        System.out.println("Luas lingkaran dengan jari-jari "+ lingkaran3.Jarijari + " yaitu " + lingkaran3.luas());
        System.out.println("saya");
    }
       
    
}
