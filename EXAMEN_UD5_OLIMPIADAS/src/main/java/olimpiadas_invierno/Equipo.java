package olimpiadas_invierno;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista>listaDeportistas;

    public Equipo(String pais){
        this.pais=pais;
        this.listaDeportistas=new ArrayList<>();
    }

    public void inscribirDeportista(Deportista deportista){

        listaDeportistas.add(deportista);
        System.out.println("Deportista "+deportista.getNombre()+" inscrito con exito");
    }

    public int medallasTotales(){
        int aux=0;
        for (Deportista deportista : listaDeportistas){
            aux+=deportista.getMedallas();
        }
        return aux;
    }

    public void verMedallero(){
        System.out.println("Deportistas que han conseguido medallas para "+pais);
        for (Deportista deportista : listaDeportistas){
            if (deportista.getMedallas()!=0){
                System.out.println(deportista.getNombre()+" con "+deportista.getMedallas()+" medallas");
            }
        }
    }

    public Deportista deportistaTOP(){

        Deportista top =listaDeportistas.get(0);
        for (Deportista deportista : listaDeportistas){
            if(top.getMedallas()<deportista.getMedallas()){
                top=deportista;
            }
        }
        return top;
    }

    public void verMedallasDeportista(Deportista deportista){

        if (deportista.getMedallas()==0){
            System.out.println("El deportista "+deportista.getNombre()+" de "+deportista.getEquipo()+" no ha ganado ninguna medalla durante estos JJOO");
        }else {
            System.out.println(deportista.getMedallas());
        }
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }

}
