package observer;

public class Main {
//🎯 Bài 3 — Hệ thống notification đa kênh (observer)
//
//    Khi có sự kiện “OrderCreated”, hệ thống cần:
//
//    Gửi email cho khách
//    Gửi SMS
//    Gửi thông báo app
//
//    Trong tương lai:
//
//    Có thể thêm Slack, Telegram, Webhook
//
//    Yêu cầu:
//
//    Khi thêm kênh mới, không sửa code xử lý event chính
//    Các kênh hoạt động độc lập
//    Có thể bật/tắt từng kênh
    public static void main(String[] args) {
        OrderPublisher orderPublisher = new OrderPublisher();
        OrderSubscriber smsSubscriber = new SMSNotifier();
        orderPublisher.subscribe(smsSubscriber);
        orderPublisher.subscribe(new EmailNotifier());
        orderPublisher.subscribe(new AppNotifier());
        orderPublisher.createOrder();

        orderPublisher.unsubscribe(smsSubscriber);
        orderPublisher.createOrder();
    }
}
