package Controller.Management;

import java.io.Serializable;

public class UserDTO implements Serializable{

    private String _name;
    private String _surname;
    private String _userName;
    private String _userPass;
    private int _phone;


    UserDTO(String name,String surname,String userName,String userPass, int phone){
        this._name=name;
        this._surname=surname;
        this._userName=userName;
        this._userPass=userPass;
        this._phone=phone;

    }

    public String getName() {

        return _name;
    }
    public void setName(String name) {
        _name=name;
    }

    public String getSurname() {

        return _surname;
    }
    public void setSurname(String surname) {
        _surname=surname;
    }

    public String getUserName() {

        return _userName;
    }
    public void setUserName(String userName) {
        _userName=userName;
    }

    public String getUserPass() {

        return _userPass;
    }
    public void setUserPass(String userPass) {
        _userPass=userPass;
    }

}
