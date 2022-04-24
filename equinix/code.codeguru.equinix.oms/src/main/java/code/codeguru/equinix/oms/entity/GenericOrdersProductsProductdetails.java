package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_productdetails")
public class GenericOrdersProductsProductdetails {
    @ManyToOne(targetEntity = GenericOrdersProducts.class)
    @JoinColumn(name = "generic_Orders_Products_id")
    private Integer genericOrdersProductsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "severity")
    private String severity;

    @Column(name = "incidentDateTime")
    private String incidentDateTime;

    @Column(name = "callMeFromCage", columnDefinition = "TINYINT", length = 1)
    private boolean callMeFromCage;

    @Column(name = "networkTrouble", columnDefinition = "TINYINT", length = 1)
    private boolean networkTrouble;

    @Column(name = "customerTroubleType")
    private String customerTroubleType;

    @Column(name = "needSupportFromASubmarineCableStationEngineer", columnDefinition = "TINYINT", length = 1)
    private boolean needSupportFromASubmarineCableStationEngineer;

    @Column(name = "assetNumber")
    private String assetNumber;

    @Column(name = "productCategory")
    private String productCategory;

    public Integer getGenericOrdersProductsId() {
        return this.genericOrdersProductsId;
    }

    public void setGenericOrdersProductsId(Integer genericOrdersProductsId) {
        this.genericOrdersProductsId = genericOrdersProductsId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getIncidentDateTime() {
        return this.incidentDateTime;
    }

    public void setIncidentDateTime(String incidentDateTime) {
        this.incidentDateTime = incidentDateTime;
    }

    public boolean getCallMeFromCage() {
        return this.callMeFromCage;
    }

    public void setCallMeFromCage(boolean callMeFromCage) {
        this.callMeFromCage = callMeFromCage;
    }

    public boolean getNetworkTrouble() {
        return this.networkTrouble;
    }

    public void setNetworkTrouble(boolean networkTrouble) {
        this.networkTrouble = networkTrouble;
    }

    public String getCustomerTroubleType() {
        return this.customerTroubleType;
    }

    public void setCustomerTroubleType(String customerTroubleType) {
        this.customerTroubleType = customerTroubleType;
    }

    public boolean getNeedSupportFromASubmarineCableStationEngineer() {
        return this.needSupportFromASubmarineCableStationEngineer;
    }

    public void setNeedSupportFromASubmarineCableStationEngineer(
            boolean needSupportFromASubmarineCableStationEngineer) {
        this.needSupportFromASubmarineCableStationEngineer = needSupportFromASubmarineCableStationEngineer;
    }

    public String getAssetNumber() {
        return this.assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
