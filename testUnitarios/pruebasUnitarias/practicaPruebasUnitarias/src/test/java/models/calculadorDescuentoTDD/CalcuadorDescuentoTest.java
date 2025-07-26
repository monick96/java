package models.calculadorDescuentoTDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcuadorDescuentoTest {

    @Test
    public void shouldApply20PercentDiscountTo100(){

        float discountResult = CalcuadorDescuento.calculateDiscount(20,100);

        assertEquals(20,discountResult, 0.001f);// 0.001 es el margen de error permitido
    }

    @Test
    public void shouldNotApplyDiscountTo100WithZerPercent(){

        float discountResult = CalcuadorDescuento.calculateDiscount(0,100);

        assertEquals(0,discountResult, 0.001f);// 0.001 es el margen de error permitido
    }

    @Test
    public void shouldApplyDiscountToPriceWith20Percent(){

        float discountResult = CalcuadorDescuento.getPriceWithDiscount(20,100);

        assertEquals(80,discountResult, 0.001f);// 0.001 es el margen de error permitido
    }

    @Test
    public void shouldNotApplyDiscountToPriceWithZer0Percent(){

        float discountResult = CalcuadorDescuento.getPriceWithDiscount(0,100);

        assertEquals(100,discountResult, 0.001f);// 0.001 es el margen de error permitido
    }

}