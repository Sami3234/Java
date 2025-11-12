public class MedicalRecord {
    private String recordId;
    private String diagnosis;
    public Patient patient;

    MedicalRecord(String recordID,String diagnosis, Patient p){
        this.recordId = "recordId";
        this.diagnosis= diagnosis;
    }

     public void setdiagnosis(String diagnosis){
        diagnosis = "Fiver";
     }
     public void addEntry(){

     }

     public void getHistory(){
        System.out.println("Patient record is "+recordId);
        System.out.println("Patient record is "+diagnosis);
     }
}
