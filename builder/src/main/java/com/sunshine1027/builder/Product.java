package com.sunshine1027.builder;

import java.util.Date;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Product {
    private String productId;
    private String productName;
    private FactoryEnum factory;
    private Date creationDate;
    private Date expiryDate;

    private Product(ProductBuilder builder) {
        productId = builder.getProductId();
        productName = builder.getProductName();
        factory = builder.getFactory();
        creationDate = builder.getCreationDate();
        expiryDate = builder.getExpiryDate();
    }

    public static class ProductBuilder {
        private String productId;
        private String productName;
        private FactoryEnum factory;
        private Date creationDate;
        private Date expiryDate;

        public ProductBuilder() {
        }

        public Product build() {
            return new Product(this);
        }

        public ProductBuilder addProductId(String _productId) {
            productId = _productId;
            return this;
        }

        public ProductBuilder addProductName(String _productName) {
            productName = _productName;
            return this;
        }

        public ProductBuilder addFactory(FactoryEnum _factory) {
            factory = _factory;
            return this;
        }

        public ProductBuilder addCreationDate(Date _creationDate) {
            creationDate = _creationDate;
            return this;
        }

        public ProductBuilder addExpiryDate(Date _expiryDate) {
            expiryDate = _expiryDate;
            return this;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public FactoryEnum getFactory() {
            return factory;
        }

        public void setFactory(FactoryEnum factory) {
            this.factory = factory;
        }

        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        public Date getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(Date expiryDate) {
            this.expiryDate = expiryDate;
        }
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public FactoryEnum getFactory() {
        return factory;
    }

    public void setFactory(FactoryEnum factory) {
        this.factory = factory;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", factory=" + factory +
                ", creationDate=" + creationDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
