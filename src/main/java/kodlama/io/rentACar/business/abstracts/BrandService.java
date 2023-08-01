package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandService {
	//İş kurallarını yazacağımız yapıyı tasarlıyoruz
	List<Brand> getAll();
}