import com.why.sharding.sub.SubApplication;
import com.why.sharding.sub.entity.ProductDesc;
import com.why.sharding.sub.entity.ProductInfo;
import com.why.sharding.sub.entity.StoreInfo;
import com.why.sharding.sub.mapper.ProductDescriptMapper;
import com.why.sharding.sub.mapper.ProductInfoMapper;
import com.why.sharding.sub.mapper.StoreMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SubApplication.class})
public class SpringTest {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Autowired
    private ProductDescriptMapper productDescriptMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Test
    public void insertProductInfo(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setImgUrl("D:/1.jpg");
        productInfo.setPrice(25.64);
        productInfo.setProductName("啦啦啦商品");
        productInfo.setRegionCode("1");
        productInfo.setStoreInfoId(1L);
        productInfo.setSpec("规格1");
//        productInfo.setProductInfoId(1L);
        productInfoMapper.insertProductInfo(productInfo);

        ProductDesc productDescript = new ProductDesc();
        productDescript.setDesc("描述11111");
        productDescript.setProductInfoId(productInfo.getProductInfoId());
        productDescript.setStoreInfoId(1L);
        productDescriptMapper.insertProductDescript(productDescript);
        System.out.println(productDescript.getId());
    }

    @Test
    public void insertStore(){
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setRegionCode("1");
        storeInfo.setReputation(2);
        storeInfo.setStoreName("啦啦啦超市");
        storeMapper.insertStoreInfo(storeInfo);

        System.out.println(storeInfo.getId());
    }
}
