package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowVertical: ImageVector
    get() {
        if (_circleArrowVertical != null) {
            return _circleArrowVertical!!
        }
        _circleArrowVertical = ImageVector.Builder(
            name = "CircleArrowVertical",
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
        moveTo(12f, 17f)
        lineTo(12f, 7f)
        moveTo(12f, 17f)
        curveTo(12.5602f, 17f, 13.6067f, 15.604f, 14f, 15.25f)
        moveTo(12f, 17f)
        curveTo(11.4398f, 17f, 10.3932f, 15.604f, 9.99997f, 15.25f)
        moveTo(12f, 7f)
        curveTo(12.5602f, 7f, 13.6067f, 8.39601f, 14f, 8.75f)
        moveTo(12f, 7f)
        curveTo(11.4398f, 7f, 10.3932f, 8.39601f, 9.99997f, 8.75f)
        }
        }.build()

        return _circleArrowVertical!!
    }

private var _circleArrowVertical: ImageVector? = null
