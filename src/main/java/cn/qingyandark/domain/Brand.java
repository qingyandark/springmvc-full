package cn.qingyandark.domain;

public class Brand {
    private Integer id;
    private String brand_name;
    private String company_name;
    private Integer ordered;
    private String DESCRIPTION;
    private Integer STATUS;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_name='" + brand_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", ordered=" + ordered +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", STATUS=" + STATUS +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public Integer getSTATUS() {
        return STATUS;
    }
}