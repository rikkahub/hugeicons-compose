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

val HugeIcons.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) {
            return _cornerLeftUp!!
        }
        _cornerLeftUp = ImageVector.Builder(
            name = "CornerLeftUp",
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
            moveTo(9f, 5f)
            lineTo(9f, 12f)
            curveTo(9f, 15.7712f, 9f, 17.6569f, 10.1716f, 18.8284f)
            curveTo(11.3431f, 20f, 13.2288f, 20f, 17f, 20f)
            lineTo(20f, 20f)
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
            moveTo(4f, 8.99996f)
            curveTo(4f, 8.99996f, 7.68244f, 4.00001f, 9.00004f, 4f)
            curveTo(10.3176f, 3.99999f, 14f, 9f, 14f, 9f)
        }
        }.build()

        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
