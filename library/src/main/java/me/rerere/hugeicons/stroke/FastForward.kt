package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = ImageVector.Builder(
            name = "FastForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.19067f, 16.2995f)
            curveTo(5.99362f, 17.9404f, 4.89509f, 18.7608f, 4.07255f, 18.34f)
            curveTo(3.25f, 17.9192f, 3.25f, 16.5502f, 3.25f, 13.8124f)
            verticalLineTo(10.1873f)
            curveTo(3.25f, 7.4495f, 3.25f, 6.08062f, 4.07255f, 5.6598f)
            curveTo(4.8951f, 5.23897f, 5.99359f, 6.05938f, 8.19057f, 7.7002f)
            curveTo(9.20752f, 8.45971f, 10.2263f, 9.21653f, 11.2386f, 9.9805f)
            curveTo(11.2386f, 7.36072f, 11.2386f, 6.05082f, 12.0453f, 5.62582f)
            curveTo(12.0628f, 5.61659f, 12.0805f, 5.60771f, 12.0984f, 5.59918f)
            curveTo(12.921f, 5.20683f, 13.9497f, 6.00067f, 16.007f, 7.58835f)
            lineTo(18.5961f, 9.5863f)
            curveTo(20.032f, 10.6944f, 20.75f, 11.2485f, 20.75f, 11.9999f)
            curveTo(20.75f, 12.7513f, 20.032f, 13.3054f, 18.5961f, 14.4136f)
            lineTo(16.0072f, 16.4115f)
            curveTo(13.9497f, 17.9993f, 12.921f, 18.7932f, 12.0983f, 18.4008f)
            curveTo(12.0805f, 18.3923f, 12.0628f, 18.3834f, 12.0454f, 18.3742f)
            curveTo(11.2386f, 17.9493f, 11.2386f, 16.6393f, 11.2386f, 14.0193f)
            curveTo(10.2263f, 14.7832f, 9.20759f, 15.54f, 8.19067f, 16.2995f)
            close()
        }
        }.build()

        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
