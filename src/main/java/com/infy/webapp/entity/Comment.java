package com.infy.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fileId")
    private Upload upload;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userName")
    private UserProfile userProfile;


}
