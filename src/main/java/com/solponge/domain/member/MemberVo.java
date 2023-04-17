package com.solponge.domain.member;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="MEMBER2")
public class MemberVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MEMBER_NO;
    private String MEMBER_ID;
    private String MEMBER_PWD;
    private String MEMBER_NAME;
    private String MEMBER_ADDRESS;
    private String MEMBER_EMAIL;
    private String MEMBER_PHONE;
    private Grade MEMBER_GRADE;
    private String MEMBER_DATE;
}