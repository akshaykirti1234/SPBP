package tech.csm.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Sales")
public class Sales implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sales_id")
	private Integer salesId;

	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Product product;

	@Column(name = "sales_date")
	private Date salesDate;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "cust_name")
	private String custName;

	@Column(name = "cust_email")
	private String custEmail;

	@Column(name = "cust_pass")
	private String custPass;
}
