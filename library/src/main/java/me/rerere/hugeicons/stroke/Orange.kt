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

val HugeIcons.Orange: ImageVector
    get() {
        if (_orange != null) {
            return _orange!!
        }
        _orange = ImageVector.Builder(
            name = "Orange",
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
            moveTo(20.5f, 14f)
            curveTo(20.5f, 18.4183f, 16.6944f, 22f, 12f, 22f)
            curveTo(7.30558f, 22f, 3.5f, 18.4183f, 3.5f, 14f)
            curveTo(3.5f, 9.58172f, 7.30558f, 6f, 12f, 6f)
            curveTo(16.6944f, 6f, 20.5f, 9.58172f, 20.5f, 14f)
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
            moveTo(12f, 6f)
            curveTo(12f, 4.66667f, 12.6f, 2f, 15f, 2f)
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
            moveTo(12f, 6f)
            curveTo(11.5f, 4.83333f, 12f, 2f, 6f, 2f)
            curveTo(6.33333f, 3f, 7f, 6f, 12f, 6f)
            close()
        }
        }.build()

        return _orange!!
    }

private var _orange: ImageVector? = null
