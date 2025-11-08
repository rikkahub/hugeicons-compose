package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowRight03: ImageVector
    get() {
        if (_circleArrowRight03 != null) {
            return _circleArrowRight03!!
        }
        _circleArrowRight03 = ImageVector.Builder(
            name = "CircleArrowRight03",
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
        moveTo(11.4966f, 9.4915f)
        curveTo(12.0279f, 10.0219f, 14.0065f, 11.3138f, 13.9966f, 12.0591f)
        curveTo(13.9166f, 12.797f, 11.9953f, 13.9749f, 11.4906f, 14.4952f)
        moveTo(6.99805f, 11.9751f)
        lineTo(13.9911f, 11.9835f)
        moveTo(16.9967f, 16.002f)
        lineTo(17.0063f, 8.00989f)
        }
        }.build()

        return _circleArrowRight03!!
    }

private var _circleArrowRight03: ImageVector? = null
