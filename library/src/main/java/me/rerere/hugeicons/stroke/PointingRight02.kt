package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingRight02: ImageVector
    get() {
        if (_pointingRight02 != null) {
            return _pointingRight02!!
        }
        _pointingRight02 = ImageVector.Builder(
            name = "PointingRight02",
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
        moveTo(2f, 19.8917f)
        horizontalLineTo(3.61802f)
        curveTo(4.54364f, 19.8917f, 5.51198f, 20.6158f, 6.31081f, 20.9983f)
        curveTo(7.78747f, 21.7055f, 10.6774f, 22.6731f, 12.0382f, 21.3209f)
        curveTo(14.1833f, 19.1893f, 14.576f, 16.2081f, 14.5f, 14.4999f)
        lineTo(20.25f, 14.4999f)
        curveTo(21.2165f, 14.4999f, 22f, 13.7164f, 22f, 12.7499f)
        curveTo(22f, 11.7834f, 21.2165f, 10.9999f, 20.25f, 10.9999f)
        lineTo(13.9999f, 10.9999f)
        moveTo(13.9999f, 10.9999f)
        lineTo(10f, 10.9999f)
        moveTo(13.9999f, 10.9999f)
        curveTo(13.9823f, 10.9765f, 11.8247f, 8.12164f, 10.3914f, 7.62367f)
        curveTo(9.10844f, 7.17793f, 7.96635f, 8.03229f, 6.90859f, 8.67457f)
        curveTo(6.08953f, 9.1719f, 4.06844f, 11f, 2.99509f, 11f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4.5f)
        lineTo(16f, 4.5f)
        moveTo(22f, 4.5f)
        curveTo(22f, 3.79977f, 20.0057f, 2.49153f, 19.5f, 2f)
        moveTo(22f, 4.5f)
        curveTo(22f, 5.20023f, 20.0057f, 6.50847f, 19.5f, 7f)
        }
        }.build()

        return _pointingRight02!!
    }

private var _pointingRight02: ImageVector? = null
