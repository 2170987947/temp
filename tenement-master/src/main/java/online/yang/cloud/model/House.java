package online.yang.cloud.model;


import java.math.BigDecimal;

/**
 * 房间信息实体
 */

public class House {
    private String houseId;

    private String houseNo;

    private String houseUnit;

    private String houseType;

    private BigDecimal houseArea;

    private String houseBuilding;

    private String houseDate;

    private String houseOwner;

    private String houseOwnerNo;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseUnit() {
        return houseUnit;
    }

    public void setHouseUnit(String houseUnit) {
        this.houseUnit = houseUnit;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public BigDecimal getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(BigDecimal houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseBuilding() {
        return houseBuilding;
    }

    public void setHouseBuilding(String houseBuilding) {
        this.houseBuilding = houseBuilding;
    }

    public String getHouseDate() {
        return houseDate;
    }

    public void setHouseDate(String houseDate) {
        this.houseDate = houseDate;
    }

    public String getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }

    public String getHouseOwnerNo() {
        return houseOwnerNo;
    }

    public void setHouseOwnerNo(String houseOwnerNo) {
        this.houseOwnerNo = houseOwnerNo;
    }
}