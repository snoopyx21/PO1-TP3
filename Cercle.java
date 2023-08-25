class Cercle 
{
   private Point c;
   private double r;

   public Cercle(double x, double y, double r)
   {
       this.c= new Point (x , y);
       this.r=r;
   }
   public void deplaceCentre(double x , double y)
   {
       this.c.x=x;
       this.c.y=y;
   }
   public void changerRayon(double dr)
   {
       this.r=dr;
   }
   public Point getCentre()
   {
       return this.c;
   }
   public String toString()
   {
       return "Centre de coordonnees : " + this.c.x + ", " + this.c.y + " et de rayon " + this.r ;
   }
}
