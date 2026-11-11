package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        //mağazadaki tüm ürünler listesi
        List<Product> storeProducts = new ArrayList<>();
        storeProducts.add(new Product("P01", "Laptop", 24500.0, 5));
        storeProducts.add(new Product("P02", "Kablosuz Mouse", 650.0, 15));
        storeProducts.add(new Product("P03", "Mekanik Klavye", 1800.0, 8));
        storeProducts.add(new Product("P04", "Monitör", 5200.0, 4));

        boolean exit = false;

        System.out.println("E-TİCARET VE SEPET SİSTEMİNE HOŞGELDİNİZ ");

        while (!exit){
            System.out.println("\n--- MAĞAZA MENÜSÜ ---");
            System.out.println("1. Ürünleri Listele");
            System.out.println("2. Sepete Ürün Ekle");
            System.out.println("3. Sepetimi Görüntüle ve Toplam Tutar");
            System.out.println("4. Siparişi Tamamla (Checkout)");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\n---ÜRÜN KATALOĞU---");
                    for(int i = 0; i<storeProducts.size(); i++){
                        System.out.print((i+1) + ". ");
                        storeProducts.get(i).displayProduct();
                    }
                    break;

                case 2:
                    System.out.println("\n---ÜRÜN SEÇ---");
                    for (int i = 0; i<storeProducts.size(); i++){
                        System.out.println((i + 1) + ". " + storeProducts.get(i).getName() + " (" + storeProducts.get(i).getPrice() + " TL) - Stok: " + storeProducts.get(i).getStock());
                    }
                    System.out.print("Sepete eklemek istediğiniz ürünün numarasını girin: ");
                    int pIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (pIndex > 0 && pIndex <= storeProducts.size()) {
                        Product selectedProduct = storeProducts.get(pIndex - 1);
                        if (selectedProduct.getStock() > 0) {
                            cart.addProductToCart(selectedProduct);
                        } else {
                            System.out.println("❌ Üzgünüz, bu ürünün stoğu tükenmiştir!");
                        }
                    } else {
                        System.out.println("❌ Geçersiz ürün numarası!");
                    }
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    exit = true;
                    System.out.println("alışveriş sisteminden çıkılıyor.");

                default:
                    System.out.println("geçersiz seçim lütfen 1-5 arasında sayı seçin.");
            }
        }
        scanner.close();
    }
}