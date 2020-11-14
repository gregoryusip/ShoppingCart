import java.util.ArrayList;

public class Cart {
	
	ArrayList<Product> produk = new ArrayList<>();

	public Cart() {
		
	}
	
	public void tambahProduk(String kodeProduk, int kuantitas) {
		int flag = 0;
		
		for(int i = 0; i < produk.size(); i++) {
			if(produk.get(i).getProductCode().equals(kodeProduk)) {
				flag = i;
				break;
			}else {
				flag = -1;
			}
		}

		if(flag == 0 || flag == -1) {
			produk.add(new Product(kodeProduk, kuantitas));
		}
		else if(flag != -1) {
			produk.set(flag, new Product(kodeProduk, kuantitas + produk.get(flag).getQuantity()));
		}
		
	}
	
	public void hapusProduk(String kodeProduk) {
		int flag = 0;
		
		for(int i = 0; i < produk.size(); i++) {
			if(produk.get(i).getProductCode().equals(kodeProduk)) {
				flag = i;
				break;
			}else {
				flag = -1;
			}
		}
		
		if(flag != -1) {
			produk.remove(flag);
		}
		
	}
	
	public void tampilkanCart() {
		for (Product keranjang:produk) {
			System.out.println(keranjang.getProductCode() + " (" + keranjang.getQuantity() + ")");
		}
	}

	public static void main(String[] args) {
		Cart keranjang = new Cart();
		
		keranjang.tambahProduk("Pisang Hijau", 2);

		keranjang.tambahProduk("Semangka Kuning", 3);
		
		keranjang.tambahProduk("Apel Merah", 1);
		keranjang.tambahProduk("Apel Merah", 4);
		keranjang.tambahProduk("Apel Merah", 2);
		
		keranjang.hapusProduk("Semangka Kuning");
		
		keranjang.hapusProduk("Semangka Merah");
			
		keranjang.tampilkanCart();
	}

}
