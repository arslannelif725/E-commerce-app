package org.example;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems;

    public Cart(){
        cartItems = new ArrayList<>();
    }
    //sepete ürün ekleme
    public void addProductToCart(Product product){
        cartItems.add(product);
        System.out.println("sepete eklendi: "+ product.getName());
    }
    //sepettekileri listeleme ve toplam tutar hesaplama
    public void displayCart(){
        if(cartItems.isEmpty()){
            System.out.println("sepetiniz şu an boş.");
            return;
        }
        System.out.println("\n---SEPETİNİZ---");
        double total = 0.0;
        for (int i=0; i< cartItems.size(); i++){
            Product p = cartItems.get(i);
            System.out.println((i + 1)+"."+ p.getName() +"-"+ p.getPrice()+ "TL");
            total += p.getPrice();
        }
        System.out.println("-------------------");
        System.out.printf("Toplam Tutar: %.2f TL\n", total);
    }
    //sepeti onaylayıp stoktan düşme mantığı
    public void checkout(){
        if (cartItems.isEmpty()){
            System.out.println("sepetiniz boş olduğu için sipariş verilemez.");
            return;
        }
        //her ürünün stok miktarını güncelliyoruz
        for(Product p: cartItems){
            p.decreaseStock(1); //sepetteki her ürün için 1 düşüyoruz
        }
        System.out.println("\n siparişiniz başarıyla oluşturuldu");
        cartItems.clear(); //sepeti boşalt
    }
}
