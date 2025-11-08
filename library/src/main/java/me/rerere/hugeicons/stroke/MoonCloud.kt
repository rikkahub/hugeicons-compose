package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonCloud: ImageVector
    get() {
        if (_moonCloud != null) {
            return _moonCloud!!
        }
        _moonCloud = ImageVector.Builder(
            name = "MoonCloud",
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
        moveTo(17.4776f, 12.0001f)
        curveTo(17.485f, 12f, 17.4925f, 12f, 17.5f, 12f)
        curveTo(19.9853f, 12f, 22f, 14.0147f, 22f, 16.5f)
        curveTo(22f, 18.9853f, 19.9853f, 21f, 17.5f, 21f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 21f, 2f, 18.7614f, 2f, 16f)
        curveTo(2f, 13.4003f, 3.98398f, 11.2641f, 6.52042f, 11.0227f)
        moveTo(17.4776f, 12.0001f)
        curveTo(17.4924f, 11.8354f, 17.5f, 11.6686f, 17.5f, 11.5f)
        curveTo(17.5f, 8.46243f, 15.0376f, 6f, 12f, 6f)
        curveTo(9.12324f, 6f, 6.76233f, 8.20862f, 6.52042f, 11.0227f)
        moveTo(17.4776f, 12.0001f)
        curveTo(17.3753f, 13.1345f, 16.9286f, 14.1696f, 16.2428f, 15f)
        moveTo(6.52042f, 11.0227f)
        curveTo(6.67826f, 11.0077f, 6.83823f, 11f, 7f, 11f)
        curveTo(8.12582f, 11f, 9.16474f, 11.3721f, 10.0005f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 5.53058f)
        curveTo(10.9061f, 5.04705f, 10.7328f, 4.5707f, 10.4752f, 4.12013f)
        curveTo(9.85932f, 3.04292f, 8.87603f, 2.31347f, 7.77746f, 2f)
        curveTo(7.94723f, 3.37965f, 7.30486f, 4.79173f, 6.03759f, 5.53058f)
        curveTo(4.77033f, 6.26942f, 3.23814f, 6.12516f, 2.13984f, 5.28687f)
        curveTo(1.85939f, 6.40434f, 1.99332f, 7.62899f, 2.6092f, 8.7062f)
        curveTo(3.44206f, 10.1629f, 4.94685f, 10.9839f, 6.5f, 11f)
        }
        }.build()

        return _moonCloud!!
    }

private var _moonCloud: ImageVector? = null
