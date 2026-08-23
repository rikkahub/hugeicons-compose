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

val HugeIcons.Vote: ImageVector
    get() {
        if (_vote != null) {
            return _vote!!
        }
        _vote = ImageVector.Builder(
            name = "Vote",
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
            moveTo(6f, 11f)
            curveTo(6f, 8.17157f, 6f, 6.75736f, 6.87868f, 5.87868f)
            curveTo(7.75736f, 5f, 9.17157f, 5f, 12f, 5f)
            curveTo(14.8284f, 5f, 16.2426f, 5f, 17.1213f, 5.87868f)
            curveTo(18f, 6.75736f, 18f, 8.17157f, 18f, 11f)
            verticalLineTo(19f)
            horizontalLineTo(6f)
            verticalLineTo(11f)
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
            moveTo(3f, 19f)
            horizontalLineTo(21f)
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
            moveTo(10f, 11.8096f)
            curveTo(10.4484f, 12.0035f, 11.0045f, 12.5043f, 11.2735f, 12.9082f)
            curveTo(11.3632f, 13.4737f, 11.8117f, 11.2926f, 14f, 10f)
        }
        }.build()

        return _vote!!
    }

private var _vote: ImageVector? = null
