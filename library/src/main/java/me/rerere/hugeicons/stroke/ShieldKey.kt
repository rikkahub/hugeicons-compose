package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShieldKey: ImageVector
    get() {
        if (_shieldKey != null) {
            return _shieldKey!!
        }
        _shieldKey = ImageVector.Builder(
            name = "ShieldKey",
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
        moveTo(18.7088f, 3.49534f)
        curveTo(16.8164f, 2.55382f, 14.5008f, 2f, 11.9999f, 2f)
        curveTo(9.49904f, 2f, 7.18344f, 2.55382f, 5.2911f, 3.49534f)
        curveTo(4.36312f, 3.95706f, 3.89913f, 4.18792f, 3.44954f, 4.91378f)
        curveTo(2.99994f, 5.63965f, 2.99994f, 6.34248f, 2.99994f, 7.74814f)
        verticalLineTo(11.2371f)
        curveTo(2.99994f, 16.9205f, 7.54229f, 20.0804f, 10.173f, 21.4338f)
        curveTo(10.9066f, 21.8113f, 11.2734f, 22f, 11.9999f, 22f)
        curveTo(12.7264f, 22f, 13.0932f, 21.8113f, 13.8269f, 21.4338f)
        curveTo(16.4576f, 20.0804f, 20.9999f, 16.9205f, 20.9999f, 11.2371f)
        lineTo(20.9999f, 7.74814f)
        curveTo(20.9999f, 6.34249f, 20.9999f, 5.63966f, 20.5503f, 4.91378f)
        curveTo(20.1007f, 4.18791f, 19.6367f, 3.95706f, 18.7088f, 3.49534f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 11f)
        curveTo(13.1045f, 11f, 13.9999f, 10.1046f, 13.9999f, 9f)
        curveTo(13.9999f, 7.89543f, 13.1045f, 7f, 11.9999f, 7f)
        curveTo(10.8954f, 7f, 9.99994f, 7.89543f, 9.99994f, 9f)
        curveTo(9.99994f, 10.1046f, 10.8954f, 11f, 11.9999f, 11f)
        moveTo(11.9999f, 11f)
        verticalLineTo(13.5f)
        moveTo(13.9999f, 16f)
        horizontalLineTo(12.9999f)
        curveTo(12.4477f, 16f, 11.9999f, 15.5523f, 11.9999f, 15f)
        verticalLineTo(13.5f)
        moveTo(11.9999f, 13.5f)
        horizontalLineTo(13.4999f)
        }
        }.build()

        return _shieldKey!!
    }

private var _shieldKey: ImageVector? = null
