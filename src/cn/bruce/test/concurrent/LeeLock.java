package cn.bruce.test.concurrent;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author <a href="mailto:chen.lingqi@xlink.cn">Bruce</a>
 * @date 2020/4/11
 */
public class LeeLock {

    private static class Sync extends AbstractQueuedSynchronizer {

        @Override
        protected boolean tryAcquire(int arg) {
            return compareAndSetState(0, 1);
        }

        @Override
        protected boolean tryRelease(int arg) {
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }
    }

    private Sync sync = new Sync();

    public void lock() {
        sync.acquire(1);
    }

    public void unlock() {
        sync.release(1);
    }

}
