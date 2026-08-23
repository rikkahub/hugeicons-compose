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

val HugeIcons.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = ImageVector.Builder(
            name = "Scissors",
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
            moveTo(2.99219f, 6f)
            curveTo(2.99219f, 7.65685f, 4.33533f, 9f, 5.99219f, 9f)
            curveTo(7.64904f, 9f, 8.99219f, 7.65685f, 8.99219f, 6f)
            curveTo(8.99219f, 4.34315f, 7.64904f, 3f, 5.99219f, 3f)
            curveTo(4.33533f, 3f, 2.99219f, 4.34315f, 2.99219f, 6f)
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
            moveTo(8.99219f, 8f)
            lineTo(20.9922f, 19f)
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
            moveTo(8.99193f, 16f)
            lineTo(12.9922f, 12f)
            moveTo(2.99219f, 18f)
            curveTo(2.99219f, 19.6569f, 4.33533f, 21f, 5.99219f, 21f)
            curveTo(7.64904f, 21f, 8.99219f, 19.6569f, 8.99219f, 18f)
            curveTo(8.99219f, 16.3431f, 7.64904f, 15f, 5.99219f, 15f)
            curveTo(4.33533f, 15f, 2.99219f, 16.3431f, 2.99219f, 18f)
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
            moveTo(15.4922f, 9.5f)
            lineTo(20.9922f, 4f)
        }
        }.build()

        return _scissors!!
    }

private var _scissors: ImageVector? = null
