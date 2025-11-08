package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LessThanCircle: ImageVector
    get() {
        if (_lessThanCircle != null) {
            return _lessThanCircle!!
        }
        _lessThanCircle = ImageVector.Builder(
            name = "LessThanCircle",
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
        moveTo(14f, 8f)
        lineTo(10.6678f, 11.0203f)
        curveTo(9.77741f, 11.8273f, 9.77741f, 12.1727f, 10.6678f, 12.9797f)
        lineTo(14f, 16f)
        }
        }.build()

        return _lessThanCircle!!
    }

private var _lessThanCircle: ImageVector? = null
