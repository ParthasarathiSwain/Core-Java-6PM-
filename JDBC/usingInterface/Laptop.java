package usingInterface;

public class Laptop {
	private int lid;
	private String brandName;
	private String modelN0;
	private String ram;
	private String storage;
	private String createdDate;
	private String updatedDate;
	private double price;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelN0() {
		return modelN0;
	}
	public void setModelN0(String modelN0) {
		this.modelN0 = modelN0;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brandName=" + brandName + ", modelN0=" + modelN0 + ", ram=" + ram
				+ ", storage=" + storage + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", price="
				+ price + "]";
	}
	
	
	
	
}


