public class AccessModifier {
    public static void main(String args[]){
        BankAccount myAcc=new BankAccount();
        myAcc.username="Darshan";
        System.out.println(myAcc.username);
        //myAcc.passward="abcde";  //You can not directly assign the string into the passward because it is the private 
        myAcc.setPassward("abcde");  //You can change the passward by creating function in class
        System.out.println(myAcc.getPassward());
    }
}

class BankAccount{

    public String username;
    private String passward;

    public void setPassward(String pwd){
        passward=pwd;
    }

    public String getPassward(){
        return passward;
    }


}
/*

 * private : within class
 * default : within class, within package
 * protected : within class, within package, outside package by subclass only
 * public : within class, within package, outside package by subclass only, outside the package
 
 * 
 */
