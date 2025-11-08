package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartMedium: ImageVector
    get() {
        if (_chartMedium != null) {
            return _chartMedium!!
        }
        _chartMedium = ImageVector.Builder(
            name = "ChartMedium",
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
        moveTo(12f, 3f)
        horizontalLineTo(12.009f)
        moveTo(12f, 6f)
        horizontalLineTo(12.009f)
        moveTo(12f, 9f)
        horizontalLineTo(12.009f)
        moveTo(12f, 12f)
        horizontalLineTo(12.009f)
        moveTo(12f, 15f)
        horizontalLineTo(12.009f)
        moveTo(12f, 18f)
        horizontalLineTo(12.009f)
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
        }.build()

        return _chartMedium!!
    }

private var _chartMedium: ImageVector? = null
