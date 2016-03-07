package uni.sistemas.services;

import uni.sistemas.entity.Item;

public abstract class Comprobante {

    //metodo abstract solo se define
    public abstract Item[] documento(double total);

}
