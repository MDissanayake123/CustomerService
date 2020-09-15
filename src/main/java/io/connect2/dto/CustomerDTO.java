package io.connect2.dto;

public class CustomerDTO {
    private String customerId;
    private String email;
    private String businessName;
    private String contactOne;
    private String contactTwo;
    private String password;
    private String website;
    private String imgLogo;
    private String nic;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String email, String businessName, String contactOne, String contactTwo,
                       String password,String website,String imgLogo,String nic) {
        this.customerId = customerId;
        this.email = email;
        this.businessName = businessName;
        this.contactOne = contactOne;
        this.contactTwo = contactTwo;
        this.password = password;
        this.website = website;
        this.imgLogo=imgLogo;

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getContactOne() {
        return contactOne;
    }

    public void setContactOne(String contactOne) {
        this.contactOne = contactOne;
    }

    public String getContactTwo() {
        return contactTwo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setContactTwo(String contactTwo) {
        this.contactTwo = contactTwo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}

