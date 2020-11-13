package net.frankium.sunwaydiit.assignment.Assignment2Q3;

public class Main {
    public static void main(String[] args) {
        //New Doctor
        Doctor doctor1 = new Doctor("Gang","Yu","Ophthalmology");
        //New Patient
        Patient patient1 = new Patient(
                "Frankie",
                "Zhao",
                new Date(2003,5,22),
                "P0568",
                new Date(2010,7,20),
                new Date(2010,8,14),
                doctor1
        );
        //New bill
        Bill bill1 = new Bill("B1022",10320.2,5300.12,3200.50);
        
        //Display Information
        System.out.println("All Date in YYYY-MM-DD");
        System.out.println("\nDoctor:");
        System.out.println(doctor1);
        System.out.println("\nPatient:");
        System.out.println(patient1);
        System.out.println("\nBill, Before Addition (Init State):");
        System.out.println(bill1);
        
        //Add Bills
        bill1.addDoctorFee(100);
        bill1.addPharmacyCharges(200);
        bill1.addRoomRent(300);
        
        //Display Information
        System.out.println("\n\nBill, After Addition (Updated):");
        System.out.println(bill1);
    }
}
