class BankReceivingSystem implements ReceivingSystem {
    private int urgentCustomer;
    private int nonUrgentCustomer;
    private boolean employeeStatus;
    private static int arrivedCustomers;

    public int getUrgentListSize() {
        return urgentCustomer;
    }

    public int getNonUrgentListSize() {
        return nonUrgentCustomer;
    }

    public void customerArrived(boolean urgent) {
        if (urgent) urgentCustomer++;
        else nonUrgentCustomer++;
        arrivedCustomers++;
        calculateEmployeeStatus();
    }

    public void customerLeft(boolean urgent) {
        if (urgent) urgentCustomer--;
        else nonUrgentCustomer--;
        calculateEmployeeStatus();
    }

    public void calculateEmployeeStatus() {
        if (urgentCustomer + nonUrgentCustomer > 0) employeeStatus = true;
        else employeeStatus = false;
    }

    public boolean isEmployeeOccupied() {
        return employeeStatus;
    }

    public int getNumberOfArrivedCustomers() {
        return arrivedCustomers;
    }

    public BankReceivingSystem() {
        urgentCustomer = 0;
        nonUrgentCustomer = 0;
        employeeStatus = false;
        arrivedCustomers = 0;
    }

    public static void main(String[] args) {
        BankReceivingSystem brs = new BankReceivingSystem();

        brs.customerArrived(true);
        System.out.println(brs.isEmployeeOccupied());
        brs.customerArrived(false);
        brs.customerArrived(true);

        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(true);
        System.out.println(brs.isEmployeeOccupied());
        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(true);
        System.out.println(brs.isEmployeeOccupied());
        System.out.println(brs.getUrgentListSize());
        System.out.println(brs.getNonUrgentListSize());

        brs.customerLeft(false);
        System.out.println(brs.getNonUrgentListSize());
        System.out.println(brs.isEmployeeOccupied());

        System.out.println(brs.getNumberOfArrivedCustomers());
    }
}
