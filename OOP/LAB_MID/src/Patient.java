public class Patient extends Hospital {
    private String PatientID;
    public Hospital hospital;
    public MedicalRecord MedicalRecord;

    Patient(String id, Hospital h, MedicalRecord MR){
        this .PatientID = id;
        this.hospital = h;
        this.MedicalRecord=MR;
    }

   public void updateinfo(String id){
            this.PatientID=id;

    }
    public void getSummary(){
        System.out.println("Patient Id: "+PatientID);
        System.out.println("Hospital name"+hospital);
    }
}
