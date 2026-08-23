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

val HugeIcons.CircleArrowOutDownLeft: ImageVector
    get() {
        if (_circleArrowOutDownLeft != null) {
            return _circleArrowOutDownLeft!!
        }
        _circleArrowOutDownLeft = ImageVector.Builder(
            name = "CircleArrowOutDownLeft",
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
            moveTo(4.22302f, 13f)
            curveTo(4.07706f, 12.3568f, 4f, 11.6874f, 4f, 11f)
            curveTo(4f, 6.02944f, 8.02944f, 2f, 13f, 2f)
            curveTo(17.9706f, 2f, 22f, 6.02944f, 22f, 11f)
            curveTo(22f, 15.9706f, 17.9706f, 20f, 13f, 20f)
            curveTo(12.3126f, 20f, 11.6432f, 19.9229f, 11f, 19.777f)
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
            lineTo(3f, 21f)
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
            moveTo(2.33189f, 16f)
            curveTo(2.33189f, 16f, 1.58511f, 20.9213f, 2.33193f, 21.6681f)
            curveTo(3.07875f, 22.4149f, 8f, 21.6681f, 8f, 21.6681f)
        }
        }.build()

        return _circleArrowOutDownLeft!!
    }

private var _circleArrowOutDownLeft: ImageVector? = null
