package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SolarPanel04: ImageVector
    get() {
        if (_solarPanel04 != null) {
            return _solarPanel04!!
        }
        _solarPanel04 = ImageVector.Builder(
            name = "SolarPanel04",
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
        moveTo(8.5f, 9.00005f)
        horizontalLineTo(7.73252f)
        curveTo(6.63802f, 9.00005f, 6.09077f, 9.00005f, 5.67127f, 9.33394f)
        curveTo(5.25177f, 9.66783f, 5.05962f, 10.2563f, 4.67531f, 11.4333f)
        lineTo(3.85904f, 13.9333f)
        curveTo(3.10748f, 16.2351f, 2.7317f, 17.386f, 3.21864f, 18.193f)
        curveTo(3.70558f, 19.0001f, 4.7758f, 19.0001f, 6.91624f, 19.0001f)
        horizontalLineTo(17.0838f)
        curveTo(19.2242f, 19.0001f, 20.2944f, 19.0001f, 20.7814f, 18.193f)
        curveTo(21.2683f, 17.386f, 20.8925f, 16.2351f, 20.141f, 13.9333f)
        lineTo(19.3247f, 11.4333f)
        curveTo(18.9404f, 10.2563f, 18.7482f, 9.66783f, 18.3287f, 9.33394f)
        curveTo(17.9092f, 9.00005f, 17.362f, 9.00005f, 16.2675f, 9.00005f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11.5001f)
        verticalLineTo(19.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(22f)
        moveTo(12f, 22f)
        horizontalLineTo(14f)
        moveTo(12f, 22f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 2f)
        lineTo(10f, 5.5f)
        horizontalLineTo(14f)
        lineTo(11.5f, 9f)
        }
        }.build()

        return _solarPanel04!!
    }

private var _solarPanel04: ImageVector? = null
