package Repository;


public class TransferServiceImpl implements TransferService {
    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(float num, String str1, String str2) {
        System.out.println("Transferring data with num " + num + " " + str1 + str2);
    }
}
