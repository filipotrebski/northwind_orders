package pl.agh.db2.northwind.model;

import java.io.Serializable;

//TODO może @IdClass?
//https://www.baeldung.com/jpa-composite-primary-keys
//https://vladmihalcea.com/the-best-way-to-map-a-composite-primary-key-with-jpa-and-hibernate/

public class OrderDetailsId implements Serializable {
    private Order orderId;
    private Product productId;

    public OrderDetailsId() {
    }

    public OrderDetailsId(Order orderId, Product productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (this == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderDetailsId other = (OrderDetailsId) obj;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        } else if (!orderId.equals(other.orderId))
            return false;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
