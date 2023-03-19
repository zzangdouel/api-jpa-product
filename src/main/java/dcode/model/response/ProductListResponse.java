package dcode.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductListResponse   {
    private int id;
    private String name;
    private int price;
    private int product_category_id;
    private String category_name;
    private String soldout;
    private int selling_type_id;
    private String selling_type_name;
        
}
