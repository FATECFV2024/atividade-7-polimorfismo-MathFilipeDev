public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e1 = new Eevee();
        Jolteon j1 = new Jolteon();
        Espeon e2 = new Espeon();
        Flareon f1 = new Flareon();
        Glaceon g1 = new Glaceon();
        Leafeon l1 = new Leafeon();
        Sylveon s1 = new Sylveon();
        Umbreon u1 = new Umbreon();
        Vaporeon v1 = new Vaporeon(); 

        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: "+e1.defesa());
        System.out.println("Especial: "+e1.especial());

        e1 = j1;
        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: "+e1.defesa());
        System.out.println("Especial: "+e1.especial());

        //System.out.println("Ataque: "+j1.ataque());
        //System.out.println("Defesa: "+j1.defesa());
        //System.out.println("Especial: "+j1.especial());
    }
}
 