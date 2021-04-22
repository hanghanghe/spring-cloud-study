package hang.he.service.impl;

import hang.he.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "fallback提示：ok方法异常";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "fallback提示：timeout方法异常";
    }
}
