package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Progress04: ImageVector
    get() {
        if (_progress04 != null) {
            return _progress04!!
        }
        _progress04 = ImageVector.Builder(
            name = "Progress04",
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
        moveTo(12f, 4.5f)
        curveTo(13.4834f, 4.5f, 14.9334f, 4.93987f, 16.1668f, 5.76398f)
        curveTo(17.4001f, 6.58809f, 18.3614f, 7.75943f, 18.9291f, 9.12987f)
        curveTo(19.4968f, 10.5003f, 19.6453f, 12.0083f, 19.3559f, 13.4632f)
        curveTo(19.0665f, 14.918f, 18.3522f, 16.2544f, 17.3033f, 17.3033f)
        curveTo(16.2544f, 18.3522f, 14.918f, 19.0665f, 13.4632f, 19.3559f)
        curveTo(12.0083f, 19.6453f, 10.5003f, 19.4968f, 9.12987f, 18.9291f)
        curveTo(7.75943f, 18.3614f, 6.58809f, 17.4001f, 5.76398f, 16.1668f)
        curveTo(4.93987f, 14.9334f, 4.5f, 13.4834f, 4.5f, 12f)
        horizontalLineTo(12f)
        verticalLineTo(4.5f)
        }
        }.build()

        return _progress04!!
    }

private var _progress04: ImageVector? = null
