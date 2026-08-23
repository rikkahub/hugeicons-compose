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

val HugeIcons.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = ImageVector.Builder(
            name = "Strikethrough",
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
            moveTo(3.99219f, 12f)
            horizontalLineTo(19.9922f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.4922f, 7.66667f)
            curveTo(17.4922f, 5.08934f, 15.0298f, 3f, 11.9922f, 3f)
            curveTo(8.95462f, 3f, 6.49219f, 5.08934f, 6.49219f, 7.66667f)
            curveTo(6.49219f, 8.15279f, 6.54555f, 8.59783f, 6.65899f, 9f)
            moveTo(5.99219f, 16.3333f)
            curveTo(5.99219f, 18.9107f, 8.67848f, 21f, 11.9922f, 21f)
            curveTo(15.3059f, 21f, 17.9922f, 19.6667f, 17.9922f, 16.3333f)
            curveTo(17.9922f, 13.9404f, 16.9615f, 12.5782f, 14.9001f, 12f)
        }
        }.build()

        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
