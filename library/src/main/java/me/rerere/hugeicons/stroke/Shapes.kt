package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = ImageVector.Builder(
            name = "Shapes",
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
        moveTo(4f, 8f)
        curveTo(6.20914f, 8f, 8f, 6.20914f, 8f, 4f)
        curveTo(8f, 3.2722f, 8f, 2.90829f, 8.02385f, 2.80107f)
        curveTo(8.13266f, 2.31172f, 8.28121f, 2.16103f, 8.76894f, 2.0452f)
        curveTo(8.87582f, 2.01982f, 9.08666f, 2.01679f, 9.50835f, 2.01074f)
        curveTo(10.2571f, 2f, 11.084f, 2f, 12f, 2f)
        curveTo(13.3714f, 2f, 14.5433f, 2f, 15.5518f, 2.03606f)
        curveTo(15.9598f, 2.05065f, 16.1639f, 2.05794f, 16.2867f, 2.09469f)
        curveTo(16.7096f, 2.22123f, 16.8563f, 2.37333f, 16.9677f, 2.80046f)
        curveTo(17f, 2.92452f, 17f, 3.28301f, 17f, 4f)
        curveTo(17f, 6.20914f, 18.7909f, 8f, 21f, 8f)
        curveTo(21.4931f, 8f, 21.963f, 8.34313f, 21.9759f, 8.83609f)
        curveTo(22f, 9.75428f, 22f, 10.8009f, 22f, 12f)
        curveTo(22f, 12.916f, 22f, 13.7429f, 21.9893f, 14.4916f)
        curveTo(21.9832f, 14.9133f, 21.9802f, 15.1242f, 21.9548f, 15.2311f)
        curveTo(21.839f, 15.7188f, 21.6883f, 15.8673f, 21.1989f, 15.9762f)
        curveTo(21.0917f, 16f, 20.7278f, 16f, 20f, 16f)
        curveTo(17.7909f, 16f, 16f, 17.7909f, 16f, 20f)
        curveTo(16f, 20.7278f, 16f, 21.0917f, 15.9762f, 21.1989f)
        curveTo(15.8673f, 21.6883f, 15.7188f, 21.839f, 15.2311f, 21.9548f)
        curveTo(15.1242f, 21.9802f, 14.9133f, 21.9832f, 14.4917f, 21.9893f)
        curveTo(13.7429f, 22f, 12.916f, 22f, 12f, 22f)
        curveTo(11.084f, 22f, 10.2571f, 22f, 9.50835f, 21.9893f)
        curveTo(9.08666f, 21.9832f, 8.87582f, 21.9802f, 8.76894f, 21.9548f)
        curveTo(8.28121f, 21.839f, 8.13266f, 21.6883f, 8.02385f, 21.1989f)
        curveTo(8f, 21.0917f, 8f, 20.7278f, 8f, 20f)
        curveTo(8f, 17.7909f, 6.20914f, 16f, 4f, 16f)
        curveTo(3.27219f, 16f, 2.90829f, 16f, 2.80106f, 15.9762f)
        curveTo(2.31172f, 15.8673f, 2.16103f, 15.7188f, 2.0452f, 15.2311f)
        curveTo(2.01982f, 15.1242f, 2.01679f, 14.9133f, 2.01074f, 14.4916f)
        curveTo(2f, 13.7429f, 2f, 12.916f, 2f, 12f)
        curveTo(2f, 11.084f, 2f, 10.2571f, 2.01074f, 9.50835f)
        curveTo(2.01679f, 9.08666f, 2.01982f, 8.87582f, 2.0452f, 8.76894f)
        curveTo(2.16103f, 8.28121f, 2.31172f, 8.13266f, 2.80107f, 8.02385f)
        curveTo(2.90829f, 8f, 3.2722f, 8f, 4f, 8f)
        }
        }.build()

        return _shapes!!
    }

private var _shapes: ImageVector? = null
