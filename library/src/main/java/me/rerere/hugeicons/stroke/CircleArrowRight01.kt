package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowRight01: ImageVector
    get() {
        if (_circleArrowRight01 != null) {
            return _circleArrowRight01!!
        }
        _circleArrowRight01 = ImageVector.Builder(
            name = "CircleArrowRight01",
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
        moveTo(10.5f, 8f)
        curveTo(10.5f, 8f, 13.5f, 10.946f, 13.5f, 12f)
        curveTo(13.5f, 13.0541f, 10.5f, 16f, 10.5f, 16f)
        }
        }.build()

        return _circleArrowRight01!!
    }

private var _circleArrowRight01: ImageVector? = null
