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

val HugeIcons.IterationCw: ImageVector
    get() {
        if (_iterationCw != null) {
            return _iterationCw!!
        }
        _iterationCw = ImageVector.Builder(
            name = "IterationCw",
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
            moveTo(4f, 10f)
            curveTo(4f, 5.58172f, 7.58172f, 2f, 12f, 2f)
            curveTo(16.4183f, 2f, 20f, 5.58172f, 20f, 10f)
            curveTo(20f, 14.4183f, 16.4183f, 18f, 12f, 18f)
            horizontalLineTo(5f)
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
            moveTo(7.99997f, 14f)
            curveTo(7.99997f, 14f, 4.00001f, 16.946f, 4f, 18f)
            curveTo(3.99999f, 19.0541f, 8f, 22f, 8f, 22f)
        }
        }.build()

        return _iterationCw!!
    }

private var _iterationCw: ImageVector? = null
