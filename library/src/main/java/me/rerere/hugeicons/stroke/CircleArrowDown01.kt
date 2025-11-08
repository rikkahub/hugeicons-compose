package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDown01: ImageVector
    get() {
        if (_circleArrowDown01 != null) {
            return _circleArrowDown01!!
        }
        _circleArrowDown01 = ImageVector.Builder(
            name = "CircleArrowDown01",
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
        moveTo(16f, 10.5f)
        curveTo(16f, 10.5f, 13.054f, 13.5f, 12f, 13.5f)
        curveTo(10.9459f, 13.5f, 8f, 10.5f, 8f, 10.5f)
        }
        }.build()

        return _circleArrowDown01!!
    }

private var _circleArrowDown01: ImageVector? = null
