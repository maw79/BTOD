import java.util.Vector;

public class main {
    public static void main(String[] args)
    {
        //adding items to inventory database
        ManageInventory storeInv = new ManageInventory();
        storeInv.AddItem("M1 Abrams Tank",0001, 5,20000000);
        storeInv.AddItem("C4 (1 lb)",0002, 20,20);
        storeInv.AddItem("Bushmaster ACR",0003, 10,2000);
        storeInv.AddItem("Tavor AR",0004, 10,1800);
        storeInv.AddItem("FGM-148 Javelin",0006,5,10);
        storeInv.AddItem("Hand Grenade",0007,50,15);
        storeInv.AddItem("Flash Grenade",8,50,10);
        storeInv.AddItem("Stun Grenade",9,50,10);

        Vector v = new Vector();
        v  = storeInv.PullData();
        for(int i = 0; i < v.size(); i++){
            Vector temp = new Vector();
            System.out.println(v.elementAt(i));
        }

        FinancialTData FinT = new FinancialTData();
        double SubT = FinT.GetSubtotal(v);
        double tax = FinT.GetTax(SubT);
        System.out.println("Your Subtotal is: $" + SubT);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + FinT.GetTotal(SubT,tax));
        //INTERFACE: customer transaction
            //accept product ID from scanner

            //accept product quantity

            //decrement product quantity from inventory

            //repeat above to accept all products scanned

            //prompt for payment method

            //send payment verification to bank if card

            //get approval or denial from bank if card (boolean)

            //accept bills if cash, deny if wrinkly bill

            //prompt for more cash if remaining balance > 0

            //print out receipt

        //INTERFACE: manager menu (after konami code is entered)

        //INTERFACE: restocker menu
    }
}
