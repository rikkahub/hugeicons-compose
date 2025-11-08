package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextItalicSlash: ImageVector
    get() {
        if (_textItalicSlash != null) {
            return _textItalicSlash!!
        }
        _textItalicSlash = ImageVector.Builder(
            name = "TextItalicSlash",
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
        moveTo(11f, 20.001f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 7f)
        curveTo(19f, 6.36778f, 19f, 5.95381f, 18.9194f, 5.6768f)
        curveTo(18.7518f, 5.10062f, 18.3066f, 4.60428f, 17.7541f, 4.37789f)
        curveTo(17.4886f, 4.26905f, 17.1885f, 4.23819f, 16.5884f, 4.17648f)
        curveTo(15.1695f, 4.03054f, 13.3874f, 4f, 12f, 4f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        lineTo(11.2f, 7.20003f)
        moveTo(8f, 20.0008f)
        lineTo(10.4001f, 10.4001f)
        }
        }.build()

        return _textItalicSlash!!
    }

private var _textItalicSlash: ImageVector? = null
