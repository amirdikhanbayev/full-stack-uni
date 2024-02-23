package org.amirs.uniback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String title;
    private String desc;
    private String img;
    private String price;

    public Product(String title, String desc, String img, String price) {
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.price = price;
    }
}
