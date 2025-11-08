package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CongruentToCircle: ImageVector
    get() {
        if (_congruentToCircle != null) {
            return _congruentToCircle!!
        }
        _congruentToCircle = ImageVector.Builder(
            name = "CongruentToCircle",
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
        moveTo(7.5f, 12.5022f)
        horizontalLineTo(16.5f)
        moveTo(7.5f, 16f)
        horizontalLineTo(16.5f)
        moveTo(7.5f, 9.50402f)
        curveTo(8.4f, 7.64165f, 10.5f, 7.54875f, 12f, 9.00431f)
        moveTo(16.5f, 8.49966f)
        curveTo(15.6f, 10.362f, 13.5f, 10.4549f, 12f, 8.99937f)
        }
        }.build()

        return _congruentToCircle!!
    }

private var _congruentToCircle: ImageVector? = null
