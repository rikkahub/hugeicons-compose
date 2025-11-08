package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUpRight02: ImageVector
    get() {
        if (_circleArrowUpRight02 != null) {
            return _circleArrowUpRight02!!
        }
        _circleArrowUpRight02 = ImageVector.Builder(
            name = "CircleArrowUpRight02",
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
        moveTo(21.9999f, 12f)
        curveTo(21.9999f, 17.5228f, 17.5228f, 22f, 11.9999f, 22f)
        curveTo(6.47709f, 22f, 1.99994f, 17.5228f, 1.99994f, 12f)
        curveTo(1.99994f, 6.47715f, 6.47709f, 2f, 11.9999f, 2f)
        curveTo(17.5228f, 2f, 21.9999f, 6.47715f, 21.9999f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9999f, 9f)
        lineTo(7.99994f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.99994f, 8.11274f)
        curveTo(9.99994f, 8.11274f, 14.8287f, 7.70569f, 15.5615f, 8.43847f)
        curveTo(16.2943f, 9.17125f, 15.8872f, 14f, 15.8872f, 14f)
        }
        }.build()

        return _circleArrowUpRight02!!
    }

private var _circleArrowUpRight02: ImageVector? = null
