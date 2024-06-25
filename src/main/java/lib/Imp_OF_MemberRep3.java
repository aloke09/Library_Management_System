package lib;

import static lib.Main.MemberMap;

public class Imp_OF_MemberRep3 implements MemberRep3
{
    @Override
    public Member findMemberById(String memberId) {
        if(MemberMap.containsKey(memberId))
        {
            System.out.println(MemberMap.get(memberId));
            System.out.println("Member founded");
        }
        else {
            System.out.println("Member does not exists!!");
        }
        return (Member) MemberMap.get(memberId);
    }
}
