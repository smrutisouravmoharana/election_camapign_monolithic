package com.orive.security.donor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "donor")
public class Donor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long donorId;
	
	private String donorname;
	
	private String address;
	
	private String email;
	
	private String phone;
	
	private String age;
	
	private String profession;
	
	private String sex;
	
	
}
