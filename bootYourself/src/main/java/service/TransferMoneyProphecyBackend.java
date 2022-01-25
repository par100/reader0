package service;

import dao.MoneyDao;
import lombok.RequiredArgsConstructor;
import model.Bank;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TransferMoneyProphecyBackend implements TransferMoneyService {
    private final MoneyDao moneyDao;
    private final ProphetService prophet;

    @Override
    public long transfer(String adresseeName, long amount) {
        Bank bank = moneyDao.findAll().get(0);

        if (bank.getTotalAmount() > amount && prophet.willSurvive(adresseeName)) {
            bank.credit(amount);
            return moneyDao.save(bank).getTotalAmount();
        }
        return -1;
    }
}
