package SERVICE;

import ENTITIES.SPID;
import ENTITIES.Status;
import ENTITIES.USER;

import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        CRUD_OP2 spid1=new CRUD_OP2();
        CRUD_OP user1=new CRUD_OP();
        SPID spid=new SPID();

        user1.AddUser(new USER(1723727L,new Date(),new Date(),"Elvis","Zefaj","username"));

        List<USER> actList=user1.ShowUser();


        for(USER act :actList){
            System.out.println(act.getId()+" "+act.getName()+" "+act.getSurname()+" "+act.getUsername());
        }


        spid1.AddSpid(new SPID(883772L,user1.Users.get(0), Status.PENDING,"hello"));
        List<SPID> actList2=spid1.ShowSpid();

        for(SPID act :actList2){
            if(!act.getUser().getUsername().equals(user1.Users.get(0))){
                System.out.println(act.getId()+" "+act.getUser().getUsername()+" "+act.getDescription()+" "+act.getStatusName());
            }else {
                throw new Exception("not equal");
            }
        }

       user1.UpdateUser(user1.Users.get(0), 183772L,"Elvis_updated","Zefaj_updated","elviszefaj_updated");
       spid1.UpdateSpid(spid1.Spids.get(0),172821L,user1.Users.get(0),Status.APPROVE,"test2");


        for(USER act :actList){
            System.out.println(act.getId()+" "+act.getName()+" "+act.getSurname()+" "+act.getUsername());
        }

        for(SPID act :actList2){
            if(!act.getUser().getUsername().equals(user1.Users.get(0))){
                System.out.println(act.getId()+" "+act.getUser().getUsername()+" "+act.getDescription()+" "+act.getStatusName()+" "+ new Date());
            }else {
                throw new Exception("not equal");
            }
        }







    }
}
