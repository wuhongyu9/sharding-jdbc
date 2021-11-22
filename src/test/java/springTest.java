import com.why.shardingjdbc.Application;
import com.why.shardingjdbc.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class springTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsertOrder(){
        for(int i=1;i<20;i++){
            orderMapper.insertOrder(new BigDecimal(i),1L,"SUCCESS");
        }
    }
}
