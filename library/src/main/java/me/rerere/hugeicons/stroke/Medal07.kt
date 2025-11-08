package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Medal07: ImageVector
    get() {
        if (_medal07 != null) {
            return _medal07!!
        }
        _medal07 = ImageVector.Builder(
            name = "Medal07",
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
        moveTo(11f, 11f)
        lineTo(6.19145f, 8.93919f)
        curveTo(5.24455f, 8.53338f, 4.7711f, 8.33047f, 4.46382f, 7.96189f)
        curveTo(4.3681f, 7.84708f, 4.28556f, 7.7219f, 4.21773f, 7.58869f)
        curveTo(4f, 7.16107f, 4f, 6.64597f, 4f, 5.61577f)
        curveTo(4f, 4.10079f, 4f, 3.34331f, 4.38928f, 2.81443f)
        curveTo(4.50876f, 2.6521f, 4.6521f, 2.50876f, 4.81443f, 2.38928f)
        curveTo(5.34331f, 2f, 6.10079f, 2f, 7.61577f, 2f)
        horizontalLineTo(16.3842f)
        curveTo(17.8992f, 2f, 18.6567f, 2f, 19.1856f, 2.38928f)
        curveTo(19.3479f, 2.50876f, 19.4912f, 2.6521f, 19.6107f, 2.81443f)
        curveTo(20f, 3.34331f, 20f, 4.10079f, 20f, 5.61577f)
        curveTo(20f, 6.64597f, 20f, 7.16107f, 19.7823f, 7.58869f)
        curveTo(19.7144f, 7.7219f, 19.6319f, 7.84708f, 19.5362f, 7.96189f)
        curveTo(19.2289f, 8.33047f, 18.7555f, 8.53338f, 17.8085f, 8.93919f)
        lineTo(13f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        verticalLineTo(2f)
        }
        }.build()

        return _medal07!!
    }

private var _medal07: ImageVector? = null
