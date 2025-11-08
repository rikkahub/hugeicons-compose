package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GpsOff02: ImageVector
    get() {
        if (_gpsOff02 != null) {
            return _gpsOff02!!
        }
        _gpsOff02 = ImageVector.Builder(
            name = "GpsOff02",
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
        moveTo(20.5139f, 11.9999f)
        curveTo(20.5139f, 16.6944f, 16.7083f, 20.4999f, 12.0139f, 20.4999f)
        curveTo(7.31943f, 20.4999f, 3.51385f, 16.6944f, 3.51385f, 11.9999f)
        curveTo(3.51385f, 7.30552f, 7.31943f, 3.49994f, 12.0139f, 3.49994f)
        curveTo(16.7083f, 3.49994f, 20.5139f, 7.30552f, 20.5139f, 11.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0002f, 9f)
        lineTo(9.00019f, 15f)
        moveTo(15.0002f, 15f)
        lineTo(9.00019f, 9f)
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
        }.build()

        return _gpsOff02!!
    }

private var _gpsOff02: ImageVector? = null
