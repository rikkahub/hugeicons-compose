package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUpDown: ImageVector
    get() {
        if (_circleArrowUpDown != null) {
            return _circleArrowUpDown!!
        }
        _circleArrowUpDown = ImageVector.Builder(
            name = "CircleArrowUpDown",
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
        moveTo(9.3f, 8.5f)
        verticalLineTo(15.5f)
        moveTo(9.3f, 8.5f)
        curveTo(8.58465f, 8.5f, 7.5f, 10.25f, 7.5f, 10.25f)
        moveTo(9.3f, 8.5f)
        curveTo(10.004f, 8.5f, 11.1f, 10.25f, 11.1f, 10.25f)
        moveTo(14.7f, 15.5f)
        verticalLineTo(8.5f)
        moveTo(14.7f, 15.5f)
        curveTo(13.996f, 15.5f, 12.9f, 13.75f, 12.9f, 13.75f)
        moveTo(14.7f, 15.5f)
        curveTo(15.404f, 15.5f, 16.5f, 13.75f, 16.5f, 13.75f)
        }
        }.build()

        return _circleArrowUpDown!!
    }

private var _circleArrowUpDown: ImageVector? = null
