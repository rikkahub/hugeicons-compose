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

val HugeIcons.CornerDownRight: ImageVector
    get() {
        if (_cornerDownRight != null) {
            return _cornerDownRight!!
        }
        _cornerDownRight = ImageVector.Builder(
            name = "CornerDownRight",
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
            moveTo(19f, 15f)
            horizontalLineTo(12f)
            curveTo(8.22876f, 15f, 6.34315f, 15f, 5.17157f, 13.8284f)
            curveTo(4f, 12.6569f, 4f, 10.7712f, 4f, 7f)
            verticalLineTo(4f)
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
            moveTo(15f, 20f)
            curveTo(15f, 20f, 20f, 16.3176f, 20f, 15f)
            curveTo(20f, 13.6824f, 15f, 10f, 15f, 10f)
        }
        }.build()

        return _cornerDownRight!!
    }

private var _cornerDownRight: ImageVector? = null
