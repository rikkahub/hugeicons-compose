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

val HugeIcons.CornerRightDown: ImageVector
    get() {
        if (_cornerRightDown != null) {
            return _cornerRightDown!!
        }
        _cornerRightDown = ImageVector.Builder(
            name = "CornerRightDown",
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
            moveTo(15f, 19f)
            lineTo(15f, 12f)
            curveTo(15f, 8.22876f, 15f, 6.34315f, 13.8284f, 5.17157f)
            curveTo(12.6569f, 4f, 10.7712f, 4f, 7f, 4f)
            lineTo(4f, 4f)
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
            moveTo(20f, 15f)
            curveTo(20f, 15f, 16.3176f, 20f, 15f, 20f)
            curveTo(13.6824f, 20f, 10f, 15f, 10f, 15f)
        }
        }.build()

        return _cornerRightDown!!
    }

private var _cornerRightDown: ImageVector? = null
