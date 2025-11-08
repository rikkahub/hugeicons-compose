package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ApproximatelyEqualCircle: ImageVector
    get() {
        if (_approximatelyEqualCircle != null) {
            return _approximatelyEqualCircle!!
        }
        _approximatelyEqualCircle = ImageVector.Builder(
            name = "ApproximatelyEqualCircle",
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
        moveTo(7f, 9.28466f)
        curveTo(8.66667f, 7.2854f, 10.3333f, 7.87052f, 12f, 9.33333f)
        curveTo(13.6667f, 10.7961f, 15.3333f, 11.3813f, 17f, 9.382f)
        moveTo(7f, 14.618f)
        curveTo(8.66667f, 12.6187f, 10.3333f, 13.2039f, 12f, 14.6667f)
        curveTo(13.6667f, 16.1295f, 15.3333f, 16.7146f, 17f, 14.7153f)
        }
        }.build()

        return _approximatelyEqualCircle!!
    }

private var _approximatelyEqualCircle: ImageVector? = null
