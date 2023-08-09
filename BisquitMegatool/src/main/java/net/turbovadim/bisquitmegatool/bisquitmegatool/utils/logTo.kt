package net.turbovadim.bisquitmegatool.utils

import android.util.Log

fun Any.logTo(tag: String = "mylog") {
    Log.d(tag, this.toString())
}