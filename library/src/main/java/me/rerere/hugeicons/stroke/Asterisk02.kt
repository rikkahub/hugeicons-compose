package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Asterisk02: ImageVector
    get() {
        if (_asterisk02 != null) {
            return _asterisk02!!
        }
        _asterisk02 = ImageVector.Builder(
            name = "Asterisk02",
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
        moveTo(12.0001f, 4f)
        verticalLineTo(20f)
        moveTo(19f, 8f)
        lineTo(5.00025f, 16f)
        moveTo(18.9997f, 16f)
        lineTo(5f, 8f)
        }
        }.build()

        return _asterisk02!!
    }

private var _asterisk02: ImageVector? = null
