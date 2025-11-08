package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeft05: ImageVector
    get() {
        if (_arrowLeft05 != null) {
            return _arrowLeft05!!
        }
        _arrowLeft05 = ImageVector.Builder(
            name = "ArrowLeft05",
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
        moveTo(4.00002f, 5.99951f)
        lineTo(4.00005f, 18.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4968f, 12.0109f)
        verticalLineTo(12.3814f)
        curveTo(12.5374f, 15.3525f, 12.4024f, 16.3847f, 11.1519f, 15.9055f)
        lineTo(10.8438f, 15.7236f)
        lineTo(10.5952f, 15.5508f)
        lineTo(10.06f, 15.1378f)
        lineTo(9.0596f, 14.2685f)
        lineTo(8.03672f, 13.4047f)
        lineTo(7.53672f, 12.9516f)
        lineTo(7.31406f, 12.7251f)
        lineTo(7.05189f, 12.346f)
        lineTo(6.99807f, 12.0097f)
        lineTo(7.05189f, 11.6757f)
        lineTo(7.31406f, 11.2967f)
        lineTo(7.53672f, 11.0701f)
        lineTo(8.03672f, 10.617f)
        lineTo(9.0596f, 9.75323f)
        lineTo(10.06f, 8.8839f)
        lineTo(10.5952f, 8.47091f)
        lineTo(10.8438f, 8.29813f)
        lineTo(11.1519f, 8.11621f)
        curveTo(12.4024f, 7.63699f, 12.5374f, 8.66922f, 12.4968f, 11.6403f)
        verticalLineTo(12.0109f)
        moveTo(12.4968f, 12.0109f)
        horizontalLineTo(19.9998f)
        }
        }.build()

        return _arrowLeft05!!
    }

private var _arrowLeft05: ImageVector? = null
