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

val HugeIcons.ChartMaximum: ImageVector
    get() {
        if (_chartMaximum != null) {
            return _chartMaximum!!
        }
        _chartMaximum = ImageVector.Builder(
            name = "ChartMaximum",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 21f)
            horizontalLineTo(10f)
            curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
            curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
            verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19f, 17f)
            curveTo(19f, 10.3726f, 16.3137f, 5f, 13f, 5f)
            curveTo(9.68629f, 5f, 7f, 10.3726f, 7f, 17f)
        }
        }.build()

        return _chartMaximum!!
    }

private var _chartMaximum: ImageVector? = null
