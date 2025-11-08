package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) {
            return _batteryEmpty!!
        }
        _batteryEmpty = ImageVector.Builder(
            name = "BatteryEmpty",
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
        moveTo(2f, 12f)
        curveTo(2f, 9.17157f, 2f, 7.75736f, 2.87868f, 6.87868f)
        curveTo(3.75736f, 6f, 5.17157f, 6f, 8f, 6f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 6f, 17.2426f, 6f, 18.1213f, 6.87868f)
        curveTo(19f, 7.75736f, 19f, 9.17157f, 19f, 12f)
        curveTo(19f, 14.8284f, 19f, 16.2426f, 18.1213f, 17.1213f)
        curveTo(17.2426f, 18f, 15.8284f, 18f, 13f, 18f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 18f, 3.75736f, 18f, 2.87868f, 17.1213f)
        curveTo(2f, 16.2426f, 2f, 14.8284f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9.5f)
        lineTo(20.0272f, 9.6712f)
        curveTo(20.7085f, 9.78475f, 21.0491f, 9.84152f, 21.3076f, 10.0067f)
        curveTo(21.5618f, 10.1691f, 21.7612f, 10.4044f, 21.8796f, 10.6819f)
        curveTo(22f, 10.964f, 22f, 11.3093f, 22f, 12f)
        curveTo(22f, 12.6907f, 22f, 13.036f, 21.8796f, 13.3181f)
        curveTo(21.7612f, 13.5956f, 21.5618f, 13.8309f, 21.3076f, 13.9933f)
        curveTo(21.0491f, 14.1585f, 20.7085f, 14.2153f, 20.0272f, 14.3288f)
        lineTo(19f, 14.5f)
        }
        }.build()

        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
