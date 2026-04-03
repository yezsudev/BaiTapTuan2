package decorator;

public class Main {
//    🎯 Bài 4 — Hệ thống giảm giá phức tạp (decorator)
//
//    Một đơn hàng có thể áp dụng nhiều loại giảm giá:
//
//    Giảm 10%
//    Giảm 50.000đ
//            Freeship
//    Voucher riêng
//
//    Các loại giảm giá:
//
//    Có thể áp dụng cùng lúc
//    Có thể thay đổi thứ tự áp dụng
//
//    Yêu cầu:
//
//    Không sửa code tính giá gốc
//    Có thể kết hợp linh hoạt các loại giảm giá
//    Dễ thêm loại mới
    public static void main(String[] args) {
        BaseDiscountComponent order = new Order(190_000);
        System.out.println("Original price: " + order.getPrice());
        order = new TenPercentDiscountDecorator(order);
        order = new FiftyThousandDiscountDecorator(order);
        System.out.println("Price after use discount: " + order.getPrice());
    }
}
