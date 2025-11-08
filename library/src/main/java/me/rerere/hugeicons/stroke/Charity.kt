package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Charity: ImageVector
    get() {
        if (_charity != null) {
            return _charity!!
        }
        _charity = ImageVector.Builder(
            name = "Charity",
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
        moveTo(7f, 19f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 16f)
        curveTo(19.7767f, 16.0234f, 20.24f, 16.1102f, 20.5607f, 16.4313f)
        curveTo(21f, 16.8713f, 21f, 17.5794f, 21f, 18.9957f)
        curveTo(21f, 20.4119f, 21f, 21.12f, 20.5607f, 21.56f)
        curveTo(20.1213f, 22f, 19.4142f, 22f, 18f, 22f)
        horizontalLineTo(6f)
        curveTo(4.58579f, 22f, 3.87868f, 22f, 3.43934f, 21.56f)
        curveTo(3f, 21.12f, 3f, 20.4119f, 3f, 18.9957f)
        curveTo(3f, 17.5794f, 3f, 16.8713f, 3.43934f, 16.4313f)
        curveTo(3.75999f, 16.1102f, 4.22328f, 16.0234f, 5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.3151f, 19f)
        curveTo(15.0417f, 18.3718f, 15.5f, 17.4526f, 15.5f, 16.4286f)
        curveTo(15.5f, 14.535f, 13.933f, 13f, 12f, 13f)
        curveTo(10.067f, 13f, 8.5f, 14.535f, 8.5f, 16.4286f)
        curveTo(8.5f, 17.4526f, 8.95829f, 18.3718f, 9.6849f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 10f)
        lineTo(17.6052f, 10f)
        curveTo(17.311f, 10f, 17.0209f, 9.93373f, 16.7578f, 9.80643f)
        lineTo(14.7159f, 8.81844f)
        curveTo(14.4528f, 8.69114f, 14.1627f, 8.62487f, 13.8685f, 8.62487f)
        lineTo(12.8259f, 8.62487f)
        curveTo(11.8175f, 8.62487f, 11f, 7.83382f, 11f, 6.858f)
        curveTo(11f, 6.81856f, 11.027f, 6.7839f, 11.0662f, 6.77306f)
        lineTo(13.6071f, 6.07055f)
        curveTo(14.0629f, 5.94453f, 14.551f, 5.98842f, 14.975f, 6.19357f)
        lineTo(17.1579f, 7.24974f)
        moveTo(11f, 7.5f)
        lineTo(6.40723f, 8.91108f)
        curveTo(5.59303f, 9.16476f, 4.71292f, 8.86396f, 4.2029f, 8.1577f)
        curveTo(3.83414f, 7.64706f, 3.98428f, 6.91581f, 4.52154f, 6.60583f)
        lineTo(12.0371f, 2.26947f)
        curveTo(12.5151f, 1.99367f, 13.0791f, 1.92638f, 13.6048f, 2.08239f)
        lineTo(20f, 3.98005f)
        }
        }.build()

        return _charity!!
    }

private var _charity: ImageVector? = null
