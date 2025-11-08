package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = ImageVector.Builder(
            name = "Tie",
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
        moveTo(8.72123f, 5.60945f)
        curveTo(8.1621f, 4.61908f, 7.88253f, 4.1239f, 8.04661f, 3.67371f)
        curveTo(8.21068f, 3.22353f, 8.73892f, 3.0364f, 9.7954f, 2.66213f)
        lineTo(10.695f, 2.34346f)
        curveTo(11.3413f, 2.11449f, 11.6645f, 2f, 12f, 2f)
        curveTo(12.3355f, 2f, 12.6587f, 2.11449f, 13.305f, 2.34346f)
        lineTo(14.2046f, 2.66213f)
        curveTo(15.2611f, 3.0364f, 15.7893f, 3.22353f, 15.9534f, 3.67371f)
        curveTo(16.1175f, 4.1239f, 15.8379f, 4.61908f, 15.2788f, 5.60945f)
        lineTo(14.7626f, 6.52365f)
        curveTo(14.4979f, 6.99256f, 14.3655f, 7.22701f, 14.1339f, 7.41087f)
        curveTo(13.9022f, 7.59473f, 13.6875f, 7.65614f, 13.2581f, 7.77895f)
        curveTo(12.8467f, 7.89659f, 12.3777f, 8f, 12f, 8f)
        curveTo(11.6223f, 8f, 11.1533f, 7.89659f, 10.7419f, 7.77895f)
        curveTo(10.3125f, 7.65614f, 10.0978f, 7.59473f, 9.86612f, 7.41087f)
        curveTo(9.63445f, 7.22701f, 9.50209f, 6.99256f, 9.23735f, 6.52365f)
        lineTo(8.72123f, 5.60945f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0793f, 8f)
        lineTo(8.42064f, 15.1438f)
        curveTo(8.06093f, 16.6931f, 7.88108f, 17.4677f, 8.08657f, 18.1961f)
        curveTo(8.09058f, 18.2103f, 8.09469f, 18.2245f, 8.09891f, 18.2386f)
        curveTo(8.31533f, 18.9638f, 8.88063f, 19.5172f, 10.0112f, 20.6238f)
        curveTo(10.9439f, 21.5368f, 11.4103f, 21.9933f, 11.9837f, 21.9999f)
        curveTo(11.9946f, 22f, 12.0054f, 22f, 12.0163f, 21.9999f)
        curveTo(12.5897f, 21.9933f, 13.0561f, 21.5368f, 13.9888f, 20.6238f)
        curveTo(15.1194f, 19.5172f, 15.6847f, 18.9638f, 15.9011f, 18.2386f)
        curveTo(15.9053f, 18.2245f, 15.9094f, 18.2103f, 15.9134f, 18.1961f)
        curveTo(16.1189f, 17.4677f, 15.9391f, 16.6931f, 15.5794f, 15.1438f)
        lineTo(13.9207f, 8f)
        }
        }.build()

        return _tie!!
    }

private var _tie: ImageVector? = null
