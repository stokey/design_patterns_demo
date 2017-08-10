package com.stokey.designpattern.creator.singleton;

/**
 * Created by stokey on 2017/8/5.
 */

public class Singleton {

    /**
     * 饿汉单例模式
     */
    static class PlainOldSingleton {
        private static Singleton INSTANCE = new Singleton();

        private PlainOldSingleton() {
        }

        public static Singleton getInstance() {
            return INSTANCE;
        }

    }

    /**
     * 懒汉单例模式（变种）,非线程安全
     */
    static class LazyNotThreadSafe {
        private static LazyNotThreadSafe INSTANCE;

        private LazyNotThreadSafe() {
        }

        public static LazyNotThreadSafe getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new LazyNotThreadSafe();
            }
            return INSTANCE;
        }
    }

    /**
     * 懒汉单例模式,线程安全
     */
    static class LazyThreadSafeSynchronized {
        private static LazyThreadSafeSynchronized INSTANCE;

        private LazyThreadSafeSynchronized() {
        }

        public static synchronized LazyThreadSafeSynchronized getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new LazyThreadSafeSynchronized();
            }
            return INSTANCE;
        }
    }

    /**
     * 双重校验锁
     */
    static class LazyThreadSafeDoubleCheck {
        private static volatile LazyThreadSafeDoubleCheck INSTANCE;

        private LazyThreadSafeDoubleCheck() {
        }

        public static LazyThreadSafeDoubleCheck getInstance() {
            if (INSTANCE == null) {
                synchronized (LazyThreadSafeDoubleCheck.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new LazyThreadSafeDoubleCheck();
                    }
                }
            }
            return INSTANCE;
        }
    }

    /**
     * 静态内部类
     */
    static class LazyThreadSafeStaticInnerClass {
        private static class Holder {
            private static LazyThreadSafeStaticInnerClass INSTANCE = new LazyThreadSafeStaticInnerClass();
        }

        private LazyThreadSafeStaticInnerClass() {
        }

        public static LazyThreadSafeStaticInnerClass getIntance() {
            return Holder.INSTANCE;
        }
    }

    /**
     * 枚举
     */
    static enum EnumSingleton {
        INSTANCE;

        public static EnumSingleton getInstance() {
            return INSTANCE;
        }
    }
}


