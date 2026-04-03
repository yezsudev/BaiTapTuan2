package factory_method;

public class Main {
//    🎯 Bài 5 — Hệ thống tạo object theo loại (factory-like nhưng không nói thẳng) (factory method)
//
//    Hệ thống logistics cần tạo các loại phương tiện vận chuyển:
//
//    Xe máy (giao nội thành)
//    Xe tải (giao liên tỉnh)
//    Drone (giao nhanh)
//
//    Mỗi loại:
//
//    Có logic tính phí riêng
//    Có cách vận hành riêng
//
//    Input từ user:
//
//    deliveryType = "bike" | "truck" | "drone"
//
//    Yêu cầu:
//
//    Không tạo object trực tiếp trong business logic
//    Dễ mở rộng thêm loại phương tiện
    public static void main(String[] args) {
        DeliverFactory deliverFactory = new BikeDeliverFactory();
        deliverFactory.calcFee();
        deliverFactory = new CarDeliverFactory();
        deliverFactory.calcFee();
        deliverFactory = new DroneDeliverFactory();
        deliverFactory.calcFee();
    }
}
