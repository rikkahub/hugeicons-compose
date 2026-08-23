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

val HugeIcons.FilterMailSquare: ImageVector
    get() {
        if (_filterMailSquare != null) {
            return _filterMailSquare!!
        }
        _filterMailSquare = ImageVector.Builder(
            name = "FilterMailSquare",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 11.5f)
            curveTo(2f, 7.02166f, 2f, 4.78249f, 3.39124f, 3.39124f)
            curveTo(4.78249f, 2f, 7.02166f, 2f, 11.5f, 2f)
            curveTo(15.9783f, 2f, 18.2175f, 2f, 19.6088f, 3.39124f)
            curveTo(21f, 4.78249f, 21f, 7.02166f, 21f, 11.5f)
            curveTo(21f, 15.9783f, 21f, 18.2175f, 19.6088f, 19.6088f)
            curveTo(18.2175f, 21f, 15.9783f, 21f, 11.5f, 21f)
            curveTo(7.02166f, 21f, 4.78249f, 21f, 3.39124f, 19.6088f)
            curveTo(2f, 18.2175f, 2f, 15.9783f, 2f, 11.5f)
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
            moveTo(8.5f, 11.5f)
            lineTo(14.5001f, 11.5f)
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
            moveTo(9.5f, 15f)
            horizontalLineTo(13.5f)
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
            moveTo(7.5f, 8f)
            horizontalLineTo(15.5f)
        }
        }.build()

        return _filterMailSquare!!
    }

private var _filterMailSquare: ImageVector? = null
