package net.turbovadim.bisquitmegatool.utils

fun Long.toMegabytes(): Int {
    return (this / 1024 / 1024).toInt()
}

fun Long.toGigabytes(): Int {
    return (this.toMegabytes() / 1024 )
}

fun Long.toMegabytesDouble(nmFractionDigits: Int): Double {
    return (this.toDouble() / 1024 / 1024).roundTo(nmFractionDigits)
}

fun Long.toGigabytesDouble(nmFractionDigits: Int): Double {
    return (this.toDouble() / 1024 / 1024 / 1024).roundTo(nmFractionDigits)
}