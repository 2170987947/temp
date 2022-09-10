package online.yang.cloud.model;


/**
 * 车位信息实体
 */

public class Parking {
    private String parkId;

    private Integer parkNo;

    private String parkCarNo;

    private String parkOwner;

    private String parkOperator;

    private String parkComment;

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public Integer getParkNo() {
        return parkNo;
    }

    public void setParkNo(Integer parkNo) {
        this.parkNo = parkNo;
    }

    public String getParkCarNo() {
        return parkCarNo;
    }

    public void setParkCarNo(String parkCarNo) {
        this.parkCarNo = parkCarNo;
    }

    public String getParkOwner() {
        return parkOwner;
    }

    public void setParkOwner(String parkOwner) {
        this.parkOwner = parkOwner;
    }

    public String getParkOperator() {
        return parkOperator;
    }

    public void setParkOperator(String parkOperator) {
        this.parkOperator = parkOperator;
    }

    public String getParkComment() {
        return parkComment;
    }

    public void setParkComment(String parkComment) {
        this.parkComment = parkComment;
    }
}