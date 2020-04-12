package cn.bruce.test.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="mailto:chen.lingqi@xlink.cn">Bruce</a>
 * @date 2020/4/8
 */
public class CustomThreadPoolExecutor {

    private ThreadPoolExecutor pool = null;

    public static void main(String[] args) {
        CustomThreadPoolExecutor executor = new CustomThreadPoolExecutor();

        executor.init();

        ExecutorService poolExecutor = executor.getCustomThreadPoolExecutor();

        for (int i = 0; i < 100; i++) {
            System.out.println("提交第" + i + "个任务");
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Task is running========");
                        Thread.sleep(3000);
                    } catch (Exception e) {
                    	e.printStackTrace();
                    }
                }
            });
        }
    }

    private void init() {
        pool = new ThreadPoolExecutor(10,
                30,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                new CustomThreadFactory(),
                new CustomRejectedExecutionHandler());
    }

    public void destory() {
        if (pool != null) {
            pool.shutdownNow();
        }
    }

    public ExecutorService getCustomThreadPoolExecutor() {
        return this.pool;
    }

    private class CustomRejectedExecutionHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Rejected execution...");
        }
    }

    private class CustomThreadFactory implements ThreadFactory {

        private AtomicInteger count = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            String threadName = CustomThreadPoolExecutor.class.getSimpleName() + count.getAndIncrement();

            System.out.println(threadName);
            thread.setName(threadName);
            return thread;
        }
    }

}
