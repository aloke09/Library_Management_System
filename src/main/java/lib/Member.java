package lib;

import java.time.LocalDate;
import java.util.Date;

public class Member extends Book {
    private String memberId;
    private String name;
    private String address;
    private String contactDetails;
    private LocalDate BDate;
    private LocalDate RDate;

    public Member(String memberId, String name, String address, String contactDetails, LocalDate BDate, LocalDate RDate) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
        this.BDate = BDate;
        this.RDate = RDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public LocalDate getBDate() {
        return BDate;
    }

    public void setBDate(LocalDate BDate) {
        this.BDate = BDate;
    }

    public LocalDate getRDate() {
        return RDate;
    }

    public void setRDate(LocalDate RDate) {
        this.RDate = RDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", BDate=" + BDate +
                ", RDate=" + RDate +
                '}';
    }
}
