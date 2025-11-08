package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingRight03: ImageVector
    get() {
        if (_pointingRight03 != null) {
            return _pointingRight03!!
        }
        _pointingRight03 = ImageVector.Builder(
            name = "PointingRight03",
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
        moveTo(11.329f, 7.87124f)
        lineTo(9.5f, 10.0051f)
        lineTo(19.25f, 10.0051f)
        curveTo(20.2165f, 10.0051f, 21f, 10.7886f, 21f, 11.7551f)
        curveTo(21f, 12.7216f, 20.2165f, 13.5051f, 19.25f, 13.5051f)
        horizontalLineTo(14f)
        lineTo(13.5224f, 16.493f)
        curveTo(13.2331f, 18.4216f, 13.0885f, 19.386f, 12.6816f, 20.0652f)
        curveTo(12.0094f, 21.1872f, 11f, 22f, 9.52639f, 22f)
        curveTo(8.5f, 22f, 7.8114f, 21.7463f, 5.96127f, 21.1296f)
        curveTo(4.78734f, 20.7383f, 4.20036f, 20.5426f, 3.73571f, 20.2236f)
        curveTo(2.97073f, 19.6983f, 2.4122f, 18.9233f, 2.15576f, 18.0315f)
        curveTo(2f, 17.4898f, 2f, 16.8711f, 2f, 15.6336f)
        lineTo(2f, 14.5847f)
        curveTo(2f, 12.9395f, 2f, 12.1169f, 2.30186f, 11.3846f)
        curveTo(2.356f, 11.2533f, 2.41709f, 11.1249f, 2.48487f, 11.0001f)
        curveTo(2.86288f, 10.304f, 3.50129f, 9.78533f, 4.77813f, 8.74791f)
        lineTo(8.91166f, 5.38941f)
        curveTo(9.54686f, 4.87331f, 10.4559f, 4.86987f, 11.095f, 5.38114f)
        curveTo(11.8631f, 5.99565f, 11.9692f, 7.12437f, 11.329f, 7.87124f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4.5f)
        lineTo(16f, 4.5f)
        moveTo(22f, 4.5f)
        curveTo(22f, 3.79977f, 20.0057f, 2.49153f, 19.5f, 2f)
        moveTo(22f, 4.5f)
        curveTo(22f, 5.20023f, 20.0057f, 6.50847f, 19.5f, 7f)
        }
        }.build()

        return _pointingRight03!!
    }

private var _pointingRight03: ImageVector? = null
