package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUpLeft: ImageVector
    get() {
        if (_circleArrowUpLeft != null) {
            return _circleArrowUpLeft!!
        }
        _circleArrowUpLeft = ImageVector.Builder(
            name = "CircleArrowUpLeft",
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
        moveTo(9f, 14f)
        verticalLineTo(12f)
        curveTo(9f, 10.5858f, 9f, 9.87868f, 9.43934f, 9.43934f)
        curveTo(9.87868f, 9f, 10.5858f, 9f, 12f, 9f)
        horizontalLineTo(14f)
        moveTo(10f, 10f)
        lineTo(15f, 15f)
        }
        }.build()

        return _circleArrowUpLeft!!
    }

private var _circleArrowUpLeft: ImageVector? = null
