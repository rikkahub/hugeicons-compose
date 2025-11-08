package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TickDouble02: ImageVector
    get() {
        if (_tickDouble02 != null) {
            return _tickDouble02!!
        }
        _tickDouble02 = ImageVector.Builder(
            name = "TickDouble02",
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
        moveTo(2.5f, 13.8333f)
        lineTo(6f, 17.5f)
        lineTo(7.02402f, 16.4272f)
        moveTo(16.5f, 6.5f)
        lineTo(10.437f, 12.8517f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 13.8333f)
        lineTo(11f, 17.5f)
        lineTo(21.5f, 6.5f)
        }
        }.build()

        return _tickDouble02!!
    }

private var _tickDouble02: ImageVector? = null
