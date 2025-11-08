package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Train02: ImageVector
    get() {
        if (_train02 != null) {
            return _train02!!
        }
        _train02 = ImageVector.Builder(
            name = "Train02",
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
        moveTo(20f, 10f)
        curveTo(20f, 14.4183f, 16.4183f, 20f, 12f, 20f)
        curveTo(7.58172f, 20f, 4f, 14.4183f, 4f, 10f)
        curveTo(4f, 5.58172f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 5.58172f, 20f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18f)
        curveTo(8.93901f, 16.7807f, 10.3819f, 16f, 12f, 16f)
        curveTo(13.6181f, 16f, 15.061f, 16.7807f, 16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.24863f, 9.60369f)
        curveTo(10.1074f, 9.85527f, 11.0339f, 10f, 12f, 10f)
        curveTo(12.9661f, 10f, 13.8926f, 9.85527f, 14.7514f, 9.60369f)
        curveTo(15.9101f, 9.26423f, 16.4186f, 8.6101f, 15.5953f, 7.58805f)
        curveTo(13.8898f, 5.47065f, 10.1102f, 5.47065f, 8.40466f, 7.58805f)
        curveTo(7.5814f, 8.6101f, 8.08993f, 9.26423f, 9.24863f, 9.60369f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 19f)
        lineTo(3f, 22f)
        moveTo(19f, 19f)
        lineTo(21f, 22f)
        }
        }.build()

        return _train02!!
    }

private var _train02: ImageVector? = null
