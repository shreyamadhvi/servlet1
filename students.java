/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shreya_servlet1;

/**
 *
 * @author Admin
 */
public class students {
    private String Fullname;
    private String Address;
    private Integer textarea;
    private String  file;
    private String []Divison;
    private String []Result;

    public students(String Fullname, String Address, Integer textarea, String file, String[] Divison, String[] Result) {
        this.Fullname = Fullname;
        this.Address = Address;
        this.textarea = textarea;
        this.file = file;
        this.Divison = Divison;
        this.Result = Result;
    }

    public String[] getResult() {
        return Result;
    }

    public void setResult(String[] Result) {
        this.Result = Result;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getTextarea() {
        return textarea;
    }

    public void setTextarea(Integer textarea) {
        this.textarea = textarea;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String[] getDivison() {
        return Divison;
    }

    public void setDivison(String[] Divison) {
        this.Divison = Divison;
    }

    @Override
    public String toString() {
        return "students{" + "Fullname=" + Fullname + ", Address=" + Address + ", textarea=" + textarea + ", file=" + file + ", Divison=" + Divison + ", Result=" + Result + '}';
    }

    
}
