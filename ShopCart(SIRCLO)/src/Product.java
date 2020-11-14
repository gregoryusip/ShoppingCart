
public class Product {
	
	private String productCode;
	private int quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productCode, int quantity) {
		super();
		this.productCode = productCode;
		this.quantity = quantity;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
