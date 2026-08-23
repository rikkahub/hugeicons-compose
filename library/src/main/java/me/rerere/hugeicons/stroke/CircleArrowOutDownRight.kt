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

val HugeIcons.CircleArrowOutDownRight: ImageVector
    get() {
        if (_circleArrowOutDownRight != null) {
            return _circleArrowOutDownRight!!
        }
        _circleArrowOutDownRight = ImageVector.Builder(
            name = "CircleArrowOutDownRight",
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
            moveTo(19.777f, 13f)
            curveTo(19.9229f, 12.3568f, 20f, 11.6874f, 20f, 11f)
            curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
            curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
            curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
            curveTo(11.6874f, 20f, 12.3568f, 19.9229f, 13f, 19.777f)
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
            moveTo(12f, 12f)
            lineTo(21f, 21f)
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
            moveTo(21.6681f, 16f)
            curveTo(21.6681f, 16f, 22.4149f, 20.9213f, 21.6681f, 21.6681f)
            curveTo(20.9213f, 22.4149f, 16f, 21.6681f, 16f, 21.6681f)
        }
        }.build()

        return _circleArrowOutDownRight!!
    }

private var _circleArrowOutDownRight: ImageVector? = null
