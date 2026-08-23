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

val HugeIcons.CornerUpRight: ImageVector
    get() {
        if (_cornerUpRight != null) {
            return _cornerUpRight!!
        }
        _cornerUpRight = ImageVector.Builder(
            name = "CornerUpRight",
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
            moveTo(19f, 9f)
            horizontalLineTo(12f)
            curveTo(8.22876f, 9f, 6.34315f, 9f, 5.17157f, 10.1716f)
            curveTo(4f, 11.3431f, 4f, 13.2288f, 4f, 17f)
            verticalLineTo(20f)
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
            moveTo(15f, 4f)
            curveTo(15f, 4f, 20f, 7.68245f, 20f, 9.00004f)
            curveTo(20f, 10.3176f, 15f, 14f, 15f, 14f)
        }
        }.build()

        return _cornerUpRight!!
    }

private var _cornerUpRight: ImageVector? = null
