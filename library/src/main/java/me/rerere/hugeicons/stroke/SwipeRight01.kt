package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeRight01: ImageVector
    get() {
        if (_swipeRight01 != null) {
            return _swipeRight01!!
        }
        _swipeRight01 = ImageVector.Builder(
            name = "SwipeRight01",
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
        moveTo(21.001f, 4.49905f)
        horizontalLineTo(15.001f)
        moveTo(21.001f, 4.49905f)
        curveTo(21.001f, 3.79909f, 19.0067f, 2.49134f, 18.501f, 2f)
        moveTo(21.001f, 4.49905f)
        curveTo(21.001f, 5.19901f, 19.0067f, 6.50675f, 18.501f, 6.9981f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.8942f, 21.9884f)
        curveTo(16.8424f, 20.0751f, 16.9713f, 19.8448f, 17.1081f, 19.4191f)
        curveTo(17.2448f, 18.9935f, 18.2011f, 17.4587f, 18.5395f, 16.3621f)
        curveTo(19.6342f, 12.8141f, 18.6139f, 12.0595f, 17.2536f, 11.0534f)
        curveTo(15.7451f, 9.93759f, 12.8997f, 9.37252f, 11.4886f, 9.49486f)
        verticalLineTo(3.74359f)
        curveTo(11.4886f, 2.78063f, 10.7077f, 2f, 9.74439f, 2f)
        curveTo(8.78106f, 2f, 8.00014f, 2.78063f, 8.00014f, 3.74359f)
        verticalLineTo(14.0032f)
        lineTo(5.93997f, 11.8238f)
        curveTo(5.30035f, 11.1303f, 4.27243f, 11.06f, 3.5709f, 11.6908f)
        curveTo(2.90609f, 12.2886f, 2.80906f, 13.2953f, 3.34749f, 14.009f)
        lineTo(4.63984f, 15.722f)
        moveTo(7.87078f, 22.0002f)
        lineTo(7.85125f, 20.9498f)
        curveTo(7.89419f, 19.7185f, 6.9982f, 18.9151f, 5.82962f, 17.3089f)
        curveTo(5.74542f, 17.1931f, 5.6635f, 17.0813f, 5.58372f, 16.973f)
        moveTo(5.58372f, 16.973f)
        curveTo(5.22966f, 16.4926f, 4.91814f, 16.0832f, 4.63984f, 15.722f)
        moveTo(5.58372f, 16.973f)
        lineTo(6.75315f, 18.5231f)
        moveTo(5.58372f, 16.973f)
        lineTo(4.63984f, 15.722f)
        moveTo(4.63984f, 15.722f)
        curveTo(4.06847f, 14.9802f, 3.63715f, 14.4412f, 3.26531f, 13.9056f)
        }
        }.build()

        return _swipeRight01!!
    }

private var _swipeRight01: ImageVector? = null
