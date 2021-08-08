public class Client {
    public static void main(String[] args) {
    Dengen dengen;
    dengen = new AcAdapter();
    int denatsu = dengen.kyuuden();
    System.out.println( denatsu + "V で給電されています" );
    }
}

class Dengen { // Targetクラス
    public int kyuuden(); // request()メソッド
}

class JapaneseConsent {
    public int power() {
        return 1oo;
    }
}

class AcAdapter  {
    private JapaneseConsent consent = new JapaneseConsent();

    @Override
    public int kyuuden(){
     return (int)(consent.power() * 0.16);

    }
}

