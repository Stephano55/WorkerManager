public class TempPartiel implements Employe{
    private double tauxHoraire;
    private double heureDeTravail;
    private double salaire;

    public TempPartiel(double tauxHoraire, double heureDeTravail) throws DonneEmployeException{
        if(heureDeTravail < 0){
            throw new DonneEmployeException("Vous essayer d'entrer des données non valides");
        }
        else{
            this.tauxHoraire = tauxHoraire;
            this.heureDeTravail = heureDeTravail;
        }
    }
    public double calculerSalaire(){
        salaire = tauxHoraire * heureDeTravail;
        return salaire;
    }
}
