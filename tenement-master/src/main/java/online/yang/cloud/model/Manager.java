package online.yang.cloud.model;


/**
 * 物业管理人员信息实体
 */

public class Manager {
    private String empId;

    private String empName;

    private String empPwd;

    private Integer empGender;

    private String empBorth;

    private String empPhone;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    public Integer getEmpGender() {
        return empGender;
    }

    public void setEmpGender(Integer empGender) {
        this.empGender = empGender;
    }

    public String getEmpBorth() {
        return empBorth;
    }

    public void setEmpBorth(String empBorth) {
        this.empBorth = empBorth;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }
}