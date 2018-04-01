package com.sdust.ssm.thread.synchrnized;

/**
 * Created by LiuYuanZhe on 18/3/31.
 */
public class Shop implements Runnable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer product=0;
    static final int MAX_PRODUCT = 100;
    static final int MIN_PRODUCT = 0;
    public void produce(int num) throws Exception{
        while (true){
            synchronized (product){
                if(this.product >= MAX_PRODUCT){
                    try {
                        product.wait();
                        System.out.println("产品已满,请稍后生产,当前商品个数:"+this.product);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    return;
                }
                for (int i = 0;i<num;i++){
                    this.product++;
                    System.out.println("生产者生产第"+this.product+"个商品");
                }
                product.notifyAll();
            }
            Thread.sleep(1000);
        }

    }
    public void consume() throws Exception{
        while (true){
            synchronized (product){
                if(this.product <= MIN_PRODUCT){
                    try {
                        product.wait();
                        System.out.println("缺货,稍后再取,当前商品个数:"+this.product);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    return;
                }
                System.out.println("消费者消费第"+this.product+"个商品");
                this.product--;
                product.notifyAll();
            }
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        try {
            if("produce".equals(name)){
                produce(1);
            }else if ("consume".equals(name)){
                consume();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Shop shop = new Shop();
            shop.setName("produce");
            Thread t1 = new Thread(shop);
            Thread t4 = new Thread(shop);
            t1.start();
            t4.start();
            Thread.sleep(1);
            shop.setName("consume");
            Thread t2 = new Thread(shop);
            Thread t3 = new Thread(shop);
            t2.start();
            t3.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
