package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SolarPanel01: ImageVector
    get() {
        if (_solarPanel01 != null) {
            return _solarPanel01!!
        }
        _solarPanel01 = ImageVector.Builder(
            name = "SolarPanel01",
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
        moveTo(15.6745f, 4f)
        horizontalLineTo(8.32553f)
        curveTo(6.86148f, 4f, 6.12945f, 4f, 5.56252f, 4.41264f)
        curveTo(4.99559f, 4.82528f, 4.72372f, 5.55596f, 4.17998f, 7.01733f)
        lineTo(3.287f, 9.41732f)
        curveTo(2.1773f, 12.3998f, 1.62245f, 13.891f, 2.28654f, 14.9455f)
        curveTo(2.95062f, 16f, 4.4446f, 16f, 7.43256f, 16f)
        horizontalLineTo(16.5674f)
        curveTo(19.5554f, 16f, 21.0494f, 16f, 21.7135f, 14.9455f)
        curveTo(22.3775f, 13.891f, 21.8227f, 12.3998f, 20.713f, 9.41732f)
        lineTo(19.82f, 7.01732f)
        curveTo(19.2763f, 5.55596f, 19.0044f, 4.82528f, 18.4375f, 4.41264f)
        curveTo(17.8706f, 4f, 17.1385f, 4f, 15.6745f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(20f)
        moveTo(12f, 20f)
        horizontalLineTo(15f)
        moveTo(12f, 20f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 4f)
        lineTo(8f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 4f)
        lineTo(16f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 10f)
        horizontalLineTo(3.5f)
        }
        }.build()

        return _solarPanel01!!
    }

private var _solarPanel01: ImageVector? = null
