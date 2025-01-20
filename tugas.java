public class tugas {
    
    
    private String nama;
    private int usia;
    private double nilai;

    public String GetNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama =nama;
    }

    public int getUsia(){
        return usia;
    }
    
    public void setUsia(int usia){
        if( usia >= 0) {
            this.usia= usia;
        } else {
            System.out.println("usia invalid.");
        }        
    }
    public double getNilai(){
        return nilai;
    }

    public void setNilai(double nilai){
        if(nilai > 0 && nilai < 100 ){
            this.nilai= nilai;
        }else{
            System.out.println("nilai harus di antara 0 hingga 100");
    }


}
}