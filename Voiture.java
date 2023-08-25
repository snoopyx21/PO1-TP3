public class Voiture
{
    String modele;
    Moteur m;
    
    public Voiture(String modele)
    {   
        this.modele=modele;
    }
    public Voiture(String modele, int carburant)
    {
        this.modele=modele;
        this.carburant=new Moteur(carburant);
    }
    public Voiture(String modele, Moteur m)
    {
        this.modele=modele;
        this.m=m;
    }

    public boolean demarrer()
    {
        return this.m.demarrer;
    }
}
