package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Colosseum: ImageVector
    get() {
        if (_colosseum != null) {
            return _colosseum!!
        }
        _colosseum = ImageVector.Builder(
            name = "Colosseum",
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
        moveTo(11.8934f, 20.8654f)
        lineTo(12.0206f, 19.0266f)
        moveTo(7.91638f, 20.9237f)
        lineTo(8.04356f, 19.0266f)
        moveTo(6.05503f, 15.5229f)
        verticalLineTo(13.5208f)
        moveTo(10.0321f, 8.75557f)
        lineTo(8.13307f, 4.16724f)
        curveTo(7.8936f, 3.52902f, 6.88092f, 2.34355f, 5.24116f, 3.46072f)
        curveTo(4.37391f, 4.05158f, 3.58048f, 4.59256f, 3.02538f, 4.97115f)
        curveTo(2.52025f, 5.31565f, 2.19911f, 5.87232f, 2.16708f, 6.48575f)
        curveTo(1.96653f, 10.3263f, 1.93813f, 16.851f, 2.12774f, 19.0054f)
        curveTo(2.13145f, 19.7304f, 2.42599f, 21.057f, 4.68582f, 20.9917f)
        curveTo(4.68582f, 20.9917f, 18.9127f, 20.9356f, 19.5555f, 20.9917f)
        curveTo(20.1983f, 21.0477f, 21.9261f, 20.8669f, 21.9261f, 19.0054f)
        curveTo(22.0106f, 17.5599f, 22.0268f, 15.4225f, 21.9528f, 14.0229f)
        curveTo(21.9229f, 13.4574f, 21.6972f, 12.9214f, 21.2652f, 12.5587f)
        curveTo(20.4509f, 11.8749f, 19.0102f, 10.926f, 16.9851f, 10.0247f)
        lineTo(16.9236f, 12.0571f)
        lineTo(13.4161f, 11.9701f)
        moveTo(2.00373f, 12.8543f)
        curveTo(3.48472f, 11.0376f, 8.36491f, 8.57984f, 11.4174f, 8.64081f)
        curveTo(11.769f, 8.64783f, 12.0655f, 8.88467f, 12.2009f, 9.21139f)
        lineTo(14.6783f, 15.1908f)
        moveTo(14.6783f, 15.1908f)
        lineTo(16.9681f, 20.968f)
        moveTo(14.6783f, 15.1908f)
        curveTo(8.85179f, 14.6002f, 4.09893f, 16.0215f, 2.03479f, 17.0636f)
        moveTo(14.6783f, 15.1908f)
        curveTo(16.9404f, 15.4201f, 19.1002f, 15.7897f, 21.9939f, 16.9925f)
        moveTo(10.0321f, 15.0224f)
        verticalLineTo(13.0203f)
        }
        }.build()

        return _colosseum!!
    }

private var _colosseum: ImageVector? = null
