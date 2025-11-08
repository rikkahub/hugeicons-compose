package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextFirstlineLeft: ImageVector
    get() {
        if (_textFirstlineLeft != null) {
            return _textFirstlineLeft!!
        }
        _textFirstlineLeft = ImageVector.Builder(
            name = "TextFirstlineLeft",
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
        moveTo(3f, 3.5f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9.5f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5858f, 9.91421f)
        curveTo(14.1716f, 10.5f, 15.1144f, 10.5f, 17f, 10.5f)
        curveTo(18.8856f, 10.5f, 19.8284f, 10.5f, 20.4142f, 9.91421f)
        curveTo(21f, 9.32843f, 21f, 8.38562f, 21f, 6.5f)
        curveTo(21f, 4.61438f, 21f, 3.67157f, 20.4142f, 3.08579f)
        curveTo(19.8284f, 2.5f, 18.8856f, 2.5f, 17f, 2.5f)
        curveTo(15.1144f, 2.5f, 14.1716f, 2.5f, 13.5858f, 3.08579f)
        curveTo(13f, 3.67157f, 13f, 4.61438f, 13f, 6.5f)
        curveTo(13f, 8.38562f, 13f, 9.32843f, 13.5858f, 9.91421f)
        }
        }.build()

        return _textFirstlineLeft!!
    }

private var _textFirstlineLeft: ImageVector? = null
