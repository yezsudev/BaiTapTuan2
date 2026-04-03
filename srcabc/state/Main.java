package state;

import java.util.Scanner;

public class Main {
//    🎯 Bài 2 — Quản lý trạng thái đơn hàng (logic phức tạp) (state)
//
//    Một đơn hàng có vòng đời:
//
//    Created → Paid → Shipped → Delivered
//           ↘
//    Cancelled
//
//    Mỗi trạng thái:
//
//    Cho phép hoặc không cho phép một số hành động
//    Ví dụ:
//    Đã Shipped → không được Cancel
//    Created → có thể Cancel
//
//    Yêu cầu:
//
//    Không dùng if-else để kiểm tra trạng thái
//    Mỗi trạng thái có hành vi riêng
//    Dễ mở rộng nếu thêm trạng thái mới
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice = -1;
            Order order = new Order();
            do {
                System.out.println("0. Exit");
                System.out.println("1. pay");
                System.out.println("2. ship");
                System.out.println("3. deliver");
                System.out.println("4. cancel");
                System.out.println("5. view state");
                System.out.println(">>");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        order.pay();
                        break;
                    }
                    case 2: {
                        order.ship();
                        break;
                    }
                    case 3: {
                        order.deliver();
                        break;
                    }
                    case 4: {
                        order.cancel();
                        break;
                    }
                    case 5: {
                        System.out.println(order.viewState());;
                        break;
                    }
                }
            } while ((choice != 0));
        }
    }
}
