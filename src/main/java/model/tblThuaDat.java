/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author cuongdx
 */
public class tblThuaDat {

    /**
     *
     */
    public int gid;

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTHUAID(int THUAID) {
        this.THUAID = THUAID;
    }

    public void setXAID(int XAID) {
        this.XAID = XAID;
    }

    public void setSHBANDO(int SHBANDO) {
        this.SHBANDO = SHBANDO;
    }

    public void setSHTHUA(int SHTHUA) {
        this.SHTHUA = SHTHUA;
    }

    public void setDIENTICH(float DIENTICH) {
        this.DIENTICH = DIENTICH;
    }

    public void setDIENTICHPL(float DIENTICHPL) {
        this.DIENTICHPL = DIENTICHPL;
    }

    public void setMALOAIDAT(String MALOAIDAT) {
        this.MALOAIDAT = MALOAIDAT;
    }

    public void setKHLOAIDAT(String KHLOAIDAT) {
        this.KHLOAIDAT = KHLOAIDAT;
    }

    public void setDIADANH(String DIADANH) {
        this.DIADANH = DIADANH;
    }

    public void setDTSD(int DTSD) {
        this.DTSD = DTSD;
    }

    public void setTENCHU(String TENCHU) {
        this.TENCHU = TENCHU;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public void setMDSD2003(int MDSD2003) {
        this.MDSD2003 = MDSD2003;
    }

    public void setKH2003(String KH2003) {
        this.KH2003 = KH2003;
    }

    public void setMSCOLOR(int MSCOLOR) {
        this.MSCOLOR = MSCOLOR;
    }

    public void setSHTHUATAM(String SHTHUATAM) {
        this.SHTHUATAM = SHTHUATAM;
    }

    public void setDTTHOCU(String DTTHOCU) {
        this.DTTHOCU = DTTHOCU;
    }

    public int getGid() {
        return gid;
    }

    public int getID() {
        return ID;
    }

    public int getTHUAID() {
        return THUAID;
    }

    public int getXAID() {
        return XAID;
    }

    public int getSHBANDO() {
        return SHBANDO;
    }

    public int getSHTHUA() {
        return SHTHUA;
    }

    public float getDIENTICH() {
        return DIENTICH;
    }

    public float getDIENTICHPL() {
        return DIENTICHPL;
    }

    public String getMALOAIDAT() {
        return MALOAIDAT;
    }

    public String getKHLOAIDAT() {
        return KHLOAIDAT;
    }

    public String getDIADANH() {
        return DIADANH;
    }

    public int getDTSD() {
        return DTSD;
    }

    public String getTENCHU() {
        return TENCHU;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public int getMDSD2003() {
        return MDSD2003;
    }

    public String getKH2003() {
        return KH2003;
    }

    public int getMSCOLOR() {
        return MSCOLOR;
    }

    public String getSHTHUATAM() {
        return SHTHUATAM;
    }

    public String getDTTHOCU() {
        return DTTHOCU;
    }
    public int ID;
    public int THUAID;
    public int XAID;
    @NotNull
    @Min(1)
    @Max(500)
    public int SHBANDO;
    @NotNull
    @Min(10)
    @Max(1000)
    public int SHTHUA;
    @NotNull
    public float DIENTICH;
    public float DIENTICHPL;
    public String MALOAIDAT;
    public String KHLOAIDAT;
    public String DIADANH;
    public int DTSD;
    @Size(min = 3, max = 30)
    public String TENCHU;
    @Size(min = 3, max = 30)
    public String DIACHI;
    public int MDSD2003;
    public String KH2003;
    public int MSCOLOR;
    public String SHTHUATAM;
    public String DTTHOCU;

}
