package org.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    public Product(String id, String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int stock(){
        return stock;
    }
    //stoktan düşme metotu-> sipariş verildiğinde çalışacak
    public void decreaseStock(int amount){
        if (this.stock >= amount){
            this.stock -= amount;
        }
    }
    //ürün bilgilerini ekrana yazdıran metot
    public void displayProduct(){
        System.out.println("ID: " + id + " | Ürün: " + name + " | Fiyat: " + price + " TL | Stok: " + stock);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
