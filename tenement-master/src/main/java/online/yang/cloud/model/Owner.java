package online.yang.cloud.model;


/**
 * 业主信息实体
 */

public class Owner {
    private String ownerId;

    private String ownerNo;

    private String ownerName;

    private Integer ownerGender;

    private String ownerBorth;

    private String ownerWorkstation;

    private String ownerPhone;

    private String ownerPassword;

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerNo() {
        return ownerNo;
    }

    public void setOwnerNo(String ownerNo) {
        this.ownerNo = ownerNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(Integer ownerGender) {
        this.ownerGender = ownerGender;
    }

    public String getOwnerBorth() {
        return ownerBorth;
    }

    public void setOwnerBorth(String ownerBorth) {
        this.ownerBorth = ownerBorth;
    }

    public String getOwnerWorkstation() {
        return ownerWorkstation;
    }

    public void setOwnerWorkstation(String ownerWorkstation) {
        this.ownerWorkstation = ownerWorkstation;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }
}