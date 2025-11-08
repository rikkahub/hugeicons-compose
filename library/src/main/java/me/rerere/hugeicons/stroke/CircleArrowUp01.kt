package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUp01: ImageVector
    get() {
        if (_circleArrowUp01 != null) {
            return _circleArrowUp01!!
        }
        _circleArrowUp01 = ImageVector.Builder(
            name = "CircleArrowUp01",
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
        moveTo(16f, 13.5f)
        curveTo(16f, 13.5f, 13.054f, 10.5f, 12f, 10.5f)
        curveTo(10.9459f, 10.5f, 8f, 13.5f, 8f, 13.5f)
        }
        }.build()

        return _circleArrowUp01!!
    }

private var _circleArrowUp01: ImageVector? = null
