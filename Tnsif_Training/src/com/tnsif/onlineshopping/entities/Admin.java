package com.tnsif.onlineshopping.entities;
public class Admin extends User {
    private String adminLevel;  // "SUPER_ADMIN", "PRODUCT_MANAGER", "ORDER_MANAGER"
    private String department;
    private int managedProductsCount;
    private int managedOrdersCount;
    private String permissions;  // JSON string of permissions
    
    public Admin(int userId, String username, String password, String email, 
                 String phoneNumber, String fullName, String adminLevel, String department) {
        super(userId, username, password, email, phoneNumber, fullName);
        this.adminLevel = adminLevel;
        this.department = department;
        this.managedProductsCount = 0;
        this.managedOrdersCount = 0;
        this.permissions = "ALL";  // Default permissions
        setUserType("ADMIN");
    }
    
    // Getters and setters
    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public int getManagedProductsCount() { return managedProductsCount; }
    public void setManagedProductsCount(int managedProductsCount) { this.managedProductsCount = managedProductsCount; }
    public void incrementManagedProductsCount() { this.managedProductsCount++; }
    
    public int getManagedOrdersCount() { return managedOrdersCount; }
    public void setManagedOrdersCount(int managedOrdersCount) { this.managedOrdersCount = managedOrdersCount; }
    public void incrementManagedOrdersCount() { this.managedOrdersCount++; }
    
    public String getPermissions() { return permissions; }
    public void setPermissions(String permissions) { this.permissions = permissions; }
    
    @Override
    public String toString() {
        return super.toString() + " Admin [adminLevel=" + adminLevel + 
               ", department=" + department + ", managedProductsCount=" + 
               managedProductsCount + ", managedOrdersCount=" + managedOrdersCount + "]";
    }
}