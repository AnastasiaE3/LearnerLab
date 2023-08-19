import io.zipcoder.interfaces.Person;

public class student extends Person implements learner {
    private double totalStudyTime;
    public student (long id, String name) {
        super(id, name);

    }
    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {

        return totalStudyTime;
    }
}
