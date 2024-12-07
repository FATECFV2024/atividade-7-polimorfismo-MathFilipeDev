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

        System.out.println("Eu sou: Eevee ");
        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: "+e1.defesa());
        System.out.println("Especial: "+e1.especial());

        e1 = j1;
        System.out.println("Eu sou: Jolteon ");
        System.out.println("Ataque: "+e1.ataque());
        System.out.println("Defesa: "+e1.defesa());
        System.out.println("Especial: "+e1.especial());

        e1 = e2;
        System.out.println("Eu sou: Espeon ");
        System.out.println("Ataque: "+e2.ataque());
        System.out.println("Defesa: "+e2.defesa());
        System.out.println("Especial: "+e2.especial());

        e1 = f1;
        System.out.println("Eu sou: Flareon ");
        System.out.println("Ataque: "+f1.ataque());
        System.out.println("Defesa: "+f1.defesa());
        System.out.println("Especial: "+f1.especial());

        e1 = g1;
        System.out.println("Eu sou: Glaceon ");
        System.out.println("Ataque: "+g1.ataque());
        System.out.println("Defesa: "+g1.defesa());
        System.out.println("Especial: "+g1.especial());

        e1 = l1;
        System.out.println("Eu sou: Leafeon ");
        System.out.println("Ataque: "+l1.ataque());
        System.out.println("Defesa: "+l1.defesa());
        System.out.println("Especial: "+l1.especial());

        e1 = s1;
        System.out.println("Eu sou: Sylveon ");
        System.out.println("Ataque: "+s1.ataque());
        System.out.println("Defesa: "+s1.defesa());
        System.out.println("Especial: "+s1.especial());

        e1 = u1;
        System.out.println("Eu sou: Umbreon ");
        System.out.println("Ataque: "+u1.ataque());
        System.out.println("Defesa: "+u1.defesa());
        System.out.println("Especial: "+u1.especial());

        e1 = v1;
        System.out.println("Eu sou: Vaporeon ");
        System.out.println("Ataque: "+v1.ataque());
        System.out.println("Defesa: "+v1.defesa());
        System.out.println("Especial: "+v1.especial());

    }
}
 