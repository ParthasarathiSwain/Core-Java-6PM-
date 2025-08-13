package usingInterface;

import java.util.List;

public interface LaptopOperation {
	public int addLaptop(Laptop laptop); 
	public List<Laptop> viewLaptops();
	public int updateLaptop(Laptop laptop); 
	public int deleteLaptop(int lid);
	public Laptop getLaptopById(int lid);
}
