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

val HugeIcons.Eclipse: ImageVector
    get() {
        if (_eclipse != null) {
            return _eclipse!!
        }
        _eclipse = ImageVector.Builder(
            name = "Eclipse",
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
            moveTo(11f, 16.9001f)
            curveTo(8.71776f, 16.4368f, 7f, 14.419f, 7f, 12.0001f)
            curveTo(7f, 9.58112f, 8.71776f, 7.56337f, 11f, 7.1001f)
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
            moveTo(22f, 12f)
            curveTo(22f, 14.7614f, 19.7614f, 17f, 17f, 17f)
            curveTo(14.2386f, 17f, 12f, 14.7614f, 12f, 12f)
            curveTo(12f, 9.23858f, 14.2386f, 7f, 17f, 7f)
            curveTo(19.7614f, 7f, 22f, 9.23858f, 22f, 12f)
            close()
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
            moveTo(11.9982f, 2f)
            verticalLineTo(4f)
            moveTo(11.9982f, 20f)
            verticalLineTo(22f)
            moveTo(6.5f, 17.5f)
            lineTo(5f, 19f)
            moveTo(4f, 12f)
            horizontalLineTo(2f)
            moveTo(6.49902f, 6.5f)
            lineTo(5f, 5.00098f)
        }
        }.build()

        return _eclipse!!
    }

private var _eclipse: ImageVector? = null
