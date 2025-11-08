package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CarouselHorizontal02: ImageVector
    get() {
        if (_carouselHorizontal02 != null) {
            return _carouselHorizontal02!!
        }
        _carouselHorizontal02 = ImageVector.Builder(
            name = "CarouselHorizontal02",
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
        moveTo(13f, 4f)
        horizontalLineTo(11f)
        curveTo(8.64298f, 4f, 7.46447f, 4f, 6.73223f, 4.73223f)
        curveTo(6f, 5.46447f, 6f, 6.64298f, 6f, 9f)
        verticalLineTo(15f)
        curveTo(6f, 17.357f, 6f, 18.5355f, 6.73223f, 19.2678f)
        curveTo(7.46447f, 20f, 8.64298f, 20f, 11f, 20f)
        horizontalLineTo(13f)
        curveTo(15.357f, 20f, 16.5355f, 20f, 17.2678f, 19.2678f)
        curveTo(18f, 18.5355f, 18f, 17.357f, 18f, 15f)
        verticalLineTo(9f)
        curveTo(18f, 6.64298f, 18f, 5.46447f, 17.2678f, 4.73223f)
        curveTo(16.5355f, 4f, 15.357f, 4f, 13f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17.5f)
        curveTo(2.82843f, 17.5f, 3.5f, 16.8284f, 3.5f, 16f)
        verticalLineTo(8f)
        curveTo(3.5f, 7.17157f, 2.82843f, 6.5f, 2f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.5f)
        curveTo(21.1716f, 17.5f, 20.5f, 16.8284f, 20.5f, 16f)
        verticalLineTo(8f)
        curveTo(20.5f, 7.17157f, 21.1716f, 6.5f, 22f, 6.5f)
        }
        }.build()

        return _carouselHorizontal02!!
    }

private var _carouselHorizontal02: ImageVector? = null
