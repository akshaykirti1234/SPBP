package tech.csm.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ComplainMaster")
public class ComplainMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "complain_id")
	private Integer complainId;

	@Column(name = "cust_email")
	private String custEmail;

	@Column(name = "date_of_complain")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfComplain;

	@Column(name = "complain")
	private String complain;

	@Column(name = "complain_status")
	private String complainStatus;
}
