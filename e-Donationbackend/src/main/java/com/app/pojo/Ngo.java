package com.app.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tblNgo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ngo extends BaseEntity{

	@Column(length = 20 , nullable = false)
	private String ngoName ;
	
	@Column(length = 20 , nullable = false , unique = true)
	private String email ;
	
	@Column(length = 12)
	private String mobileNum;
	
	@Column(nullable =  false)
	private boolean isActive  ;

	@Column(length = 20 , nullable =  false)
	private String address ;
	
	@Column(length = 20 , nullable = false)
	private String password ;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Role role ;
	
	@OneToMany(mappedBy = "ngo",
			cascade = CascadeType.ALL ,
			fetch = FetchType.EAGER ,
			orphanRemoval = true)

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
