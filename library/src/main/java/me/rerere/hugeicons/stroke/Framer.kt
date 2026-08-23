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

val HugeIcons.Framer: ImageVector
    get() {
        if (_framer != null) {
            return _framer!!
        }
        _framer = ImageVector.Builder(
            name = "Framer",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 9f)
            lineTo(18f, 15f)
            horizontalLineTo(6f)
            verticalLineTo(10f)
            curveTo(6f, 9.17267f, 6.17267f, 9f, 7f, 9f)
            horizontalLineTo(12f)
            close()
            moveTo(12f, 9f)
            lineTo(6f, 3f)
            horizontalLineTo(17f)
            curveTo(17.8273f, 3f, 18f, 3.17267f, 18f, 4f)
            verticalLineTo(8f)
            curveTo(18f, 8.82733f, 17.8273f, 9f, 17f, 9f)
            horizontalLineTo(12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 21f)
            lineTo(6f, 15f)
            horizontalLineTo(12f)
            verticalLineTo(21f)
            close()
        }
        }.build()

        return _framer!!
    }

private var _framer: ImageVector? = null
