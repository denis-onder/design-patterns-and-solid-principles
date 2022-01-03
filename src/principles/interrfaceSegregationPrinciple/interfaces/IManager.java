package principles.interrfaceSegregationPrinciple.interfaces;

public interface IManager extends IEmployee, ICEOAndManagerSharedActions {
	public void hire();

	public void train();
}
