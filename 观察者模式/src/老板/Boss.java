package 老板;

import java.util.ArrayList;

import 观察者.Observer;
import 通知者.Subject;

public class Boss /*implements*/extends Subject{

	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
		
	}

	public String getSubjectState() {
		return p.getSubjectState();
	}

	public void setSubjectState(String subjectState) {
		p.setSubjectState(subjectState);
	}

	
	
	
	
	
	private ArrayList<Observer> observers=new ArrayList<Observer>();
	private String action;

	
	
	
}
