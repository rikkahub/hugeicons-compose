package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowShrink: ImageVector
    get() {
        if (_arrowShrink != null) {
            return _arrowShrink!!
        }
        _arrowShrink = ImageVector.Builder(
            name = "ArrowShrink",
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
        moveTo(14.2297f, 17.9947f)
        curveTo(14.2192f, 17.2447f, 13.704f, 14.7612f, 14.2305f, 14.2347f)
        curveTo(14.7571f, 13.7083f, 17.2398f, 14.2247f, 17.9895f, 14.2355f)
        moveTo(20.9995f, 20.9981f)
        lineTo(14.6147f, 14.6146f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.76961f, 17.9944f)
        curveTo(9.78011f, 17.2445f, 10.2953f, 14.761f, 9.76881f, 14.2344f)
        curveTo(9.24228f, 13.708f, 6.75956f, 14.2245f, 6.00985f, 14.2352f)
        moveTo(2.99981f, 20.9978f)
        lineTo(9.38459f, 14.6144f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00746f, 9.76133f)
        curveTo(6.75719f, 9.7709f, 9.24073f, 10.2832f, 9.76644f, 9.75585f)
        curveTo(10.2921f, 9.22853f, 9.77264f, 6.74581f, 9.76096f, 5.99592f)
        moveTo(9.37696f, 9.36743f)
        lineTo(3.00176f, 3.00244f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9916f, 9.76133f)
        curveTo(17.2419f, 9.7709f, 14.7584f, 10.2832f, 14.2326f, 9.75585f)
        curveTo(13.707f, 9.22853f, 14.2264f, 6.74581f, 14.2381f, 5.99592f)
        moveTo(14.6221f, 9.36743f)
        lineTo(20.9973f, 3.00244f)
        }
        }.build()

        return _arrowShrink!!
    }

private var _arrowShrink: ImageVector? = null
