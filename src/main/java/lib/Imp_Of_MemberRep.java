package lib;
import static lib.Main.MemberMap;
import static lib.Main.bookMap;

public class Imp_Of_MemberRep implements MemberRep
{

    @Override
    public void addMember(Member member) {
        MemberMap.put(member.getMemberId(),member);
        System.out.println(member.toString()+"Member added successfully!!");
    }

//    @Override
//    public void removeMember(String memberId) {
//        if(MemberMap.containsKey(memberId))
//        {
//            MemberMap.remove(memberId);
//            System.out.println("Member removed");
//        }
//        else {
//            System.out.println("Member does not exists!!");
//        }
//    }
//
//    @Override
//    public Member findMemberById(String memberId) {
//        if(MemberMap.containsKey(memberId))
//        {
//            System.out.println(MemberMap.get(memberId));
//            System.out.println("Member founded");
//        }
//        else {
//            System.out.println("Member does not exists!!");
//        }
//        return (Member) MemberMap.get(memberId);
//    }

}
