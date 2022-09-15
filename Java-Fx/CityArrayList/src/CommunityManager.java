import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CommunityManager implements Comparable<Community>{
	
	ArrayList<Community> coms = new ArrayList<Community>();
	public CommunityManager(Community community) {
		addComunity(community);
		
	}
	public void sortCommuintiesByNameAsc() {
		Collections.sort(coms);
	}
	public void sortCommuintiesByNameDesc() {
		Collections.sort(coms);
		Collections.reverse(coms);
	}
	public boolean addComunity(Community community) {
		if(community!=null) {
			coms.add(community);
			return true;
		}
		return false;
	}
	public boolean removeCommunity(Community community) {
		if(community!=null&&coms.contains(community)==true) {
			coms.remove(community);
			return true;
		}
		return false;
	}
	public int getTotalPopulation() {
		int population=0;
		for(Community c: coms) {
			population+=c.getPopulation();
		}
		return population;
	}
	public void printCommunities() {
		for(Community c:coms) {
			c.toString();
			System.out.println();
		}
	}
	public int getTotalBudgetOfCities() {
		int budget=0;
		for(Community c: coms) {
			budget+=c.getBudget();
		}
		return budget;
	}
	public int getTotalBudget() {
		int budget=0;
		for(Community c: coms) {
			budget+=c.getBudget();
		}
		return budget;
	}
	public double getAverageTemperature() {
		int counter=0;
		double summ=0;
		
		for(int i=0;coms.size()<i;i++) {
			counter++;
			summ+=coms.get(i).getTemperature();
		}
		double average=summ/counter;
		return average;
	}
	@Override
	public int compareTo(Community o) {
		// TODO Auto-generated method stub
		return 0;
	}
}