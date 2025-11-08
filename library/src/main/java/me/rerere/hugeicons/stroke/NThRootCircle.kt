package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NThRootCircle: ImageVector
    get() {
        if (_nThRootCircle != null) {
            return _nThRootCircle!!
        }
        _nThRootCircle = ImageVector.Builder(
            name = "NThRootCircle",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5048f, 8.4856f)
        lineTo(12.2537f, 8.4856f)
        curveTo(11.437f, 8.4856f, 11.4844f, 8.63922f, 11.3234f, 9.46327f)
        lineTo(10.0145f, 14.5135f)
        curveTo(9.68244f, 15.8416f, 9.28914f, 15.4713f, 9.28914f, 15.4713f)
        curveTo(8.92914f, 15.3513f, 8.87392f, 15.2098f, 8.26415f, 13.9575f)
        lineTo(7.85415f, 13.0742f)
        curveTo(7.5915f, 12.5348f, 7.26222f, 12.5984f, 7.08189f, 12.6799f)
        curveTo(7.08189f, 12.6799f, 6.80521f, 12.7806f, 6.49805f, 12.9798f)
        moveTo(12.997f, 11.506f)
        curveTo(13.417f, 11.4921f, 13.8643f, 11.4693f, 14.0896f, 11.9238f)
        curveTo(14.4329f, 12.6162f, 14.9494f, 13.8129f, 15.1513f, 14.263f)
        curveTo(15.2523f, 14.4361f, 15.5682f, 14.4902f, 15.5682f, 14.4902f)
        curveTo(15.8375f, 14.5248f, 16.1408f, 14.5135f, 16.1408f, 14.5135f)
        moveTo(16.3327f, 11.506f)
        curveTo(15.4865f, 11.506f, 14.9876f, 12.4814f, 14.5138f, 13.0742f)
        curveTo(13.9045f, 13.9809f, 13.4598f, 14.4902f, 12.8042f, 14.5135f)
        }
        }.build()

        return _nThRootCircle!!
    }

private var _nThRootCircle: ImageVector? = null
