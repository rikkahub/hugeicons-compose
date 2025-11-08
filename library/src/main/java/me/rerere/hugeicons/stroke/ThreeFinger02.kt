package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThreeFinger02: ImageVector
    get() {
        if (_threeFinger02 != null) {
            return _threeFinger02!!
        }
        _threeFinger02 = ImageVector.Builder(
            name = "ThreeFinger02",
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
        moveTo(7.75971f, 13.4795f)
        lineTo(7.74145f, 5.02886f)
        curveTo(7.73965f, 4.1996f, 8.41205f, 3.52639f, 9.2421f, 3.52639f)
        curveTo(10.0709f, 3.52639f, 10.7428f, 4.19762f, 10.7428f, 5.02563f)
        moveTo(10.7428f, 5.02563f)
        verticalLineTo(10.0056f)
        moveTo(10.7428f, 5.02563f)
        lineTo(10.7428f, 3.49728f)
        curveTo(10.7428f, 2.66928f, 11.4146f, 1.99805f, 12.2434f, 1.99805f)
        curveTo(13.0735f, 1.99805f, 13.7459f, 2.67125f, 13.7441f, 3.50051f)
        lineTo(13.7441f, 11.0103f)
        moveTo(16.7454f, 11.9977f)
        verticalLineTo(10.1448f)
        moveTo(16.7454f, 10.1448f)
        verticalLineTo(5.48285f)
        curveTo(16.7472f, 4.65359f, 16.0748f, 3.98039f, 15.2448f, 3.98039f)
        curveTo(14.416f, 3.98039f, 13.7441f, 4.65162f, 13.7441f, 5.47962f)
        moveTo(16.7454f, 10.1448f)
        curveTo(17.552f, 10.024f, 19.5243f, 10.1448f, 19.7475f, 12.0023f)
        verticalLineTo(15.684f)
        curveTo(19.7475f, 17.0435f, 19.5178f, 18.1434f, 18.1285f, 19.7409f)
        curveTo(17.6131f, 20.4161f, 17.6846f, 21.0947f, 17.6846f, 22.002f)
        moveTo(7.75002f, 8.9992f)
        curveTo(7.11294f, 9.55515f, 5.50173f, 11.0778f, 4.59852f, 12.4555f)
        curveTo(3.34405f, 14.369f, 5.82174f, 16.8627f, 6.84695f, 18.2521f)
        curveTo(8.36321f, 20.0648f, 8.26197f, 20.0142f, 8.26197f, 21.9951f)
        }
        }.build()

        return _threeFinger02!!
    }

private var _threeFinger02: ImageVector? = null
