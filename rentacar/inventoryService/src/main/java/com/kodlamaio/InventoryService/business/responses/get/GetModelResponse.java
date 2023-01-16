package com.kodlamaio.InventoryService.business.responses.get;
import com.kodlamaio.InventoryService.entities.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetModelResponse {
	
	private String id;
	private String name;
	private Brand brandName;
	

}
