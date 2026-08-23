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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 7f)
            curveTo(7.62858f, 5.87847f, 8.48131f, 5f, 9.79329f, 5f)
            curveTo(15.3402f, 5f, 12.2224f, 17f, 18.1831f, 17f)
            curveTo(19.5044f, 17f, 20.352f, 16.1157f, 21f, 15f)
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

        return _chartMedium!!
    }

private var _chartMedium: ImageVector? = null
