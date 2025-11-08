package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drag01: ImageVector
    get() {
        if (_drag01 != null) {
            return _drag01!!
        }
        _drag01 = ImageVector.Builder(
            name = "Drag01",
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
        moveTo(20.964f, 4f)
        horizontalLineTo(16.9719f)
        moveTo(20.964f, 4f)
        curveTo(20.964f, 4.56018f, 19.4727f, 5.60678f, 18.9679f, 6f)
        moveTo(20.964f, 4f)
        curveTo(20.964f, 3.43982f, 19.4727f, 2.39322f, 18.9679f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.99921f, 4f)
        horizontalLineTo(6.99136f)
        moveTo(2.99921f, 4f)
        curveTo(2.99921f, 3.43982f, 4.49058f, 2.39322f, 4.99529f, 2f)
        moveTo(2.99921f, 4f)
        curveTo(2.99921f, 4.56018f, 4.49058f, 5.60678f, 4.99529f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.81505f, 22.0006f)
        verticalLineTo(21.0595f)
        curveTo(9.81505f, 20.4116f, 9.60526f, 19.781f, 9.21707f, 19.2622f)
        lineTo(5.39435f, 14.1534f)
        curveTo(5.07668f, 13.7288f, 4.83978f, 13.2141f, 4.98565f, 12.7043f)
        curveTo(5.34585f, 11.4454f, 6.76792f, 10.3261f, 8.35901f, 12.2974f)
        lineTo(9.95917f, 14.0049f)
        verticalLineTo(3.59381f)
        curveTo(10.0573f, 1.76459f, 13.1325f, 1.18685f, 13.4504f, 3.59381f)
        verticalLineTo(9.52698f)
        curveTo(14.933f, 9.33608f, 21.9162f, 10.378f, 20.9003f, 14.7917f)
        curveTo(20.8517f, 15.0026f, 20.8032f, 15.2167f, 20.7557f, 15.4279f)
        curveTo(20.5493f, 16.346f, 19.9407f, 17.98f, 19.2696f, 18.9355f)
        curveTo(18.5705f, 19.9309f, 18.897f, 21.5353f, 18.8172f, 22.0019f)
        }
        }.build()

        return _drag01!!
    }

private var _drag01: ImageVector? = null
