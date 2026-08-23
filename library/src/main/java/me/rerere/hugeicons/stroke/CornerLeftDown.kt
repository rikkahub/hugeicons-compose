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

val HugeIcons.CornerLeftDown: ImageVector
    get() {
        if (_cornerLeftDown != null) {
            return _cornerLeftDown!!
        }
        _cornerLeftDown = ImageVector.Builder(
            name = "CornerLeftDown",
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
            moveTo(9f, 19f)
            lineTo(9f, 12f)
            curveTo(9f, 8.22876f, 9f, 6.34314f, 10.1716f, 5.17157f)
            curveTo(11.3431f, 4f, 13.2288f, 4f, 17f, 4f)
            lineTo(20f, 4f)
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
            moveTo(4f, 15f)
            curveTo(4f, 15f, 7.68244f, 20f, 9.00004f, 20f)
            curveTo(10.3176f, 20f, 14f, 15f, 14f, 15f)
        }
        }.build()

        return _cornerLeftDown!!
    }

private var _cornerLeftDown: ImageVector? = null
