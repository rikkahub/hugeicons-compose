package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = ImageVector.Builder(
            name = "TextBold",
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
        moveTo(5f, 6f)
        curveTo(5f, 4.58579f, 5f, 3.87868f, 5.43934f, 3.43934f)
        curveTo(5.87868f, 3f, 6.58579f, 3f, 8f, 3f)
        horizontalLineTo(12.5789f)
        curveTo(15.0206f, 3f, 17f, 5.01472f, 17f, 7.5f)
        curveTo(17f, 9.98528f, 15.0206f, 12f, 12.5789f, 12f)
        horizontalLineTo(5f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4286f, 12f)
        horizontalLineTo(13.6667f)
        curveTo(16.0599f, 12f, 18f, 14.0147f, 18f, 16.5f)
        curveTo(18f, 18.9853f, 16.0599f, 21f, 13.6667f, 21f)
        horizontalLineTo(8f)
        curveTo(6.58579f, 21f, 5.87868f, 21f, 5.43934f, 20.5607f)
        curveTo(5f, 20.1213f, 5f, 19.4142f, 5f, 18f)
        verticalLineTo(12f)
        }
        }.build()

        return _textBold!!
    }

private var _textBold: ImageVector? = null
