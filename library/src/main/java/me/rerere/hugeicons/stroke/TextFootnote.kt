package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextFootnote: ImageVector
    get() {
        if (_textFootnote != null) {
            return _textFootnote!!
        }
        _textFootnote = ImageVector.Builder(
            name = "TextFootnote",
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
        moveTo(19.75f, 5.88792f)
        lineTo(19.7494f, 8.72342f)
        moveTo(19.7494f, 8.72342f)
        lineTo(22f, 7.7061f)
        moveTo(19.7494f, 8.72342f)
        lineTo(17.5f, 7.7061f)
        moveTo(19.7494f, 8.72342f)
        lineTo(17.95f, 10.8879f)
        moveTo(19.7494f, 8.72342f)
        lineTo(21.55f, 10.8879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.0017f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5.99779f)
        curveTo(16f, 5.34082f, 16f, 5.01235f, 15.9194f, 4.7245f)
        curveTo(15.7518f, 4.12577f, 15.3066f, 3.61001f, 14.7541f, 3.37477f)
        curveTo(14.4886f, 3.26167f, 14.1885f, 3.2296f, 13.5884f, 3.16547f)
        curveTo(12.1695f, 3.01383f, 10.3874f, 2.99779f, 9f, 2.99779f)
        curveTo(7.61262f, 2.99779f, 5.83047f, 3.01383f, 4.41161f, 3.16547f)
        curveTo(3.8115f, 3.2296f, 3.51144f, 3.26167f, 3.24586f, 3.37477f)
        curveTo(2.69344f, 3.61001f, 2.24816f, 4.12577f, 2.08057f, 4.7245f)
        curveTo(2f, 5.01235f, 2f, 5.34082f, 2f, 5.99779f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3.34984f)
        lineTo(9f, 21.0015f)
        }
        }.build()

        return _textFootnote!!
    }

private var _textFootnote: ImageVector? = null
