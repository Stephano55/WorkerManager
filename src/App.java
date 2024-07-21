public class App {
    public static void main(String[] args) throws Exception {
        Employe a = null;
        Employe b = null;
        Employe c = null;
        a = new TempPlein(2000);
        try{
            b = new TempPartiel(1400, -143);
        }catch(DonneEmployeException e){
            System.out.println(e.getMessage());
        }
        try{
            c = new TempPartiel(1400, 123);
        }catch(DonneEmployeException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.calculerSalaire());
        try{
            if(b != null){
                System.out.println(b.calculerSalaire());
            }
        }catch(DonneEmployeException e){
            System.out.println(e.getMessage());
        }
        try{
            if (c != null) {
                System.out.println(c.calculerSalaire());
            }
        }catch(DonneEmployeException e){
            System.out.println(e.getMessage());
        }
    }
}
