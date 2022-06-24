import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class BankAccountTest {
    private BankAccount account;


    @BeforeEach
    void setUp() {
        account = new BankAccount("Blanche's Current Account", 1000.00);
    }

    // WITHDRAW POSITIVE NUM
    @Test
    void Withdraw_PositiveNumber_ShouldDecreaseBalance(){
        // ACT
        account.withdraw(100.00);
        //ASSERT
        assertEquals(900.00, account.getBalance());

    }
    //DEPOSIT POSITIVE NUM
    @Test
    void Deposit_PositiveNumber_ShouldIncreaseBalance(){
        // ACT
        account.deposit(500.00);
        //ASSERT
        assertEquals(1500.00, account.getBalance());

    }

    // WITHDRAW NEGATIVE NUM
    @Test
    void Withdraw_NegativeNumber_ShouldNotChangeBalance() {
        // ACT
        account.withdraw(-100.00);
        //ASSERT
        assertEquals(1000.00, account.getBalance());
    }

    // DEPOSIT NEGATIVE NUM
    @Test
        void deposit_NegativeNumber_ShouldNotChangeBalance() {
        // ACT
        account.deposit(-200.00);
        //ASSERT
        assertEquals(1000.00, account.getBalance());
    }

    // WITHDRAWS MORE MONEY THAN BALANCE
    @Test
    void withdraw_NumberGreaterThanBalance_ShouldNotChangeBalance() throws IllegalArgumentException{
        // ACT
        // account.withdraw(5000.00);
        // ASSERT
        // assertEquals(1000.00,  account.getBalance(), "Insufficient Fund");

        // 1st argument: the type of exception we are throwing (IllegalArgumentException)
        // 2nd argument: lambda expression that will evaluate the method call
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(5000.00);
        });
    }

}