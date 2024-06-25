package lib;

import static lib.Main.MemberMap;

public class Imp_Of_MemberRep2 implements MemberRep2
{
    @Override
    public void removeMember(String memberId) {
        if(MemberMap.containsKey(memberId))
        {
            MemberMap.remove(memberId);
            System.out.println("Member removed");
        }
        else {
            System.out.println("Member does not exists!!");
        }
    }


}
