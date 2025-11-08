package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilterEdit: ImageVector
    get() {
        if (_filterEdit != null) {
            return _filterEdit!!
        }
        _filterEdit = ImageVector.Builder(
            name = "FilterEdit",
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
        moveTo(13.2426f, 17.5f)
        curveTo(13.1955f, 17.8033f, 13.1531f, 18.0485f, 13.1164f, 18.2442f)
        curveTo(12.8876f, 19.4657f, 11.1555f, 20.2006f, 10.2283f, 20.8563f)
        curveTo(9.67638f, 21.2466f, 9.00662f, 20.782f, 8.9351f, 20.1778f)
        curveTo(8.79875f, 19.0261f, 8.54193f, 16.6864f, 8.26159f, 13.2614f)
        curveTo(8.23641f, 12.9539f, 8.08718f, 12.6761f, 7.85978f, 12.5061f)
        curveTo(5.37133f, 10.6456f, 3.59796f, 8.59917f, 2.62966f, 7.44869f)
        curveTo(2.32992f, 7.09255f, 2.2317f, 6.83192f, 2.17265f, 6.37282f)
        curveTo(1.97043f, 4.80082f, 1.86933f, 4.01482f, 2.33027f, 3.50742f)
        curveTo(2.79122f, 3.00002f, 3.60636f, 3.00002f, 5.23665f, 3.00002f)
        horizontalLineTo(16.768f)
        curveTo(18.3983f, 3.00002f, 19.2134f, 3.00002f, 19.6743f, 3.50742f)
        curveTo(19.8979f, 3.75348f, 19.9892f, 4.06506f, 20.001f, 4.50002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.8628f, 7.4392f)
        lineTo(21.5571f, 8.13157f)
        curveTo(22.1445f, 8.71735f, 22.1445f, 9.6671f, 21.5571f, 10.2529f)
        lineTo(17.9196f, 13.9486f)
        curveTo(17.6335f, 14.2339f, 17.2675f, 14.4263f, 16.8697f, 14.5003f)
        lineTo(14.6153f, 14.9884f)
        curveTo(14.2593f, 15.0655f, 13.9424f, 14.7503f, 14.0186f, 14.3951f)
        lineTo(14.4985f, 12.1598f)
        curveTo(14.5728f, 11.7631f, 14.7657f, 11.3981f, 15.0518f, 11.1128f)
        lineTo(18.7356f, 7.4392f)
        curveTo(19.323f, 6.85342f, 20.2754f, 6.85342f, 20.8628f, 7.4392f)
        }
        }.build()

        return _filterEdit!!
    }

private var _filterEdit: ImageVector? = null
