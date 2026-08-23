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

val HugeIcons.CornerRightUp: ImageVector
    get() {
        if (_cornerRightUp != null) {
            return _cornerRightUp!!
        }
        _cornerRightUp = ImageVector.Builder(
            name = "CornerRightUp",
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
            moveTo(15f, 5f)
            lineTo(15f, 12f)
            curveTo(15f, 15.7712f, 15f, 17.6569f, 13.8284f, 18.8284f)
            curveTo(12.6569f, 20f, 10.7712f, 20f, 7f, 20f)
            lineTo(4f, 20f)
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
            moveTo(20f, 8.99996f)
            curveTo(20f, 8.99996f, 16.3176f, 4.00001f, 15f, 4f)
            curveTo(13.6824f, 3.99999f, 10f, 9f, 10f, 9f)
        }
        }.build()

        return _cornerRightUp!!
    }

private var _cornerRightUp: ImageVector? = null
