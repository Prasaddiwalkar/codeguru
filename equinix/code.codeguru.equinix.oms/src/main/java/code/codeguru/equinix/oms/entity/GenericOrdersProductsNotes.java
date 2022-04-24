package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_notes")
public class GenericOrdersProductsNotes {
    @ManyToOne(targetEntity = GenericOrdersProducts.class)
    @JoinColumn(name = "generic_Orders_Products_id")
    private Integer genericOrdersProductsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "noteDescription")
    private String noteDescription;

    @Column(name = "noteType")
    private String noteType;

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

    public String getNoteDescription() {
        return this.noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getNoteType() {
        return this.noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }
}
