package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GymnasticRings: ImageVector
    get() {
        if (_gymnasticRings != null) {
            return _gymnasticRings!!
        }
        _gymnasticRings = ImageVector.Builder(
            name = "GymnasticRings",
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
        moveTo(16.5f, 22f)
        curveTo(19.5376f, 22f, 22f, 19.5376f, 22f, 16.5f)
        curveTo(22f, 13.4624f, 19.5376f, 11f, 16.5f, 11f)
        curveTo(13.4624f, 11f, 11f, 13.4624f, 11f, 16.5f)
        curveTo(11f, 19.5376f, 13.4624f, 22f, 16.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 11f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9.30301f)
        curveTo(10.9999f, 7.90869f, 9.36299f, 7f, 7.51337f, 7f)
        curveTo(4.46842f, 7f, 2f, 9.46269f, 2f, 12.5006f)
        curveTo(2f, 15.7438f, 4.92815f, 18.3289f, 8.14063f, 17.9659f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 7f)
        lineTo(7.5f, 2f)
        }
        }.build()

        return _gymnasticRings!!
    }

private var _gymnasticRings: ImageVector? = null
