package strategy;

import java.util.Scanner;

public class Main {
//    Bài 1 — Hệ thống thanh toán (khá điển hình) (strategy-?)
//
//    Hệ thống e-commerce cần hỗ trợ nhiều phương thức thanh toán như:
//
//    Ví điện tử (Momo, ZaloPay)
//    Thẻ tín dụng
//    Chuyển khoản ngân hàng
//
//    Mỗi phương thức có:
//
//    Quy trình xử lý khác nhau
//    API khác nhau
//
//    Trong tương lai:
//
//    Có thể thêm Apple Pay, Google Pay
//
//    Yêu cầu:
//
//    Khi thêm phương thức mới, không được sửa code xử lý chính
//    Tránh dùng if-else để phân loại
//    Code phải dễ test từng phương thức riêng
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PaymentContext paymentContext = new PaymentContext();
            System.out.println("Chọn phương thức thanh toán: ");
            System.out.println("1. Momo");
            System.out.println("2. Thẻ");
            System.out.println("3. Tiền mặt");
            System.out.println(">>");
            int choice = sc.nextInt();
            System.out.println("Nhập số tiền:");
            double amount = sc.nextDouble();
            switch (choice) {
                case 1: {
                    paymentContext.setPaymentStrategy(new MomoPayment());
                    break;
                }
                case 2: {
                    paymentContext.setPaymentStrategy(new CreditPayment());
                    break;
                }
                case 3: {
                    paymentContext.setPaymentStrategy(new CashPayment());
                    break;
                }
            }
            paymentContext.pay(amount);
        }
    }
}
