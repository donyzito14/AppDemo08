package uni.sistemas.model;

import uni.sistemas.entity.Item;
import uni.sistemas.services.Comprobante;

public class Factura extends Comprobante {

    @Override
    public Item[] documento(double total) {
        //variables
        double consumo = total / (1 + 0.18);
        double impuesto = total - consumo;
        double servicio = total * 0.10;
        double totalgeneral = total + servicio;
        //crear factura
        Item[] doc = new Item[5];
        //asignar valores al objeto doc
        doc[0] = new Item("Consumo : ", consumo);
        doc[1] = new Item("Impuesto(18%) : ", impuesto);
        doc[2] = new Item("Total : ", total);
        doc[3] = new Item("Servicio(10%) : ", servicio);
        doc[4] = new Item("Total general : ", totalgeneral);
        return doc;

    }

}
