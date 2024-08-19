package com.java.factory;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		
		if(planType == null) {
			return null;
		}
		
		if(planType.equals("Domestic")) {
			return new DomesticPlan();
		}
		
		if(planType.equals("CommericalPlan")) {
			return new CommericalPlan();
		}
		
		if(planType.equals("InstitutionalPlan")) {
			return new InstitutionalPlan();
		}
		
		return null;
	}
	
}
