package com.example.stockclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * symbol that IEX Cloud supports for intraDay price updates
 */
@Entity
@Data
@NoArgsConstructor
public class Symbol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String symbol;

    @Column
    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column
    private String type;

    @Column
    private String iexId;

    @Column
    private String currency;

    @Column
    private boolean isEnabled;

    @Column
    private String figi;

    @Column
    private Long cik;

    @Column
    private String lei;
}
