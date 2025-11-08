package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Complaint: ImageVector
    get() {
        if (_complaint != null) {
            return _complaint!!
        }
        _complaint = ImageVector.Builder(
            name = "Complaint",
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
        moveTo(16.9961f, 9.01264f)
        horizontalLineTo(17.0042f)
        moveTo(17.0045f, 7.00903f)
        verticalLineTo(4.50451f)
        moveTo(22f, 6.792f)
        curveTo(22f, 9.43833f, 19.7593f, 11.584f, 16.9961f, 11.584f)
        curveTo(16.6711f, 11.5844f, 16.3472f, 11.5543f, 16.028f, 11.4943f)
        curveTo(15.7983f, 11.4511f, 15.6835f, 11.4296f, 15.6033f, 11.4418f)
        curveTo(15.523f, 11.454f, 15.4094f, 11.5145f, 15.1822f, 11.6356f)
        curveTo(14.5393f, 11.9778f, 13.7896f, 12.0987f, 13.0686f, 11.9645f)
        curveTo(13.3426f, 11.627f, 13.5298f, 11.2222f, 13.6123f, 10.7882f)
        curveTo(13.6624f, 10.5228f, 13.5384f, 10.2649f, 13.3526f, 10.0762f)
        curveTo(12.5093f, 9.21878f, 11.9922f, 8.06347f, 11.9922f, 6.792f)
        curveTo(11.9922f, 4.14565f, 14.2328f, 2f, 16.9961f, 2f)
        curveTo(19.7593f, 2f, 22f, 4.14565f, 22f, 6.792f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50189f, 22f)
        horizontalLineTo(4.71817f)
        curveTo(4.39488f, 22f, 4.07021f, 21.9545f, 3.77327f, 21.8269f)
        curveTo(2.80666f, 21.4116f, 2.31624f, 20.8633f, 2.08769f, 20.5202f)
        curveTo(1.95764f, 20.325f, 1.97617f, 20.0764f, 2.11726f, 19.889f)
        curveTo(3.23716f, 18.4015f, 5.8337f, 17.503f, 7.50189f, 17.5029f)
        moveTo(7.50665f, 22f)
        horizontalLineTo(10.2904f)
        curveTo(10.6137f, 22f, 10.9383f, 21.9545f, 11.2353f, 21.8269f)
        curveTo(12.2019f, 21.4116f, 12.6923f, 20.8633f, 12.9209f, 20.5202f)
        curveTo(13.0509f, 20.325f, 13.0324f, 20.0764f, 12.8913f, 19.889f)
        curveTo(11.7714f, 18.4015f, 9.17484f, 17.503f, 7.50665f, 17.5029f)
        moveTo(10.2854f, 12.2888f)
        curveTo(10.2854f, 13.8201f, 9.0413f, 15.0614f, 7.50665f, 15.0614f)
        curveTo(5.97199f, 15.0614f, 4.72791f, 13.8201f, 4.72791f, 12.2888f)
        curveTo(4.72791f, 10.7575f, 5.97199f, 9.51611f, 7.50665f, 9.51611f)
        curveTo(9.0413f, 9.51611f, 10.2854f, 10.7575f, 10.2854f, 12.2888f)
        }
        }.build()

        return _complaint!!
    }

private var _complaint: ImageVector? = null
