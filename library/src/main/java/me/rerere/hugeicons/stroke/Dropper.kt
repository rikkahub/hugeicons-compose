package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dropper: ImageVector
    get() {
        if (_dropper != null) {
            return _dropper!!
        }
        _dropper = ImageVector.Builder(
            name = "Dropper",
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
        moveTo(11.2872f, 8.00018f)
        lineTo(4.68174f, 14.6057f)
        curveTo(4.05287f, 15.2345f, 3.72789f, 16.0522f, 3.70679f, 16.8762f)
        curveTo(3.67836f, 17.9861f, 3.66415f, 18.5411f, 3.57991f, 18.7373f)
        curveTo(3.49566f, 18.9336f, 3.30358f, 19.1257f, 2.91944f, 19.5098f)
        lineTo(2.32535f, 20.1039f)
        curveTo(1.89155f, 20.5377f, 1.89155f, 21.241f, 2.32535f, 21.6748f)
        curveTo(2.75915f, 22.1086f, 3.46247f, 22.1086f, 3.89627f, 21.6748f)
        lineTo(4.49036f, 21.0807f)
        curveTo(4.87451f, 20.6966f, 5.06658f, 20.5045f, 5.26283f, 20.4203f)
        curveTo(5.45909f, 20.336f, 6.01406f, 20.3218f, 7.12396f, 20.2934f)
        curveTo(7.94797f, 20.2723f, 8.76565f, 19.9473f, 9.39451f, 19.3184f)
        lineTo(11.3227f, 17.3903f)
        moveTo(14.4291f, 14.2839f)
        lineTo(16f, 12.713f)
        moveTo(14.4291f, 14.2839f)
        lineTo(12.8582f, 12.713f)
        moveTo(14.4291f, 14.2839f)
        lineTo(11.3227f, 17.3903f)
        moveTo(11.3227f, 17.3903f)
        lineTo(9.75177f, 15.8193f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.068f, 7.43213f)
        lineTo(19.5002f, 8.99992f)
        curveTo(18.6718f, 9.82837f, 18.6718f, 11.1715f, 19.5002f, 12f)
        lineTo(12f, 4.49979f)
        curveTo(12.8285f, 5.32824f, 14.1716f, 5.32824f, 15.0001f, 4.49979f)
        lineTo(16.5679f, 2.93201f)
        curveTo(17.8105f, 1.68933f, 19.8253f, 1.68933f, 21.068f, 2.93201f)
        curveTo(22.3107f, 4.17468f, 22.3107f, 6.18946f, 21.068f, 7.43213f)
        }
        }.build()

        return _dropper!!
    }

private var _dropper: ImageVector? = null
