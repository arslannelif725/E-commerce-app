# 🛒 E-Commerce & Shopping Cart System (E-Ticaret ve Sepet Simülasyonu)

Bu proje, Java programlama dili kullanılarak geliştirilmiş, nesne yönelimli programlama (`OOP`) prensiplerini ve liste yönetimini temel alan konsol tabanlı bir **E-Ticaret ve Sepet Yönetim Sistemi**dir.

## 🚀 Projenin Öne Çıkan Özellikleri
* **Ürün Kataloğu Yönetimi:** Farklı kategorilerde ve stok adetlerinde dinamik ürün listeleme.
* **Sepet İşlemleri (`Cart`):** Seçilen ürünlerin sepete eklenmesi, sepetin listelenmesi ve toplam tutarın anlık olarak hesaplanması.
* **Dinamik Stok Güncelleme (`decreaseStock`):** Sipariş onaylandığında (`Checkout`) seçilen ürünlerin stok miktarının güvenli bir şekilde düşürülmesi ve sepetin sıfırlanması.
* **İnteraktif Konsol Menüsü:** Kullanıcı dostu `Scanner` döngüsü ile akıcı bir alışveriş deneyimi.

## 🛠️ Kullanılan Teknolojiler
* **Java** (JDK 17+)
* **Maven** (Proje ve bağımlılık yönetimi)
* **IntelliJ IDEA** (Geliştirme ortamı)

## 📦 Proje Mimarisi (Package Structure)
```text
src/main/java/org/ezample/
├── Product.java   # Ürün özelliklerini ve stok güncelleme mantığını tutar
├── Cart.java      # Sepet listesi, tutar hesaplama ve sipariş onaylama işlemlerini yönetir
└── Main.java      # Konsol arayüzü ve interaktif mağaza menüsü
