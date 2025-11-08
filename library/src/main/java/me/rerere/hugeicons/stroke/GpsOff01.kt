package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GpsOff01: ImageVector
    get() {
        if (_gpsOff01 != null) {
            return _gpsOff01!!
        }
        _gpsOff01 = ImageVector.Builder(
            name = "GpsOff01",
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
        moveTo(18.0172f, 18.0169f)
        curveTo(16.4796f, 19.5511f, 14.3574f, 20.4997f, 12.0137f, 20.4997f)
        curveTo(7.31925f, 20.4997f, 3.51367f, 16.6941f, 3.51367f, 11.9997f)
        curveTo(3.51367f, 9.65593f, 4.46225f, 7.53375f, 5.99643f, 5.99609f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.5f, 12f)
        horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 12f)
        horizontalLineTo(1.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 1.5f)
        lineTo(12f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 20.5f)
        verticalLineTo(22.5f)
        }

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
        moveTo(8.33594f, 4.32282f)
        curveTo(9.4491f, 3.79546f, 10.6968f, 3.5f, 12.0145f, 3.5f)
        curveTo(16.709f, 3.5f, 20.5145f, 7.24977f, 20.5145f, 11.8753f)
        curveTo(20.5145f, 13.1738f, 20.2147f, 14.4032f, 19.6795f, 15.5f)
        }
        }.build()

        return _gpsOff01!!
    }

private var _gpsOff01: ImageVector? = null
