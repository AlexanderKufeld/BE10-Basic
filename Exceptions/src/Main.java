import exeptions.BankAccountCountryExeptions;
import exeptions.InvalidAgeException;
import exeptions.InvalidIbanLength;
import model.BankAccount;
import model.Customer;

import java.util.Arrays;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<Customer> customers = Arrays.asList(
                    new Customer("A", 15, new BankAccount("DE11111111111111")),
                    new Customer("B", 17, new BankAccount("DE2222222222222")),
                    new Customer("C", 28, new BankAccount("DE12121212121212")),
                    new Customer("D", 30, new BankAccount("BE12166121212")),
                    new Customer("E", 16, new BankAccount("ES1212121212121"))
            );

            validateCustomers(customers);
        }

        public static void validateCustomers(List<Customer> customers) {
            for (Customer customer:customers){
                System.out.printf("Validating customer %s%n", customer.getName());
                validateCustomer(customer);
            }
        }

        public static void validateCustomer(Customer customer){

            validateBankAccount(customer.getBankAccount());

            try {
                validateCustomerAge(customer.getAge());
            } catch (InvalidAgeException ex) {
                System.out.printf("    Invalid age %d for customer %s%n", customer.getAge(), customer.getName());
            }
        }

        public static void validateCustomerAge(int age)  throws InvalidAgeException {
            if(age<17) {
                throw new InvalidAgeException(String.format("Invalid age %d", age));
            }
        }

        public static void validateBankAccount(BankAccount account) {
            try {
                validateBankAccountCountry(account.getIban());
            } catch (BankAccountCountryExeptions ex) {
                System.out.printf("    Bank account country is not valid %s%n", ex.getMessage());
            }

            try {
                validateIbanLength(account.getIban());
            } catch (InvalidIbanLength ex) {
                System.out.printf("    Invalid iban length %s%n", ex.getMessage());
            }
        }

        public static void validateIbanLength(String iban) throws InvalidIbanLength {
            int length = iban.length();
            if(length != 16) {
                throw new InvalidIbanLength(String.format("Invalid iban length %d", length));
            }
        }

        public static void validateBankAccountCountry(String iban) throws BankAccountCountryExeptions {
            String country = iban.substring(0, 2);
            if(!country.equals("DE")) {
                throw new BankAccountCountryExeptions(String.format("Invalid iban country %s", country));
            }
        }
}

