package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = ImageVector.Builder(
            name = "Stamp",
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
        moveTo(17.6667f, 21f)
        horizontalLineTo(6.33333f)
        curveTo(6.02334f, 21f, 5.86835f, 21f, 5.74118f, 20.9574f)
        curveTo(5.39609f, 20.8418f, 5.12654f, 20.5049f, 5.03407f, 20.0735f)
        curveTo(5f, 19.9146f, 5f, 19.7208f, 5f, 19.3333f)
        curveTo(5f, 18.5584f, 5f, 18.1709f, 5.06815f, 17.853f)
        curveTo(5.25308f, 16.9902f, 5.79218f, 16.3164f, 6.48236f, 16.0852f)
        curveTo(6.7367f, 16f, 7.04669f, 16f, 7.66667f, 16f)
        horizontalLineTo(16.3333f)
        curveTo(16.9533f, 16f, 17.2633f, 16f, 17.5176f, 16.0852f)
        curveTo(18.2078f, 16.3164f, 18.7469f, 16.9902f, 18.9319f, 17.853f)
        curveTo(19f, 18.1709f, 19f, 18.5584f, 19f, 19.3333f)
        curveTo(19f, 19.7208f, 19f, 19.9146f, 18.9659f, 20.0735f)
        curveTo(18.8735f, 20.5049f, 18.6039f, 20.8418f, 18.2588f, 20.9574f)
        curveTo(18.1317f, 21f, 17.9767f, 21f, 17.6667f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50044f, 16f)
        curveTo(10.0151f, 13.4523f, 10.0845f, 11.9663f, 9.75631f, 11.0497f)
        curveTo(9.68503f, 10.8507f, 9.56363f, 10.6749f, 9.44039f, 10.5034f)
        curveTo(8.62715f, 9.37155f, 8.25775f, 8.48762f, 8.11746f, 7.94129f)
        curveTo(8.03527f, 7.62119f, 8.0097f, 7.28611f, 8.02447f, 6.95595f)
        curveTo(8.0513f, 6.35609f, 8.2462f, 5.4471f, 8.87882f, 4.56208f)
        curveTo(9.72889f, 3.37285f, 11.3129f, 3.007f, 12.0004f, 3f)
        curveTo(12.688f, 3.007f, 14.3133f, 3.37285f, 15.1634f, 4.56208f)
        curveTo(15.796f, 5.4471f, 15.9909f, 6.35609f, 16.0177f, 6.95595f)
        curveTo(16.0325f, 7.28611f, 16.0069f, 7.62119f, 15.9247f, 7.94129f)
        curveTo(15.7845f, 8.48762f, 15.4151f, 9.37155f, 14.6018f, 10.5034f)
        curveTo(14.4786f, 10.6749f, 14.3572f, 10.8507f, 14.2859f, 11.0497f)
        curveTo(13.9577f, 11.9663f, 13.9858f, 13.4523f, 14.5004f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 13f)
        horizontalLineTo(10f)
        }
        }.build()

        return _stamp!!
    }

private var _stamp: ImageVector? = null
