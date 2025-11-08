package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) {
            return _carouselHorizontal!!
        }
        _carouselHorizontal = ImageVector.Builder(
            name = "CarouselHorizontal",
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
        moveTo(7f, 8f)
        curveTo(7f, 5.64298f, 7f, 4.46447f, 7.73223f, 3.73223f)
        curveTo(8.46447f, 3f, 9.64298f, 3f, 12f, 3f)
        curveTo(14.357f, 3f, 15.5355f, 3f, 16.2678f, 3.73223f)
        curveTo(17f, 4.46447f, 17f, 5.64298f, 17f, 8f)
        verticalLineTo(16f)
        curveTo(17f, 18.357f, 17f, 19.5355f, 16.2678f, 20.2678f)
        curveTo(15.5355f, 21f, 14.357f, 21f, 12f, 21f)
        curveTo(9.64298f, 21f, 8.46447f, 21f, 7.73223f, 20.2678f)
        curveTo(7f, 19.5355f, 7f, 18.357f, 7f, 16f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        curveTo(2.54697f, 7.10449f, 2.94952f, 7.28931f, 3.26777f, 7.61621f)
        curveTo(4f, 8.36835f, 4f, 9.5789f, 4f, 12f)
        curveTo(4f, 14.4211f, 4f, 15.6316f, 3.26777f, 16.3838f)
        curveTo(2.94952f, 16.7107f, 2.54697f, 16.8955f, 2f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        curveTo(21.453f, 7.10449f, 21.0505f, 7.28931f, 20.7322f, 7.61621f)
        curveTo(20f, 8.36835f, 20f, 9.5789f, 20f, 12f)
        curveTo(20f, 14.4211f, 20f, 15.6316f, 20.7322f, 16.3838f)
        curveTo(21.0505f, 16.7107f, 21.453f, 16.8955f, 22f, 17f)
        }
        }.build()

        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
