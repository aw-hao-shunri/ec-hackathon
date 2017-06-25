package com.github.echackathon.datastore;

/**
 * 会社概要
 *
 */
public class CompanyInfo {
	/** ID */
	private Long id;
	/** 会社名 */
	private String companyName;
	/** 郵便番号 */
	private String postcalCode;
	/** 住所 */
	private String address;
	/** 代表者 */
	private String owner;
	/** 店舗運営責任者 */
	private String management;
	/** 店舗セキュリティ責任者 */
	private String securityOfficer;
	/** 電話番号 */
	private String tel;
	/** FAX番号 */
	private String fax;
	/** 店舗連絡先 */
	private String mail;
	private String createdBy;
	private String createdById;
	private CompanyInfo(Builder builder){
		this.id = builder.id;
		this.companyName = builder.companyName;
		this.postcalCode = builder.postcalCode;
		this.address = builder.address;
		this.owner = builder.owner;
		this.management = builder.management;
		this.securityOfficer = builder.securityOfficer;
		this.tel = builder.tel;
		this.fax = builder.fax;
		this.mail = builder.mail;
		this.createdBy = builder.createdBy;
		this.createdById = builder.createdById;
	}
	
	public static class Builder {
		/** ID */
		private Long id;
		/** 会社名 */
		private String companyName;
		/** 郵便番号 */
		private String postcalCode;
		/** 住所 */
		private String address;
		/** 代表者 */
		private String owner;
		/** 店舗運営責任者 */
		private String management;
		/** 店舗セキュリティ責任者 */
		private String securityOfficer;
		/** 電話番号 */
		private String tel;
		/** FAX番号 */
		private String fax;
		/** 店舗連絡先 */
		private String mail;
		private String createdBy;
		private String createdById;
		
		public Builder id(Long id){
			this.id = id;
			return this;
		}
		public Builder companyName(String companyName){
			this.companyName = companyName;
			return this;
		}
		public Builder postcalCode(String postcalCode){
			this.postcalCode = postcalCode;
			return this;
		}
		public Builder address(String address){
			this.address = address;
			return this;
		}
		public Builder owner(String owner){
			this.owner = owner;
			return this;
		}
		public Builder management(String management){
			this.management = management;
			return this;
		}
		public Builder securityOfficer(String securityOfficer){
			this.securityOfficer = securityOfficer;
			return this;
		}
		public Builder tel(String tel){
			this.tel = tel;
			return this;
		}
		public Builder fax(String fax){
			this.fax = fax;
			return this;
		}
		public Builder mail(String mail){
			this.mail = mail;
			return this;
		}
		public Builder createdBy(String createdBy){
			this.createdBy = createdBy;
			return this;
		}
		public Builder createdById(String createdById){
			this.createdById = createdById;
			return this;
		}
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the postcalCode
	 */
	public String getPostcalCode() {
		return postcalCode;
	}
	/**
	 * @param postcalCode the postcalCode to set
	 */
	public void setPostcalCode(String postcalCode) {
		this.postcalCode = postcalCode;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the management
	 */
	public String getManagement() {
		return management;
	}
	/**
	 * @param management the management to set
	 */
	public void setManagement(String management) {
		this.management = management;
	}
	/**
	 * @return the securityOfficer
	 */
	public String getSecurityOfficer() {
		return securityOfficer;
	}
	/**
	 * @param securityOfficer the securityOfficer to set
	 */
	public void setSecurityOfficer(String securityOfficer) {
		this.securityOfficer = securityOfficer;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdById
	 */
	public String getCreatedById() {
		return createdById;
	}
	/**
	 * @param createdById the createdById to set
	 */
	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}
}
