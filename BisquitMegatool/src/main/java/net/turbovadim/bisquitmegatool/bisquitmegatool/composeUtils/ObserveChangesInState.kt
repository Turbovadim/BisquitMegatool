package net.turbovadim.bisquitmegatool.composeUtils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun <T> ObserveChangesInState(
    vararg keys: T,
    onKeyChange: () -> Unit
) {
    val previousKeys = remember { mutableStateOf(keys.toList()) }

    if (previousKeys.value != keys.toList()) {
        onKeyChange()
    }

    SideEffect {
        previousKeys.value = keys.toList()
    }
}