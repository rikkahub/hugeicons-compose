package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextCenterlineRight: ImageVector
    get() {
        if (_textCenterlineRight != null) {
            return _textCenterlineRight!!
        }
        _textCenterlineRight = ImageVector.Builder(
            name = "TextCenterlineRight",
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
        moveTo(3f, 3f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 15f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.58579f, 15.4142f)
        curveTo(4.17157f, 16f, 5.11438f, 16f, 7f, 16f)
        curveTo(8.88562f, 16f, 9.82843f, 16f, 10.4142f, 15.4142f)
        curveTo(11f, 14.8284f, 11f, 13.8856f, 11f, 12f)
        curveTo(11f, 10.1144f, 11f, 9.17157f, 10.4142f, 8.58579f)
        curveTo(9.82843f, 8f, 8.88562f, 8f, 7f, 8f)
        curveTo(5.11438f, 8f, 4.17157f, 8f, 3.58579f, 8.58579f)
        curveTo(3f, 9.17157f, 3f, 10.1144f, 3f, 12f)
        curveTo(3f, 13.8856f, 3f, 14.8284f, 3.58579f, 15.4142f)
        }
        }.build()

        return _textCenterlineRight!!
    }

private var _textCenterlineRight: ImageVector? = null
