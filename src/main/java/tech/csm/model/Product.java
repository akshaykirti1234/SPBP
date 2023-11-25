package tech.csm.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prodId;

	@Column(name = "prod_name")
	private String prodName;

	@Column(name = "prod_qty")
	private Integer prodQty;

	@Column(name = "prod_price")
	private Double prodPrice;

}
