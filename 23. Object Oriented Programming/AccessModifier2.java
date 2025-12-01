public class AccessModifier2{
    public static void main(String args[]){
        Bank2Account myAcc=new Bank2Account();
        myAcc.username="priyanshiSolanki";
        //if the password is private we can not set in like the 
        // username to we create a function to set password. As the 
        // epassword can be accessed by the functn in the SAME 
        // Class and we can assecc a public function easily
        myAcc.setPassword("abcd1234");
    }
}
class Bank2Account{
    public String username;//visble to all
    private String password;//access to no one
    //as private can't be access we can not set the password so we 
    //make a function to set password to set pswd in a diffrent class
    public void setPassword(String pwd){//can be set as default and public 
        // default means it can be accessed in this package only
        password=pwd;
    }
}