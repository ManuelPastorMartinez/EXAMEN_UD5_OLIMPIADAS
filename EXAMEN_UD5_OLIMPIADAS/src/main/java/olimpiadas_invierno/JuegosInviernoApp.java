package olimpiadas_invierno;

public class JuegosInviernoApp {

    public static void main(String[] args) {
        Deportista olivia_smart = new Deportista("Olivia Smart",1,4,1997);
        olivia_smart.inscribirse("Patinaje artístico");
        Equipo equipo1=new Equipo("España");
        Deportista nil_llop = new Deportista("Nil Llop",20,9,2002);
        nil_llop.inscribirse("Patinaje velocidad");
        equipo1.inscribirDeportista(olivia_smart);

        Deportista nora_cornell = new Deportista("Nora Cornell", 2,9,2005);
        nora_cornell.inscribirse("Snowboard");
        nora_cornell.inscribirse("Big Air");

        Equipo espanya = new Equipo("ESPAÑA");

        espanya.inscribirDeportista(olivia_smart);
        espanya.inscribirDeportista(nora_cornell);
        espanya.inscribirDeportista(nil_llop);

        System.out.println(espanya);

        nora_cornell.setMedallas(2);
        nil_llop.setMedallas(1);
        nora_cornell.verModalidades();

        System.out.println("\n" + espanya.getPais() + " ha conseguido " + espanya.medallasTotales() + " medallas.");;

        espanya.verMedallero();

        System.out.println("\n El deportista de " + espanya.getPais() + " que más medallas ha ganado es " + espanya.deportistaTOP().getNombre());

        espanya.verMedallasDeportista(olivia_smart);
        espanya.verMedallasDeportista(nil_llop);
    }

}
