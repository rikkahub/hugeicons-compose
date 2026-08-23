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

val HugeIcons.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = ImageVector.Builder(
            name = "Sketch",
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
            moveTo(17f, 9.5f)
            lineTo(12f, 3f)
            lineTo(7f, 9.5f)
            lineTo(12f, 21f)
            lineTo(17f, 9.5f)
            close()
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
            moveTo(17.5f, 4f)
            lineTo(22f, 9.5f)
            horizontalLineTo(17f)
            moveTo(17.5f, 4f)
            lineTo(17f, 9.5f)
            moveTo(17.5f, 4f)
            lineTo(12f, 3f)
            lineTo(6.5f, 4f)
            moveTo(17f, 9.5f)
            horizontalLineTo(7f)
            moveTo(6.5f, 4f)
            lineTo(2f, 9.5f)
            horizontalLineTo(7f)
            moveTo(6.5f, 4f)
            lineTo(7f, 9.5f)
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
            moveTo(22f, 9.5f)
            lineTo(12f, 21f)
            lineTo(2f, 9.5f)
        }
        }.build()

        return _sketch!!
    }

private var _sketch: ImageVector? = null
