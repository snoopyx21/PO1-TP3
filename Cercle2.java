class Cercle2 extends Point
{
    private double x;
    private double y;
    private double r;    

    public Cercle2(double x, double y, double r)
    {
        super(x,y); // a faire en premier
        this.r=r;
    }
    public void deplaceCentre(double dx, double dy)
    {
        deplace(dx, dy);
        // this.x += dx;
        // this.y += dy;
    }
    public void changerRayon(double dr)
    {
        this.r=dr;
    }
    public Point getCentre()
    {
        return new Point(x,y);
    }
    public String toString()
    {
        return "Centre de coordonnees : " + x + " , " + y + " et de centre " + r;
    }
}
