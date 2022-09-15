// Florian Körner
// ArrayList<DataType> Name =new ArrayList<DataType>();
import java.util.ArrayList;
public class JobMarket {
	private String name;
	ArrayList<Job> jobs =new ArrayList<Job>();
	public JobMarket() {
		
	}
	public void addJob(Job job) {
		if(job !=null)this.jobs.add(job);
	}
	public void listAllJobs() {
		for(Job j : jobs) {
			System.out.println(j);
		}
	}
	public void listItJobs(){
		for(int i=0;i<jobs.size();i++) {
			if(jobs.get(i) instanceof ITJob) {
				System.out.println(jobs.get(i));
			}
		}
	}
	public void findJob(String job) {
		for(int i=0;i<jobs.size();i++) {
			if(jobs.get(i).equals(job)) {
				System.out.println(jobs.get(i));
			}
		}
	}
	public void listAllJobsWithSkill(String skill) {
        for (Job j : jobs) {
            for (String oneOfTheSkills : j.getSkills()) {
                if (oneOfTheSkills.equals(skill)) {
                    System.out.println(j.toString());
                }
            }
        }
    }

    public ArrayList<PayableJob> getJobsWithWeeklyPayment(double biggerThan) {
        ArrayList<PayableJob> makingMoney = new ArrayList<PayableJob>();
        for (Job j : jobs) {
            if (j instanceof PayableJob) {
                if (((PayableJob) j).getPaymentPerWeek() >= biggerThan) {
                    makingMoney.add((PayableJob) j);
                }
            }
        }
        return makingMoney;
    }

    public PayableJob findBestHourlyRateJob() {
        PayableJob pj = null;
        double bestHourlyRate = 0;
        for (Job j : jobs) {
            if (j instanceof PayableJob) {
                try {
                    if (((PayableJob) j).getHourlyRate() >= bestHourlyRate) {
                        pj = (PayableJob) j;
                        bestHourlyRate = ((PayableJob) j).getHourlyRate();
                    }
                } catch (MinHourlyRateException e) {
                    e.printStackTrace();
                }
            }
        }
        return pj;
    }

    public ArrayList<Job> getJobsWithPostCode(String postCode) {
        ArrayList<Job> liveThere = new ArrayList<Job>();
        for (Job j : jobs) {
            if (j.getPostCode().equals(postCode)) {
                liveThere.add(j);
            }
        }
        return liveThere;
    }
}
