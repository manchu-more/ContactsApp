
public class contact {
    private int cid;
    private String name;
    private String phone;
    private String email;
    
    
    

public contact(Integer cid,String name,String phone,String email){
     this.cid=cid;
     this.name=name;
        this.phone=phone;
        this.email=email;
}

    contact(Object object, String name, String phone, String email, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public int getCid(int cid){
    return cid;
}
public void setCid(int cid){
    this.cid=cid;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getPhone(){
    return phone;
}
public void setPhone(String phone){
    this.phone=phone;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}

    Object getCid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}