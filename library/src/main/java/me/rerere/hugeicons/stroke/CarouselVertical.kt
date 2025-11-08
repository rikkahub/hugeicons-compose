package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) {
            return _carouselVertical!!
        }
        _carouselVertical = ImageVector.Builder(
            name = "CarouselVertical",
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
        moveTo(16f, 7f)
        curveTo(18.357f, 7f, 19.5355f, 7f, 20.2678f, 7.73223f)
        curveTo(21f, 8.46447f, 21f, 9.64298f, 21f, 12f)
        curveTo(21f, 14.357f, 21f, 15.5355f, 20.2678f, 16.2678f)
        curveTo(19.5355f, 17f, 18.357f, 17f, 16f, 17f)
        horizontalLineTo(8f)
        curveTo(5.64298f, 17f, 4.46447f, 17f, 3.73223f, 16.2678f)
        curveTo(3f, 15.5355f, 3f, 14.357f, 3f, 12f)
        curveTo(3f, 9.64298f, 3f, 8.46447f, 3.73223f, 7.73223f)
        curveTo(4.46447f, 7f, 5.64298f, 7f, 8f, 7f)
        lineTo(16f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 2f)
        curveTo(16.8955f, 2.54697f, 16.7107f, 2.94952f, 16.3838f, 3.26777f)
        curveTo(15.6316f, 4f, 14.4211f, 4f, 12f, 4f)
        curveTo(9.5789f, 4f, 8.36835f, 4f, 7.61621f, 3.26777f)
        curveTo(7.28931f, 2.94952f, 7.10449f, 2.54697f, 7f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22f)
        curveTo(16.8955f, 21.453f, 16.7107f, 21.0505f, 16.3838f, 20.7322f)
        curveTo(15.6316f, 20f, 14.4211f, 20f, 12f, 20f)
        curveTo(9.5789f, 20f, 8.36835f, 20f, 7.61621f, 20.7322f)
        curveTo(7.28931f, 21.0505f, 7.10449f, 21.453f, 7f, 22f)
        }
        }.build()

        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
