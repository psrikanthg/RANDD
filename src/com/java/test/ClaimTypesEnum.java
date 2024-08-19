package com.java.test;


public enum ClaimTypesEnum {
	AD("AD", "ADLD"), 
	ADA("ADA", "ADLD"), 
	LDA("LDA", "ADLD"), 
	ADLD("ADLD", "ADLD"), 
	EWA("EW", "EW"), 
	EW("EW", "EW"), 
	THEFT("THEFT", "THEFT"), 
	BAT("BAT", "Battery Replacement"),
	CS("CS", "Cracked Screen"), 
	IWA("IWA", "In Warranty");


	String claimType;
	String claimDescription;

	ClaimTypesEnum(String claimType, String claimDescription){
        this.claimType=claimType;
        this.claimDescription=claimDescription;
    }
	public String getClaimType() {
		return claimType;
	}

	public String getClaimDescription() {
		return claimDescription;
	}
	
	public static String lookupByType(String refundType) {
        for (ClaimTypesEnum type: ClaimTypesEnum.values()) {
            if (refundType.equals(type.getClaimType())) {
                return type.getClaimDescription();
            }
        }
        return null;
    }
	
}
