package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUp03: ImageVector
    get() {
        if (_circleArrowUp03 != null) {
            return _circleArrowUp03!!
        }
        _circleArrowUp03 = ImageVector.Builder(
            name = "CircleArrowUp03",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5152f, 12.5036f)
        curveTo(13.9844f, 11.9728f, 12.6908f, 9.99529f, 11.9455f, 10.0058f)
        curveTo(11.2077f, 10.0865f, 10.0313f, 12.0088f, 9.51149f, 12.5138f)
        moveTo(12.0354f, 17.0043f)
        lineTo(12.0211f, 10.0112f)
        moveTo(8f, 7.00901f)
        lineTo(15.9921f, 6.99268f)
        }
        }.build()

        return _circleArrowUp03!!
    }

private var _circleArrowUp03: ImageVector? = null
