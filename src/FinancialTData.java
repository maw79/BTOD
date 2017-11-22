import java.util.Vector;

public class FinancialTData {

    public FinancialTData(){

    }

    public double GetSubtotal(Vector v){
        double subT = 0;
        for(int i = 0; i < v.size(); i++){
            Vector temp = new Vector();
            temp = (Vector)v.elementAt(i);
            for(int j = 0; j < (int)temp.elementAt(2);j++) {
                subT = subT + (int)temp.elementAt(3);
            }
        }
        return subT;
    }

    public double GetTax(double SubT){
        double tax = (SubT * .1);
        return tax;
    }

    public double GetTotal(double SubT, double tax){
        double Fin = SubT + tax;
        return Fin;
    }
}
