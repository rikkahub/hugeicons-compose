package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowLeft03: ImageVector
    get() {
        if (_circleArrowLeft03 != null) {
            return _circleArrowLeft03!!
        }
        _circleArrowLeft03 = ImageVector.Builder(
            name = "CircleArrowLeft03",
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
        moveTo(12.503f, 9.49156f)
        curveTo(11.9717f, 10.0219f, 9.99314f, 11.3138f, 10.0031f, 12.0592f)
        curveTo(10.0831f, 12.797f, 12.0043f, 13.975f, 12.509f, 14.4953f)
        moveTo(17.0016f, 11.9752f)
        lineTo(10.0085f, 11.9835f)
        moveTo(7.00286f, 16.002f)
        lineTo(6.99335f, 8.00995f)
        }
        }.build()

        return _circleArrowLeft03!!
    }

private var _circleArrowLeft03: ImageVector? = null
