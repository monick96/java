package models.calculadorDescuentoTDD;

public class CalcuadorDescuento {

    public static float calculateDiscount(float discount, float amount) {
        return (discount * amount /100);
    }


    public static float getPriceWithDiscount(float discount, float amount) {
        return amount - (discount * amount /100);
    }
}
