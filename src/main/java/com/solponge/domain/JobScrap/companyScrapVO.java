package com.solponge.domain.JobScrap;


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
@Entity(name="companyScrap")
public class companyScrapVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MEMBER_NO;
    private String companyName;
    private Date scrap_time;
}
