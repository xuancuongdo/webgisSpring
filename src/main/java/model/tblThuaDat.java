/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author cuongdx
 */
@Entity
@Table(name="thuadat12457",
       uniqueConstraints  = { @UniqueConstraint(columnNames = { "THUAID" }) }
)
public class tblThuaDat implements Serializable {

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
    
    /**
     *
     * @return
     */
    @Id
    @Column(name="gid")
    public int getgid() {
        return gid;
    }
    
    @Column(name="ID")
    public int getID() {
        return ID;
    }
    
    @Column(name="THUAID")
    public int getTHUAID() {
        return THUAID;
    }

    @Column(name="XAID")
    public int getXAID() {
        return XAID;
    }

    @Column(name="SHBANDO")
    public int getSHBANDO() {
        return SHBANDO;
    }

    @Column(name="SHTHUA")
    public int getSHTHUA() {
        return SHTHUA;
    }

    @Column(name="DIENTICH")
    public float getDIENTICH() {
        return DIENTICH;
    }

    @Column(name="DIENTICHPL")
    public float getDIENTICHPL() {
        return DIENTICHPL;
    }

    @Column(name="MALOAIDAT",length = 10)
    public String getMALOAIDAT() {
        return MALOAIDAT;
    }

    @Column(name="KHLOAIDAT",length = 10)
    public String getKHLOAIDAT() {
        return KHLOAIDAT;
    }

    @Column(name="DIADANH",length = 30)
    public String getDIADANH() {
        return DIADANH;
    }

    @Column(name="DTSD")
    public int getDTSD() {
        return DTSD;
    }

    @Column(name="TENCHU",length = 50)
    public String getTENCHU() {
        return TENCHU;
    }

    @Column(name="DIACHI",length = 50)
    public String getDIACHI() {
        return DIACHI;
    }

    @Column(name="MDSD2003")
    public int getMDSD2003() {
        return MDSD2003;
    }

    @Column(name="KH2003",length = 10)
    public String getKH2003() {
        return KH2003;
    }

    @Column(name="MSCOLOR")
    public int getMSCOLOR() {
        return MSCOLOR;
    }

    @Column(name="SHTHUATAM",length = 10)
    public String getSHTHUATAM() {
        return SHTHUATAM;
    }

    @Column(name="DTTHOCU",length = 10)
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
