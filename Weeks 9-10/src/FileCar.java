import java.io.*;
//=================================================================================================
public class FileCar implements Serializable {
    //-------------------------------------------------------------------------------------------------
    private String makeAndModel;
    private double purchasePrice;
    private double salePrice;
    //-------------------------------------------------------------------------------------------------
    public FileCar() {

        makeAndModel = null;
        purchasePrice = 0.0;
        salePrice = 0.0;
    }
    //-------------------------------------------------------------------------------------------------
    public FileCar(String makeAndModel,double purchasePrice, double salePrice) {

        this();
        this.makeAndModel = makeAndModel;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }
    //-------------------------------------------------------------------------------------------------
    public String toString() {

        return(String.format("%s $%.2f",makeAndModel,salePrice));
    }
    //-------------------------------------------------------------------------------------------------
    public double getPurchasePrice() {

        return(purchasePrice);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
