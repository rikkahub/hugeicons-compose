package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = ImageVector.Builder(
            name = "LessThan",
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
        moveTo(17f, 4f)
        lineTo(8.66943f, 10.0405f)
        curveTo(6.44352f, 11.6545f, 6.44353f, 12.3455f, 8.66943f, 13.9595f)
        lineTo(17f, 20f)
        }
        }.build()

        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
