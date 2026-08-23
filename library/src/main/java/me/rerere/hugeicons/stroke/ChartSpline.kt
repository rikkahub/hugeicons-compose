package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartSpline: ImageVector
    get() {
        if (_chartSpline != null) {
            return _chartSpline!!
        }
        _chartSpline = ImageVector.Builder(
            name = "ChartSpline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 17f)
            curveTo(7f, 10.2174f, 8.43478f, 8f, 10f, 8f)
            curveTo(12.5f, 8f, 13.5f, 14f, 16f, 14f)
            curveTo(18.087f, 14f, 19f, 8.13043f, 19f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 21f)
            horizontalLineTo(10f)
            curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
            curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
            verticalLineTo(3f)
        }
        }.build()

        return _chartSpline!!
    }

private var _chartSpline: ImageVector? = null
