class OrderProcessing extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() +
                " - Priority: " +
                getPriority() +
                " - Processing customer order"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class DeliveryTracking extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() +
                " - Priority: " +
                getPriority() +
                " - Tracking delivery location"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class Notification extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                getName() +
                " - Priority: " +
                getPriority() +
                " - Sending order notification"
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class FoodDelivery {

    public static void main(String[] args) {

        OrderProcessing order =
            new OrderProcessing();

        DeliveryTracking delivery =
            new DeliveryTracking();

        Notification notification =
            new Notification();

        
        order.setName("OrderProcessing");
        delivery.setName("DeliveryTracking");
        notification.setName("Notification");

        
        order.setPriority(Thread.MAX_PRIORITY);
        delivery.setPriority(Thread.NORM_PRIORITY);
        notification.setPriority(Thread.MIN_PRIORITY);

        
        System.out.println(
            order.getName() +
            " Priority: " +
            order.getPriority()
        );

        System.out.println(
            delivery.getName() +
            " Priority: " +
            delivery.getPriority()
        );

        System.out.println(
            notification.getName() +
            " Priority: " +
            notification.getPriority()
        );

        System.out.println("\nThreads Started...\n");

        
        order.start();
        delivery.start();
        notification.start();
    }
}