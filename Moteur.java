class Moteur
{
    int carburant;
    public Moteur(int carburant)
    {
        this.carburant=carburant;
    }
    public Moteur()
    {
        this.carburant=0;
    }
    public boolean demarrer()
    {
        if (this.carburant <= 0)
            {
                System.out.println("Pas de caburant");
                return false;
            }
        else{
            this.carburant=carburant-1;
            System.out.println( " Moteur demarre avec " + carburant + " litres.");
            return true;
        }
    }
    public int utliser(int utilise)
    {
        if (this.carburant < utilise)
        {
            System.out.println("Moteur utilise " + utilise + "litres.");
            return 0;
        }
        else{
            this.carburant=carburant-utilise;
            System.out.println("Moteur utilise " + this.carburant + " litres.");
            return this.carburant;
        } 
    }
    public void arreter()
    {
        System.out.println("Moteur arrete");
    }
    public void fairePlein(int ajout)
    {
        this.carburant=carburant + ajout;
        System.out.println("Plein avec " + ajout + " litres.");
    }
}
