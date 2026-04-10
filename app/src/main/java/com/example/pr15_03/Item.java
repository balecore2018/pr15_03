package com.example.pr15_03;

public class Item {
    public int Id;
    public String Name;
    public String Modell;
    public Integer Price;
    public Integer IdCategory;

    public Item(String name, String modell, Integer price, Integer idCategory){
        this.Name = name;
        this.Modell = modell;
        this.Price = price;
        this.IdCategory = idCategory;
    }
}
