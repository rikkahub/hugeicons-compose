package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Swimming: ImageVector
    get() {
        if (_swimming != null) {
            return _swimming!!
        }
        _swimming = ImageVector.Builder(
            name = "Swimming",
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
        moveTo(10.7184f, 6.86177f)
        lineTo(15f, 16f)
        curveTo(12.8333f, 16f, 12.1739f, 14.8571f, 9.91304f, 13.7143f)
        curveTo(8.10435f, 12.8f, 5.57971f, 12.9524f, 4.82609f, 13.1429f)
        lineTo(7.85739f, 10.9998f)
        curveTo(8.16585f, 10.7817f, 8.32008f, 10.6727f, 8.36937f, 10.5067f)
        curveTo(8.41866f, 10.3407f, 8.34893f, 10.1651f, 8.20947f, 9.81406f)
        lineTo(7.78519f, 8.74593f)
        curveTo(7.62654f, 8.34653f, 7.54721f, 8.14683f, 7.40384f, 8.00197f)
        curveTo(7.35388f, 7.9515f, 7.2987f, 7.9065f, 7.23922f, 7.86772f)
        curveTo(7.06848f, 7.7564f, 6.8569f, 7.71887f, 6.43376f, 7.64379f)
        lineTo(3.18315f, 7.06706f)
        curveTo(2.4987f, 6.94562f, 2f, 6.35065f, 2f, 5.65551f)
        curveTo(2f, 4.78222f, 2.77418f, 4.11181f, 3.63851f, 4.23665f)
        lineTo(8.0343f, 4.87152f)
        curveTo(8.82604f, 4.98586f, 9.22191f, 5.04304f, 9.5521f, 5.23177f)
        curveTo(9.68974f, 5.31045f, 9.81754f, 5.40521f, 9.93281f, 5.51407f)
        curveTo(10.2093f, 5.7752f, 10.379f, 6.13739f, 10.7184f, 6.86177f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 18.0843f)
        curveTo(3.05556f, 14.5527f, 7.7685f, 16.1736f, 11.5f, 18.0843f)
        curveTo(15.2315f, 19.995f, 19f, 21.2108f, 21f, 18.0843f)
        }
        }.build()

        return _swimming!!
    }

private var _swimming: ImageVector? = null
