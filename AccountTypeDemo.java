public class AccountTypeDemo {
    // Enum dengan konstruktor, kode internal, dan atribut tambahan (interestRate)
    enum AccountType {
        SAVINGS("SA", 0.05),
        CREDIT("CR", 0.18),
        DEPOSIT("DP", 0.08);

        private String code;
        private double interestRate;

        private AccountType(String code, double interestRate) {
            this.code = code;
            this.interestRate = interestRate;
        }

        public String getCode() {
            return code;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Detail Tipe Akun Bank ===");
        for (AccountType type : AccountType.values()) {
            System.out.println("Tipe: " + type.name() + 
                               ", Kode: " + type.getCode() + 
                               ", Suku Bunga: " + (type.getInterestRate() * 100) + "%");
        }
    }
}