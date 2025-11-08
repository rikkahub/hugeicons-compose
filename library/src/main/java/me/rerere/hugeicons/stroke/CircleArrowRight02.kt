package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowRight02: ImageVector
    get() {
        if (_circleArrowRight02 != null) {
            return _circleArrowRight02!!
        }
        _circleArrowRight02 = ImageVector.Builder(
            name = "CircleArrowRight02",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12.0002f)
        lineTo(7.99995f, 12.0002f)
        moveTo(12.5001f, 8.50012f)
        curveTo(12.5001f, 8.50012f, 16.0001f, 11.0778f, 16.0001f, 12.0001f)
        curveTo(16.0001f, 12.9225f, 12.5001f, 15.5001f, 12.5001f, 15.5001f)
        }
        }.build()

        return _circleArrowRight02!!
    }

private var _circleArrowRight02: ImageVector? = null
