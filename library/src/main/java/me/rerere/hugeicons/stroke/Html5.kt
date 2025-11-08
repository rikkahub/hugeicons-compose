package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = ImageVector.Builder(
            name = "Html5",
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
        moveTo(16.7685f, 3f)
        horizontalLineTo(8.23147f)
        curveTo(6.06757f, 3f, 4.98562f, 3f, 4.39152f, 3.70888f)
        curveTo(3.79742f, 4.41777f, 3.9697f, 5.50319f, 4.31426f, 7.67402f)
        lineTo(5.68897f, 16.3351f)
        curveTo(5.98587f, 18.2056f, 6.416f, 18.7661f, 8.18181f, 19.4563f)
        lineTo(11.0756f, 20.5873f)
        curveTo(11.7796f, 20.8624f, 12.1316f, 21f, 12.5f, 21f)
        curveTo(12.8684f, 21f, 13.2204f, 20.8624f, 13.9244f, 20.5873f)
        lineTo(16.8182f, 19.4563f)
        curveTo(18.584f, 18.7661f, 19.0141f, 18.2056f, 19.311f, 16.3351f)
        lineTo(20.6857f, 7.67402f)
        curveTo(21.0303f, 5.50319f, 21.2026f, 4.41777f, 20.6085f, 3.70888f)
        curveTo(20.0144f, 3f, 18.9324f, 3f, 16.7685f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 8f)
        horizontalLineTo(10.5269f)
        curveTo(9.61889f, 8f, 9.43592f, 8.18899f, 9.51742f, 9.09276f)
        lineTo(9.69841f, 11.0998f)
        curveTo(9.76714f, 11.862f, 9.94159f, 12.0141f, 10.7079f, 12.0141f)
        horizontalLineTo(13.8631f)
        curveTo(14.788f, 12.0141f, 14.9719f, 12.2076f, 14.8706f, 13.1264f)
        lineTo(14.7013f, 14.6624f)
        curveTo(14.6333f, 15.2803f, 14.6139f, 15.3041f, 14.0195f, 15.5038f)
        lineTo(12.7852f, 15.9187f)
        curveTo(12.4624f, 16.0271f, 12.4565f, 16.0271f, 12.1337f, 15.9187f)
        lineTo(10.7602f, 15.4571f)
        curveTo(10.3907f, 15.3329f, 10.2668f, 15.1818f, 10.2007f, 14.8117f)
        }
        }.build()

        return _html5!!
    }

private var _html5: ImageVector? = null
