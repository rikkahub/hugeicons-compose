package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartMinimum: ImageVector
    get() {
        if (_chartMinimum != null) {
            return _chartMinimum!!
        }
        _chartMinimum = ImageVector.Builder(
            name = "ChartMinimum",
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
        moveTo(21f, 21f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
        curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3f)
        curveTo(8f, 9.07513f, 10.6863f, 14f, 14f, 14f)
        curveTo(17.3137f, 14f, 20f, 9.07513f, 20f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17f)
        horizontalLineTo(6.00898f)
        moveTo(8.9982f, 17f)
        horizontalLineTo(9.00718f)
        moveTo(11.9964f, 17f)
        horizontalLineTo(12.0054f)
        moveTo(14.9946f, 17f)
        horizontalLineTo(15.0036f)
        moveTo(17.9928f, 17f)
        horizontalLineTo(18.0018f)
        moveTo(20.991f, 17f)
        horizontalLineTo(21f)
        }
        }.build()

        return _chartMinimum!!
    }

private var _chartMinimum: ImageVector? = null
