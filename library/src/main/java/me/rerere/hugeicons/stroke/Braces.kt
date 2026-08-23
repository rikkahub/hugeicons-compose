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

val HugeIcons.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = ImageVector.Builder(
            name = "Braces",
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
            moveTo(8f, 3f)
            curveTo(7.5355f, 3f, 7.30325f, 3f, 7.10891f, 3.03078f)
            curveTo(6.03918f, 3.20021f, 5.20021f, 4.03918f, 5.03078f, 5.10891f)
            curveTo(5f, 5.30325f, 5f, 5.5355f, 5f, 6f)
            lineTo(5f, 10f)
            curveTo(5f, 11.1046f, 4.10457f, 12f, 3f, 12f)
            curveTo(4.10406f, 11.9982f, 5f, 12.8928f, 5f, 13.9968f)
            verticalLineTo(18f)
            curveTo(5f, 18.4645f, 5f, 18.6968f, 5.03078f, 18.8911f)
            curveTo(5.20021f, 19.9608f, 6.03918f, 20.7998f, 7.10891f, 20.9692f)
            curveTo(7.30325f, 21f, 7.5355f, 21f, 8f, 21f)
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
            moveTo(16f, 3f)
            curveTo(16.4645f, 3f, 16.6968f, 3f, 16.8911f, 3.03078f)
            curveTo(17.9608f, 3.20021f, 18.7998f, 4.03918f, 18.9692f, 5.10891f)
            curveTo(19f, 5.30325f, 19f, 5.5355f, 19f, 6f)
            lineTo(19f, 10f)
            curveTo(19f, 11.1046f, 19.8954f, 12f, 21f, 12f)
            curveTo(19.8959f, 11.9982f, 19f, 12.8928f, 19f, 13.9968f)
            verticalLineTo(18f)
            curveTo(19f, 18.4645f, 19f, 18.6968f, 18.9692f, 18.8911f)
            curveTo(18.7998f, 19.9608f, 17.9608f, 20.7998f, 16.8911f, 20.9692f)
            curveTo(16.6968f, 21f, 16.4645f, 21f, 16f, 21f)
        }
        }.build()

        return _braces!!
    }

private var _braces: ImageVector? = null
