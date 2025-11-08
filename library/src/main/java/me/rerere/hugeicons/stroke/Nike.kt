package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Nike: ImageVector
    get() {
        if (_nike != null) {
            return _nike!!
        }
        _nike = ImageVector.Builder(
            name = "Nike",
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
        moveTo(7.50294f, 16.2667f)
        curveTo(-0.781018f, 19.7417f, 1.80815f, 9.89584f, 5.43252f, 7f)
        curveTo(4.45502f, 9.66667f, 3.97993f, 14.0077f, 10.5f, 11.5f)
        lineTo(22f, 7f)
        curveTo(22f, 7f, 16.7212f, 12.3998f, 7.50294f, 16.2667f)
        }
        }.build()

        return _nike!!
    }

private var _nike: ImageVector? = null
