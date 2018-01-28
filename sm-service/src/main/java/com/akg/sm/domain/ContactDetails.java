package com.akg.sm.domain;

public class ContactDetails {

    private String email;
    private Long mobileNumber;
    private Long homePhone;
    private Long officePhone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Long homePhone) {
        this.homePhone = homePhone;
    }

    public Long getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(Long officePhone) {
        this.officePhone = officePhone;
    }
}
