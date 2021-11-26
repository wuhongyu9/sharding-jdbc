import com.why.shardingjdbc.Application;
import com.why.shardingjdbc.entity.Order;
import com.why.shardingjdbc.mapper.OrderMapper;
import com.why.shardingjdbc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class springTest {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertOrder(){
        for(int i=1;i<20;i++){
            orderMapper.insertOrder(new BigDecimal(i),Long.parseLong(""+(i + 1)),"SUCCESS");
        }
    }

    @Test
    public void selectInsertOrder(){
        List<Long> ids = new ArrayList<>();
        ids.add(669855768828182529L);
        List<Order> orders = orderMapper.getOrders(ids);
        orders.stream().forEach(order -> {
            System.out.println(order);
        });
    }

    @Test
    public void orderTestByOrder(){
        List<Order> orders = orderMapper.orderById();
        orders.stream().forEach(
                order->{
                    System.out.println(order);
                }
        );
    }

    @Test
    public void insertUser(){
        userMapper.insertUser(1L,"wuhongyu",24);
    }
}
