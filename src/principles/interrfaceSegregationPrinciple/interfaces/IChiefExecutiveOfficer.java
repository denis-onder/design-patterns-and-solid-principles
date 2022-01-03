package principles.interrfaceSegregationPrinciple.interfaces;

public interface IChiefExecutiveOfficer extends IEmployee, ICEOAndManagerSharedActions {

	public void makeDecisions();

	public void addStocks();
}
