package Repository;

import org.springframework.stereotype.Component;

@Component
public interface TransferService {

    void transfer(float num, String str1, String str2);

}
