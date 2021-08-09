public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesTotal = 30000;
        this.feesPaid = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        feesTotal-= fees;
        School.updateTotalIncome(feesPaid);
    }

    public void paidInFull() {
        if (feesPaid == feesTotal) {
            System.out.println("Loans are paid in full!");
        } else {
            System.out.println("still must pay");
        }
    }

    @Override
    public String toString() {
        return "Student " + getName() + " has to pay $" + getFeesTotal();
    }
}


