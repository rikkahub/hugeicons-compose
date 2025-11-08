package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MicOff01: ImageVector
    get() {
        if (_micOff01 != null) {
            return _micOff01!!
        }
        _micOff01 = ImageVector.Builder(
            name = "MicOff01",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 11f)
        curveTo(4f, 15.4183f, 7.58172f, 19f, 12f, 19f)
        moveTo(12f, 19f)
        curveTo(13.9545f, 19f, 15.7454f, 18.2991f, 17.1348f, 17.1348f)
        moveTo(12f, 19f)
        verticalLineTo(22f)
        moveTo(12f, 22f)
        horizontalLineTo(15f)
        moveTo(12f, 22f)
        horizontalLineTo(9f)
        moveTo(20f, 11f)
        curveTo(20f, 12.6514f, 19.4996f, 14.1859f, 18.6422f, 15.4603f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0078f, 6.99599f)
        curveTo(17.0078f, 4.23457f, 14.7692f, 2.01599f, 12.0078f, 2.01599f)
        curveTo(10.139f, 2.01599f, 8.5379f, 2.98126f, 7.67981f, 4.49999f)
        moveTo(17.0078f, 6.99599f)
        lineTo(13.9798f, 7.00799f)
        moveTo(17.0078f, 6.99599f)
        verticalLineTo(11.004f)
        moveTo(7.00781f, 6.99599f)
        verticalLineTo(11.016f)
        curveTo(7.00781f, 13.7774f, 9.24639f, 16.016f, 12.0078f, 16.016f)
        curveTo(13.1432f, 16.016f, 14.1725f, 15.6256f, 15.0118f, 14.988f)
        moveTo(16.4465f, 13.26f)
        curveTo(16.8051f, 12.5705f, 17.0078f, 11.8469f, 17.0078f, 11.016f)
        verticalLineTo(11.004f)
        moveTo(14.1829f, 11.004f)
        horizontalLineTo(17.0078f)
        }
        }.build()

        return _micOff01!!
    }

private var _micOff01: ImageVector? = null
