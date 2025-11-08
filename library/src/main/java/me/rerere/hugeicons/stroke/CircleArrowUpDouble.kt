package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowUpDouble: ImageVector
    get() {
        if (_circleArrowUpDouble != null) {
            return _circleArrowUpDouble!!
        }
        _circleArrowUpDouble = ImageVector.Builder(
            name = "CircleArrowUpDouble",
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
        moveTo(9f, 11.0846f)
        curveTo(9f, 11.0846f, 11.2095f, 8.50001f, 12f, 8.5f)
        curveTo(12.7906f, 8.49999f, 15f, 11.0846f, 15f, 11.0846f)
        moveTo(9f, 15.5f)
        curveTo(9f, 15.5f, 11.2095f, 12.9154f, 12f, 12.9154f)
        curveTo(12.7906f, 12.9154f, 15f, 15.5f, 15f, 15.5f)
        }
        }.build()

        return _circleArrowUpDouble!!
    }

private var _circleArrowUpDouble: ImageVector? = null
