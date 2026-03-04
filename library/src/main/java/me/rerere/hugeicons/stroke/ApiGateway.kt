package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ApiGateway: ImageVector
    get() {
        if (_apiGateway != null) {
            return _apiGateway!!
        }
        _apiGateway = ImageVector.Builder(
            name = "ApiGateway",
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
        moveTo(18f, 17f)
        lineTo(18f, 7f)
        lineTo(6f, 7f)
        lineTo(6f, 17f)
        lineTo(18f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17.9296f)
        lineTo(22f, 6.07037f)
        curveTo(22f, 5.5464f, 22f, 5.28442f, 21.8817f, 5.06333f)
        curveTo(21.7633f, 4.84223f, 21.5454f, 4.69691f, 21.1094f, 4.40627f)
        lineTo(19.1934f, 3.12892f)
        curveTo(19.0673f, 3.04486f, 18.9191f, 3f, 18.7676f, 3f)
        curveTo(18.3437f, 3f, 18f, 3.34366f, 18f, 3.76759f)
        lineTo(18f, 20.2324f)
        curveTo(18f, 20.6563f, 18.3437f, 21f, 18.7676f, 21f)
        curveTo(18.9191f, 21f, 19.0673f, 20.9551f, 19.1934f, 20.8711f)
        lineTo(21.1094f, 19.5937f)
        curveTo(21.5454f, 19.3031f, 21.7633f, 19.1578f, 21.8817f, 18.9367f)
        curveTo(22f, 18.7156f, 22f, 18.4536f, 22f, 17.9296f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.8906f, 19.5937f)
        curveTo(2.45463f, 19.3031f, 2.23665f, 19.1578f, 2.11833f, 18.9367f)
        curveTo(2f, 18.7156f, 2f, 18.4536f, 2f, 17.9296f)
        lineTo(2f, 6.07037f)
        curveTo(2f, 5.5464f, 2f, 5.28442f, 2.11833f, 5.06333f)
        curveTo(2.23665f, 4.84223f, 2.45463f, 4.69691f, 2.8906f, 4.40627f)
        lineTo(4.80662f, 3.12892f)
        curveTo(4.93271f, 3.04486f, 5.08087f, 3f, 5.23241f, 3f)
        curveTo(5.65634f, 3f, 6f, 3.34366f, 6f, 3.76759f)
        lineTo(6f, 20.2324f)
        curveTo(6f, 20.6563f, 5.65634f, 21f, 5.23241f, 21f)
        curveTo(5.08087f, 21f, 4.93272f, 20.9551f, 4.80663f, 20.8711f)
        lineTo(2.8906f, 19.5937f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5001f, 10.0004f)
        lineTo(14.7267f, 11.0576f)
        curveTo(15.2423f, 11.502f, 15.5001f, 11.7242f, 15.5001f, 12.0004f)
        curveTo(15.5001f, 12.2765f, 15.2423f, 12.4987f, 14.7267f, 12.9432f)
        lineTo(13.5001f, 14.0004f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 10f)
        lineTo(9.27346f, 11.0572f)
        curveTo(8.75782f, 11.5016f, 8.5f, 11.7239f, 8.5f, 12f)
        curveTo(8.5f, 12.2761f, 8.75782f, 12.4984f, 9.27346f, 12.9428f)
        lineTo(10.5f, 14f)
        }
        }.build()

        return _apiGateway!!
    }

private var _apiGateway: ImageVector? = null
