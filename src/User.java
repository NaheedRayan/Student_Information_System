/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

//for handling the list
class User {
    private int sno ;
    private String username , firstname , lastname ,dept ,id ,batch,email,mobile_no,address,blood_group ;
    
    //constructor
    public User(int sno , String username ,String firstname ,String lastname ,String dept ,String id ,String batch,String email,String mobile_no,String address,String blood_group)
    {
        this.sno = sno ;
        this.username = username ;
        this.firstname = firstname ;
        this.lastname = lastname ;
        this.dept =dept ;
        this.id = id ;
        this.batch = batch ;
        this.email = email ;
        this.mobile_no = mobile_no ;
        this.address =address ;
        this.blood_group = blood_group ;
        
    
    }
    
    public int getsno(){
        return sno ;
    }
    public String getusername()
    {
        return username ;
    }
    public String getfirstname()
    {
        return firstname ;
    }
     
    public String getlastname()
    {
        return lastname ;
    }
    public String getdept()
    {
        return dept ;
    }
    public String getbatch()
    {
        return batch ;
    }
    public String getmobile_num()
    {
        return mobile_no ;
    }
    public String getaddress()
    {
        return address ;
    }public String getid()
    {
        return id ;
    }public String getemail()
    {
        return email ;
    }
    public String getblood_group()
    {
        return blood_group ;
    }
    
    
    
            
}
