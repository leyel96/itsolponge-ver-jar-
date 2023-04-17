package com.solponge.domain.jobinfo;

import lombok.Data;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="job_info")
public class JopInfoVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int infonum;
    private String jinfo_field;
    private String companyname;
    private String infoname;
    private String ftaglist;
    private String qualificat;
    private String worktype;
    private String workarea;
    private String Deadline;
    private String pagecode;
    private String infolink;
}
