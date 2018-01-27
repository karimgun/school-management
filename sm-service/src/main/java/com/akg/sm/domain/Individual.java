package com.akg.sm.domain;

import java.sql.Date;

public abstract class Individual {

    private String firstName;
    private String middleName;
    private String lastName;

    private Address address;
    private ContactDetails contactDetails;

    private Gender gender;
    private Date dateOfBirth;
    private Date enrollmentDate;
    private Date separationDate;

}
