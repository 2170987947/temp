package online.yang.cloud.model;


import java.math.BigDecimal;

/**
 * 缴费信息实体
 */

public class Cost {
    private String costId;

    private String costType;

    private String costStart;

    private String costEnd;

    private BigDecimal costSum;

    private String costOwner;

    private String costOwnerNo;

    private String costOperator;

    private String costOperatorNo;

    private Integer costStatus;

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getCostStart() {
        return costStart;
    }

    public void setCostStart(String costStart) {
        this.costStart = costStart;
    }

    public String getCostEnd() {
        return costEnd;
    }

    public void setCostEnd(String costEnd) {
        this.costEnd = costEnd;
    }

    public BigDecimal getCostSum() {
        return costSum;
    }

    public void setCostSum(BigDecimal costSum) {
        this.costSum = costSum;
    }

    public String getCostOwner() {
        return costOwner;
    }

    public void setCostOwner(String costOwner) {
        this.costOwner = costOwner;
    }

    public String getCostOwnerNo() {
        return costOwnerNo;
    }

    public void setCostOwnerNo(String costOwnerNo) {
        this.costOwnerNo = costOwnerNo;
    }

    public String getCostOperator() {
        return costOperator;
    }

    public void setCostOperator(String costOperator) {
        this.costOperator = costOperator;
    }

    public String getCostOperatorNo() {
        return costOperatorNo;
    }

    public void setCostOperatorNo(String costOperatorNo) {
        this.costOperatorNo = costOperatorNo;
    }

    public Integer getCostStatus() {
        return costStatus;
    }

    public void setCostStatus(Integer costStatus) {
        this.costStatus = costStatus;
    }
}