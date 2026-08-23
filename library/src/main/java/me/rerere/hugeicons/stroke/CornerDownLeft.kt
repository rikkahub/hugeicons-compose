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

val HugeIcons.CornerDownLeft: ImageVector
    get() {
        if (_cornerDownLeft != null) {
            return _cornerDownLeft!!
        }
        _cornerDownLeft = ImageVector.Builder(
            name = "CornerDownLeft",
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
            moveTo(5f, 15f)
            horizontalLineTo(12f)
            curveTo(15.7712f, 15f, 17.6569f, 15f, 18.8284f, 13.8284f)
            curveTo(20f, 12.6569f, 20f, 10.7712f, 20f, 7f)
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
            moveTo(8.99996f, 20f)
            curveTo(8.99996f, 20f, 4.00001f, 16.3176f, 4f, 15f)
            curveTo(3.99999f, 13.6824f, 9f, 10f, 9f, 10f)
        }
        }.build()

        return _cornerDownLeft!!
    }

private var _cornerDownLeft: ImageVector? = null
