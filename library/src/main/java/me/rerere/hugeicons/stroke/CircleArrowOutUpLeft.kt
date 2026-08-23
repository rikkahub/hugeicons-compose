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

val HugeIcons.CircleArrowOutUpLeft: ImageVector
    get() {
        if (_circleArrowOutUpLeft != null) {
            return _circleArrowOutUpLeft!!
        }
        _circleArrowOutUpLeft = ImageVector.Builder(
            name = "CircleArrowOutUpLeft",
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
            moveTo(4.22302f, 11f)
            curveTo(4.07706f, 11.6432f, 4f, 12.3126f, 4f, 13f)
            curveTo(4f, 17.9706f, 8.02944f, 22f, 13f, 22f)
            curveTo(17.9706f, 22f, 22f, 17.9706f, 22f, 13f)
            curveTo(22f, 8.02944f, 17.9706f, 4f, 13f, 4f)
            curveTo(12.3126f, 4f, 11.6432f, 4.07706f, 11f, 4.22302f)
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
            lineTo(3f, 3f)
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
            moveTo(2.33189f, 8f)
            curveTo(2.33189f, 8f, 1.58511f, 3.07875f, 2.33193f, 2.33192f)
            curveTo(3.07875f, 1.58509f, 8f, 2.33194f, 8f, 2.33194f)
        }
        }.build()

        return _circleArrowOutUpLeft!!
    }

private var _circleArrowOutUpLeft: ImageVector? = null
