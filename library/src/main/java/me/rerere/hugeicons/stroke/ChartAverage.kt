package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartAverage: ImageVector
    get() {
        if (_chartAverage != null) {
            return _chartAverage!!
        }
        _chartAverage = ImageVector.Builder(
            name = "ChartAverage",
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
        moveTo(6f, 12f)
        horizontalLineTo(6.00898f)
        moveTo(8.9982f, 12f)
        horizontalLineTo(9.00718f)
        moveTo(11.9964f, 12f)
        horizontalLineTo(12.0054f)
        moveTo(14.9946f, 12f)
        horizontalLineTo(15.0036f)
        moveTo(17.9928f, 12f)
        horizontalLineTo(18.0018f)
        moveTo(20.991f, 12f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        curveTo(6.67348f, 5.87847f, 7.58712f, 5f, 8.99282f, 5f)
        curveTo(14.9359f, 5f, 11.5954f, 17f, 17.9819f, 17f)
        curveTo(19.3976f, 17f, 20.3057f, 16.1157f, 21f, 15f)
        }
        }.build()

        return _chartAverage!!
    }

private var _chartAverage: ImageVector? = null
