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

val HugeIcons.LayoutLeft: ImageVector
    get() {
        if (_layoutLeft != null) {
            return _layoutLeft!!
        }
        _layoutLeft = ImageVector.Builder(
            name = "LayoutLeft",
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
            moveTo(20.1088f, 20.1088f)
            curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
            curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
            curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
            curveTo(2.5f, 7.52166f, 2.5f, 5.28248f, 3.89124f, 3.89124f)
            curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
            curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
            curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
            curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
            close()
        }

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
            moveTo(9f, 21.5f)
            lineTo(9f, 2.5f)
        }
        }.build()

        return _layoutLeft!!
    }

private var _layoutLeft: ImageVector? = null
