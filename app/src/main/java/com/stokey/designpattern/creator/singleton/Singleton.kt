package com.stokey.designpattern.creator.singleton

/**
 * Created by stokey on 2017/8/5.
 */

/**
 * 饿汉单例模式
 */
object PlainOldSingleton{

}

/**
 * 懒汉单例模式，非线程安全
 */
class LazyNotThreadSafe{
    companion object {
        val instance by lazy(LazyThreadSafetyMode.NONE) {
            LazyNotThreadSafe()
        }

        // Java等价写法，获取单利使用get方法
        private var instance2: LazyNotThreadSafe? = null

        fun get(): LazyNotThreadSafe {
            if (instance2 == null) {
                instance2 = LazyNotThreadSafe()
            }
            return instance2!!
        }
    }
}

/**
 * 懒汉单例模式，线程安全
 */
class LazyThreadSafeSynchronized{
    companion object {
        private var instance: LazyThreadSafeSynchronized? = null

        @Synchronized
        fun get(): LazyThreadSafeSynchronized {
            if (instance == null) instance = LazyThreadSafeSynchronized()
            return instance!!
        }
    }
}

/**
 * 双重校验
 */
class LazyThreadSafeDoubleCheck {
    companion object {
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            LazyThreadSafeDoubleCheck()
        }

        // Java等价方法，使用get()方法调用单例
        private @Volatile var instance2: LazyThreadSafeDoubleCheck? = null
        fun get(): LazyThreadSafeDoubleCheck {
            if (instance2 == null){
                synchronized(this){
                    if (instance2 == null){
                        instance2 = LazyThreadSafeDoubleCheck()
                    }
                }
            }
            return instance2!!
        }

    }
}

/**
 * 静态内部类单例模式
 */
class LazyThreadSafeStaticInnerObject{
    private object Holder{
        val instance = LazyThreadSafeStaticInnerObject()
    }

    companion object {
        fun getInstance() = Holder.instance
    }
}

/**
 * 枚举单例模式
 */
enum class EnumSingleton{
    INSTANCE;
    fun get():EnumSingleton{
        return INSTANCE
    }
}