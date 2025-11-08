package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowShrink02: ImageVector
    get() {
        if (_circleArrowShrink02 != null) {
            return _circleArrowShrink02!!
        }
        _circleArrowShrink02 = ImageVector.Builder(
            name = "CircleArrowShrink02",
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
        moveTo(12.885f, 11.1151f)
        curveTo(12.3676f, 10.5977f, 12.4537f, 8.4f, 12.4537f, 8.4f)
        moveTo(12.885f, 11.1151f)
        curveTo(13.4023f, 11.6324f, 15.6f, 11.5462f, 15.6f, 11.5462f)
        moveTo(12.885f, 11.1151f)
        lineTo(16.5f, 7.5f)
        moveTo(11.1118f, 12.8882f)
        curveTo(10.5945f, 12.3708f, 8.39677f, 12.4569f, 8.39677f, 12.4569f)
        moveTo(11.1118f, 12.8882f)
        curveTo(11.6291f, 13.4055f, 11.543f, 15.6032f, 11.543f, 15.6032f)
        moveTo(11.1118f, 12.8882f)
        lineTo(7.5f, 16.5f)
        }
        }.build()

        return _circleArrowShrink02!!
    }

private var _circleArrowShrink02: ImageVector? = null
