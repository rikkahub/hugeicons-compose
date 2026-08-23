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

val HugeIcons.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = ImageVector.Builder(
            name = "Wind",
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
            moveTo(6f, 6f)
            curveTo(6f, 4.34315f, 7.34315f, 3f, 9f, 3f)
            curveTo(10.6569f, 3f, 12f, 4.34315f, 12f, 6f)
            curveTo(12f, 7.65685f, 10.6569f, 9f, 9f, 9f)
            horizontalLineTo(3f)
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
            moveTo(9f, 18f)
            curveTo(9f, 19.6569f, 10.3431f, 21f, 12f, 21f)
            curveTo(13.6569f, 21f, 15f, 19.6569f, 15f, 18f)
            curveTo(15f, 16.3431f, 13.6569f, 15f, 12f, 15f)
            horizontalLineTo(3f)
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
            moveTo(15f, 9f)
            curveTo(15f, 7.34315f, 16.3431f, 6f, 18f, 6f)
            curveTo(19.6569f, 6f, 21f, 7.34315f, 21f, 9f)
            curveTo(21f, 10.6569f, 19.6569f, 12f, 18f, 12f)
            horizontalLineTo(6.5f)
        }
        }.build()

        return _wind!!
    }

private var _wind: ImageVector? = null
