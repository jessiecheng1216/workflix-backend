package com.infy.webapp.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserProfile {
    @Id
    private String userName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountID")
    private UserAccount userID;
    private String firstName;
    private String lastName;
    private Character gender;
    private String phoneNumber;
    private LocalDate userDOB;

}
