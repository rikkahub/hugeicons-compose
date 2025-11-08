package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextCenterlineLeft: ImageVector
    get() {
        if (_textCenterlineLeft != null) {
            return _textCenterlineLeft!!
        }
        _textCenterlineLeft = ImageVector.Builder(
            name = "TextCenterlineLeft",
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
        moveTo(3f, 3.00012f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21.0001f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5858f, 15.4142f)
        curveTo(14.1716f, 16f, 15.1144f, 16f, 17f, 16f)
        curveTo(18.8856f, 16f, 19.8284f, 16f, 20.4142f, 15.4142f)
        curveTo(21f, 14.8284f, 21f, 13.8856f, 21f, 12f)
        curveTo(21f, 10.1144f, 21f, 9.17157f, 20.4142f, 8.58579f)
        curveTo(19.8284f, 8f, 18.8856f, 8f, 17f, 8f)
        curveTo(15.1144f, 8f, 14.1716f, 8f, 13.5858f, 8.58579f)
        curveTo(13f, 9.17157f, 13f, 10.1144f, 13f, 12f)
        curveTo(13f, 13.8856f, 13f, 14.8284f, 13.5858f, 15.4142f)
        }
        }.build()

        return _textCenterlineLeft!!
    }

private var _textCenterlineLeft: ImageVector? = null
