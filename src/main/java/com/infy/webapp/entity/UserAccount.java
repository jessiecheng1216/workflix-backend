package com.infy.webapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserAccount {
 @Id
 private String userEmail;
 private String userPassword;
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long accountID;
 @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
 private List<UserProfile> linkedUsers;
}
