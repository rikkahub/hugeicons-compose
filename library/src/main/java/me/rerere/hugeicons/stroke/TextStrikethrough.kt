package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = ImageVector.Builder(
            name = "TextStrikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 7.66667f)
        curveTo(17.5f, 5.08934f, 15.0376f, 3f, 12f, 3f)
        curveTo(8.96243f, 3f, 6.5f, 5.08934f, 6.5f, 7.66667f)
        curveTo(6.5f, 8.15279f, 6.55336f, 8.59783f, 6.6668f, 9f)
        moveTo(6f, 16.3333f)
        curveTo(6f, 18.9107f, 8.68629f, 21f, 12f, 21f)
        curveTo(15.3137f, 21f, 18f, 19.6667f, 18f, 16.3333f)
        curveTo(18f, 13.9404f, 16.9693f, 12.5782f, 14.9079f, 12f)
        }
        }.build()

        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
