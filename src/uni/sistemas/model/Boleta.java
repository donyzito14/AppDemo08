package uni.sistemas.model;

import uni.sistemas.entity.Item;
import uni.sistemas.services.Comprobante;

public class Boleta extends Comprobante {

    @Override
    public Item[] documento(double total) {
        //variables
        double servicio = total*0.10;
        double totalgeneral = total + servicio;
        //crear boleta 
        Item[] doc = new Item[3];
        //asignar valores al objeto doc
        doc[0] = new Item("Total : ",total);
        doc[1] = new Item("Servicio(20%) : ",servicio);
        doc[2] = new Item("Total general : ",totalgeneral);
        return doc;        
    }

}
