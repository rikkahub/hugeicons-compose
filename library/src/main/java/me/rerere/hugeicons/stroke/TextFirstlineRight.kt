package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextFirstlineRight: ImageVector
    get() {
        if (_textFirstlineRight != null) {
            return _textFirstlineRight!!
        }
        _textFirstlineRight = ImageVector.Builder(
            name = "TextFirstlineRight",
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
        moveTo(15f, 3.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        horizontalLineTo(21f)
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
        moveTo(3.58579f, 9.91421f)
        curveTo(4.17157f, 10.5f, 5.11438f, 10.5f, 7f, 10.5f)
        curveTo(8.88562f, 10.5f, 9.82843f, 10.5f, 10.4142f, 9.91421f)
        curveTo(11f, 9.32843f, 11f, 8.38562f, 11f, 6.5f)
        curveTo(11f, 4.61438f, 11f, 3.67157f, 10.4142f, 3.08579f)
        curveTo(9.82843f, 2.5f, 8.88562f, 2.5f, 7f, 2.5f)
        curveTo(5.11438f, 2.5f, 4.17157f, 2.5f, 3.58579f, 3.08579f)
        curveTo(3f, 3.67157f, 3f, 4.61438f, 3f, 6.5f)
        curveTo(3f, 8.38562f, 3f, 9.32843f, 3.58579f, 9.91421f)
        }
        }.build()

        return _textFirstlineRight!!
    }

private var _textFirstlineRight: ImageVector? = null
