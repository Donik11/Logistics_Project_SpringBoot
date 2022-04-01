package com.trans.abuziyo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "drivers")
public class Drivers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "carNumber")
    private String carNumber;
    @Column(name = "numberCMR")
    private String numberCMR;
    @Column(name = "numberCMR2")
    private String numberCMR2;
    @Column(name = "tirNumber")
    private String tirNumber;
    @Column(name = "voucherNumber")
    private String voucherNumber;
    @Column(name = "dazol")
    private String dazol;
    @Column(name = "checker")
    private int checker;
    @Column(name = "cmrChecker")
    private int cmrChecker;
    @Column(name = "cmrChecker2")
    private int cmrChecker2;
    @Column(name = "tirChecker")
    private int tirChecker;
    @Column(name = "vouchercheker")
    private int vouchercheker;
    @Column(name = "dazolchecker")
    private int dazolchecker;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getNumberCMR() {
        return numberCMR;
    }

    public void setNumberCMR(String numberCMR) {
        this.numberCMR = numberCMR;
    }

    public String getNumberCMR2() {
        return numberCMR2;
    }

    public void setNumberCMR2(String numberCMR2) {
        this.numberCMR2 = numberCMR2;
    }

    public String getTirNumber() {
        return tirNumber;
    }

    public void setTirNumber(String tirNumber) {
        this.tirNumber = tirNumber;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getDazol() {
        return dazol;
    }

    public void setDazol(String dazol) {
        this.dazol = dazol;
    }

    public int getChecker() {
        return checker;
    }

    public void setChecker(int checker) {
        this.checker = checker;
    }

    public int getCmrChecker() {
        return cmrChecker;
    }

    public void setCmrChecker(int cmrChecker) {
        this.cmrChecker = cmrChecker;
    }

    public int getCmrChecker2() {
        return cmrChecker2;
    }

    public void setCmrChecker2(int cmrChecker2) {
        this.cmrChecker2 = cmrChecker2;
    }

    public int getTirChecker() {
        return tirChecker;
    }

    public void setTirChecker(int tirChecker) {
        this.tirChecker = tirChecker;
    }

    public int getVouchercheker() {
        return vouchercheker;
    }

    public void setVouchercheker(int vouchercheker) {
        this.vouchercheker = vouchercheker;
    }

    public int getDazolchecker() {
        return dazolchecker;
    }

    public void setDazolchecker(int dazolchecker) {
        this.dazolchecker = dazolchecker;
    }
}
