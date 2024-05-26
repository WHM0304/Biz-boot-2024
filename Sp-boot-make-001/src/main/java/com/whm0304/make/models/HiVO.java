package com.whm0304.make.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "tbl_hi")
public class HiVO {

    @Id
    @Column(name = "h_seq" , length = 15)
    private String h_seq;

    private String h_name;
    private String h_nick;
}
