import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroiAoGrupo(Heroi heroi){
        for (int i = 0; i < herois.size(); i++) {
            if (heroi.getNomeHeroi().equals(herois.get(i).getNomeHeroi())){
                System.out.println("O herói "+ heroi.getNomeHeroi()+" já está no grupo!!");
                return;
            }
        }
        herois.add(heroi);
        System.out.println("O herói "+heroi.getNomeHeroi()+" entrou para o grupo!!" + heroi.getIdHeroi());
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedasDeOuro();
    }

    public void removerHeroiDoGrupo(String nomeHeroi){
        for (int i = 0; i < herois.size(); i++) {
            if (nomeHeroi.equals(herois.get(i).getNomeHeroi())){
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(i).getQuantidadeDeMoedasDeOuro();
                System.out.println("O herói "+ herois.get(i).getNomeHeroi()+ " saiu do grupo!!!");
                this.herois.remove(i);
                return;
            }
        }
        System.out.println("O herói "+ nomeHeroi +" não faz parte do grupo!!");
    }

    public ArrayList<Heroi> getHerois(){
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois){
        this.herois = herois;
    }

    public int getTotalMoedasDeOuro(){
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro){
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
}

