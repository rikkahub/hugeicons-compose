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

val HugeIcons.IterationCcw: ImageVector
    get() {
        if (_iterationCcw != null) {
            return _iterationCcw!!
        }
        _iterationCcw = ImageVector.Builder(
            name = "IterationCcw",
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
            moveTo(20f, 10f)
            curveTo(20f, 5.58172f, 16.4183f, 2f, 12f, 2f)
            curveTo(7.58172f, 2f, 4f, 5.58172f, 4f, 10f)
            curveTo(4f, 14.4183f, 7.58172f, 18f, 12f, 18f)
            horizontalLineTo(19f)
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
            moveTo(16f, 14f)
            curveTo(16f, 14f, 20f, 16.946f, 20f, 18f)
            curveTo(20f, 19.0541f, 16f, 22f, 16f, 22f)
        }
        }.build()

        return _iterationCcw!!
    }

private var _iterationCcw: ImageVector? = null
