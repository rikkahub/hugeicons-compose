package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowLeftDouble: ImageVector
    get() {
        if (_circleArrowLeftDouble != null) {
            return _circleArrowLeftDouble!!
        }
        _circleArrowLeftDouble = ImageVector.Builder(
            name = "CircleArrowLeftDouble",
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
        moveTo(11.0846f, 15f)
        curveTo(11.0846f, 15f, 8.50001f, 12.7905f, 8.5f, 12f)
        curveTo(8.49999f, 11.2094f, 11.0846f, 9f, 11.0846f, 9f)
        moveTo(15.5f, 15f)
        curveTo(15.5f, 15f, 12.9154f, 12.7905f, 12.9154f, 12f)
        curveTo(12.9154f, 11.2094f, 15.5f, 9f, 15.5f, 9f)
        }
        }.build()

        return _circleArrowLeftDouble!!
    }

private var _circleArrowLeftDouble: ImageVector? = null
