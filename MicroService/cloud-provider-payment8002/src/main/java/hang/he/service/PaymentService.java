package hang.he.service;

import hang.he.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Component
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
