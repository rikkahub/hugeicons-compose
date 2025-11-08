package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Poop: ImageVector
    get() {
        if (_poop != null) {
            return _poop!!
        }
        _poop = ImageVector.Builder(
            name = "Poop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.2007f, 14f)
        curveTo(20.3305f, 14.8357f, 21f, 15.8744f, 21f, 17f)
        curveTo(21f, 19.7614f, 16.9706f, 22f, 12f, 22f)
        curveTo(7.02944f, 22f, 3f, 19.7614f, 3f, 17f)
        curveTo(3f, 15.8744f, 3.6695f, 14.8357f, 4.79934f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.7585f, 8f)
        curveTo(11.2229f, 7.11636f, 9.9284f, 6.78583f, 8.89652f, 6.79725f)
        moveTo(8.89652f, 6.79725f)
        curveTo(7.009f, 6.81815f, 6f, 7.9832f, 6f, 9f)
        curveTo(6f, 10.6569f, 8.59363f, 12f, 11.793f, 12f)
        curveTo(14.9924f, 12f, 16.8707f, 10.4819f, 17.5861f, 9f)
        curveTo(19.0343f, 6f, 16.6206f, 2.5f, 11.3103f, 2f)
        curveTo(12.4367f, 3.36484f, 13.531f, 6.23506f, 8.89652f, 6.79725f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0144f, 10f)
        curveTo(18.8351f, 10.7211f, 20f, 11.8265f, 20f, 13.0657f)
        curveTo(20f, 15.2386f, 16.4183f, 17f, 12f, 17f)
        curveTo(7.58172f, 17f, 4f, 15.2386f, 4f, 13.0657f)
        curveTo(4f, 11.9588f, 4.92955f, 10.9586f, 6.42571f, 10.2437f)
        }
        }.build()

        return _poop!!
    }

private var _poop: ImageVector? = null
